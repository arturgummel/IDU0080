package ee.ttu.idu0080.raamatupood.client;

import java.math.BigDecimal;
import java.util.Date;

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

import ee.ttu.idu0080.raamatupood.client.Raamatupood.MessageListenerImpl;
import ee.ttu.idu0080.raamatupood.server.EmbeddedBroker;
import ee.ttu.idu0080.raamatupood.types.Car;
import ee.ttu.idu0080.raamatupood.types.Tellimus;
import ee.ttu.idu0080.raamatupood.types.TellimuseRida;
import ee.ttu.idu0080.raamatupood.types.Toode;

/**
 * JMS sĆµnumite tootja. Ć�hendub brokeri url-ile
 * 
 * @author Allar Tammik
 * @date 08.03.2010
 */
public class Tellija {
	private static final Logger log = Logger.getLogger(Tellija.class);
	public static final String SUBJECT = "Tellimuse.edastamine"; // jĆ¤rjekorra nimi
	public static final String SUBJECT2 = "Tellimuse.vastus"; 

	private String user = ActiveMQConnection.DEFAULT_USER;// brokeri jaoks vaja
	private String password = ActiveMQConnection.DEFAULT_PASSWORD;

	long sleepTime = 1000; // 1000ms

	private int messageCount = 10;
	private long timeToLive = 1000000;
	private String url = EmbeddedBroker.URL;
	private Session session = null;
	private Destination destination = null;
	

	public static void main(String[] args) {
		Tellija producerTool = new Tellija();
		producerTool.run();
	}

	public void run() {
		Connection connection = null;
		try {
			log.info("Connecting to URL: " + url);
			log.debug("Sleeping between publish " + sleepTime + " ms");
			if (timeToLive != 0) {
				log.debug("Messages time to live " + timeToLive + " ms");
			}

			// 1. Loome Ć¼henduse
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
					user, password, url);
			connection = connectionFactory.createConnection();
			// KĆ¤ivitame yhenduse
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

			// 3. Loome teadete saatja
			MessageProducer producer = session.createProducer(destination);

			// producer.setDeliveryMode(DeliveryMode.PERSISTENT);
			producer.setTimeToLive(timeToLive);

			// 4. teadete saatmine 
			//sendLoop(session, producer);
			
			sendTellimus(session, producer);

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	/*
	protected void sendLoop(Session session, MessageProducer producer)

			throws Exception {

		for (int i = 0; i < messageCount || messageCount == 0; i++) {
			ObjectMessage objectMessage = session.createObjectMessage();
			objectMessage.setObject(new Car(5)); // peab olema Serializable
			producer.send(objectMessage);

			TextMessage message = session
					.createTextMessage(createMessageText(i));
			log.debug("Sending message: " + message.getText());
			producer.send(message);
			
			// ootab 1 sekundi
			Thread.sleep(sleepTime);
		}
	}
	*/
	protected void sendTellimus(Session session, MessageProducer producer)

			throws Exception {
		ObjectMessage objectMessage = session.createObjectMessage();
		Tellimus tellimus = new Tellimus();
		tellimus.addTellimuseRida(new TellimuseRida(new Toode(1, "HP", new BigDecimal("350.0")), 2));
		tellimus.addTellimuseRida(new TellimuseRida(new Toode(2, "Apple", new BigDecimal("1550.0")), 3));
		tellimus.addTellimuseRida(new TellimuseRida(new Toode(3, "Samsung", new BigDecimal("550.0")), 1));
		objectMessage.setObject(tellimus); // peab olema Serializable
		log.debug("Sending message: Tellimus");
		producer.send(objectMessage);
		// ootab 1 sekundi
		Thread.sleep(sleepTime);
		/*Consumer c = new Consumer();
		c.run();*/
		//producer.send(session.createTextMessage("Sending message : tellimus"));
		
		log.info("Connecting to URL: " + url);
		log.info("Consuming queue : " + SUBJECT2);
		destination = session.createQueue(SUBJECT2);
		MessageConsumer consumer = session.createConsumer(destination);

		// Kui teade vastu vĆµetakse kĆ¤ivitatakse onMessage()
		consumer.setMessageListener(new MessageListenerImpl());
	}

	

	/*private String createMessageText(int index) {
		return "Message: " + index + " sent at: " + (new Date()).toString();
	}*/
	
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
				} else {
					log.info("Received: " + message);
				}

			} catch (JMSException e) {
				log.warn("Caught: " + e);
				e.printStackTrace();
			}
		}
	}
}


