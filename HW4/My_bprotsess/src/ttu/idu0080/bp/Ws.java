package ttu.idu0080.bp;

import javax.jws.WebService;

import org.apache.log4j.Logger;


@WebService(targetNamespace = "http://bp.idu0080.ttu/", portName = "WsPort", serviceName = "WsService")
public class Ws {
	
	public static Logger logger = Logger.getLogger(Ws.class);
	
	public void runOrderShipmentBusinessProcess(int order_id) {
		logger.info("Protsessi algus");
		logger.info("----------------");
		
		//int order_id = 0;		
		
		System.out.println("ORDER ID: " + order_id);
		
		BusinessProcess bp =new BusinessProcess();
		bp.setOrderId(order_id);
		bp.getTrasnportOfferToOrder();
		
		logger.info("Protsessi lxpp");
		logger.info("----------------");
		
	}
}
