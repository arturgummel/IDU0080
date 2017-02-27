package ttu.idu0080.bp;

import org.apache.log4j.Logger;

public class Test {
	
	public static Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) throws Exception{

		logger.info("Protsessi algus");
		logger.info("----------------");
		
		int order_id = 2;
		if(args.length == 0) {
			order_id = 1;
		} else {
			order_id = Integer.parseInt(args[0]);
		}
		
		System.out.println("ORDER ID: " + order_id);
		
		BusinessProcess bp =new BusinessProcess();
		bp.setOrderId(order_id);
		bp.getTrasnportOfferToOrder();
		
		logger.info("Protsessi lxpp");
		logger.info("----------------");
	}
}
