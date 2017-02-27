package ee.ttu.idu0080.raamatupood.client;

import java.math.BigDecimal;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;

import ee.ttu.idu0080.raamatupood.server.EmbeddedBroker;
import ee.ttu.idu0080.raamatupood.types.Tellimus;
import ee.ttu.idu0080.raamatupood.types.TellimuseRida;

/**
 * JMS sĆµnumite tarbija. Ć�hendub broker-i urlile
 * 
 * @author Allar Tammik
 * @date 08.03.2010
 */
public class Raamatupood {
	private static final Logger log = Logger.getLogger(Raamatupood.class);
	//private String SUBJECT = "Tekstide.saatmine";
	private String SUBJECT = "Tellimuse.edastamine";
	private String SUBJECT2 = "Tellimuse.vastus";
	private String user = ActiveMQConnection.DEFAULT_USER;
	private String password = ActiveMQConnection.DEFAULT_PASSWORD;
	private String url = EmbeddedBroker.URL;
	private Session session = null;
	private Destination destination = null;

	public static void main(String[] args) {
		Raamatupood consumerTool = new Raamatupood();
		consumerTool.run();
	}

	public void run() {
		Connection connection = null;
		try {
			log.info("Connecting to URL: " + url);
			log.info("Consuming queue : " + SUBJECT);

			// 1. Loome Ć¼henduse
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					user, password, url);
			connection = connectionFactory.createConnection();

			// Kui Ć¼hendus kaob, lĆµpetatakse Consumeri tĆ¶Ć¶ veateatega.
			connection.setExceptionListener(new ExceptionListenerImpl());

			// KĆ¤ivitame Ć¼henduse
			connection.start();

			// 2. Loome sessiooni
			/*
			 * createSession vĆµtab 2 argumenti: 1. kas saame kasutada
			 * transaktsioone 2. automaatne kinnitamine
			 */
			session = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);

			// Loome teadete sihtkoha (jĆ¤rjekorra). Parameetriks jĆ¤rjekorra nimi
			destination = session.createQueue(SUBJECT);

			// 3. Teadete vastuvĆµtja
			MessageConsumer consumer = session.createConsumer(destination);

			// Kui teade vastu vĆµetakse kĆ¤ivitatakse onMessage()
			consumer.setMessageListener(new MessageListenerImpl());

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	/**
	 * KĆ¤ivitatakse, kui tuleb sĆµnum
	 */
	class MessageListenerImpl implements javax.jms.MessageListener {

		public void onMessage(Message message) {
			try {
				
				if (message instanceof TextMessage) {
					TextMessage txtMsg = (TextMessage) message;
					String msg = txtMsg.getText();
					log.info("Received: " + msg);
				} else if (message instanceof ObjectMessage) {
					ObjectMessage objectMessage = (ObjectMessage) message;
					//String msg = objectMessage.getObject().toString();
					Tellimus tellimus = (Tellimus) objectMessage.getObject();
					int count = 0;
					BigDecimal summa = BigDecimal.ZERO;
					for(TellimuseRida tr : tellimus.getTellimuseRead()) {
						log.info("Received toode: " + tr.getToode().getNimetus());
						log.info("id: " + tr.getToode().getKood());
						log.info("hind: " + tr.getToode().getHind());
						log.info("kogus: " + tr.getKogus());
						count++;
						BigDecimal itemAmount = new BigDecimal(tr.getKogus()+"");
						BigDecimal price = new BigDecimal(tr.getToode().getHind()+"");
						price = price.multiply(itemAmount);
						summa = summa.add(price);
						
					}
					log.info("Recieved: " + count);
					String msg = "Toodete arv kokku " + count + " summa kokku " + summa.toString();
					
					destination = session.createQueue(SUBJECT2);
					
					MessageProducer producer = session.createProducer(destination);
					try {
						sendAnswer(session, producer, msg);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					log.info("Received: " + message);
				}

			} catch (JMSException e) {
				log.warn("Caught: " + e);
				e.printStackTrace();
			}
		}
	}
	protected void sendAnswer(Session session, MessageProducer producer, String msg)

			throws Exception {
		//sendAnswer() mis saadab queue-sse „tellimuse.vastus“ tellimuse kogusumma ja tellitud toodete arvu. 
		TextMessage message = session
				.createTextMessage(msg);
		log.debug("Sending message: " + message.getText());
		producer.send(message);

	}

	/**
	 * KĆ¤ivitatakse, kui tuleb viga.
	 */
	class ExceptionListenerImpl implements javax.jms.ExceptionListener {

		public synchronized void onException(JMSException ex) {
			log.error("JMS Exception occured. Shutting down client.");
			ex.printStackTrace();
		}
	}

}