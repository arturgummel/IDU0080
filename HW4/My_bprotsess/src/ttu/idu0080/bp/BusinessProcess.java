package ttu.idu0080.bp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;


public class BusinessProcess {
	
	public static Logger logger = Logger.getLogger(BusinessProcess.class);

	private int orderId = 0;
	private String ryhmName = "Olmar";
	private String courierName = "";
	private String trackingNumber = "";

	
	ttu.idu0080.offerservice.client.Offer bestOffer = null;
	ttu.idu0080.mycourierservice.client.Courier bestCourier = null;
	
	public void setOrderId(int id) {
		orderId = id;
	}
	// method runs business process
	public void getTrasnportOfferToOrder(){
		ttu.idu0080.orderservice.client.Order order = getOrdersByOrderId(orderId);
		
		List<ttu.idu0080.offerservice.client.Offer> offers = new ArrayList<ttu.idu0080.offerservice.client.Offer>();
		List<ttu.idu0080.mycourierservice.client.Courier> couriers = getCouriers() ;
		for(ttu.idu0080.mycourierservice.client.Courier courier : couriers) {
			ttu.idu0080.offerservice.client.Offer currentOffer = getOffer(courier.getCourierId(), order);
			offers.add(currentOffer);
		}
		logger.info("order_id: " +orderId +" order price: "+order.getPriceTotal()+" recieved "+offers.size() +" offers");
		logger.info("-------------------------------");
		
		findBestOffer(offers,couriers);
		logger.info("-------------------------------");
		logger.info("Selected offer: courier:["+bestCourier.getName()+"] offer id: ["
				+bestOffer.getOfferId()+"] offer price: ["+bestOffer.getPrice()+"]\n");
		
		orderTransport(bestOffer.getOfferId());
		logger.info("Tracking number: " + trackingNumber);
		
		logger.info("Order shipment id: " + orderShipment());
	}
	
	public void findBestOffer(List<ttu.idu0080.offerservice.client.Offer> offers, 
		List<ttu.idu0080.mycourierservice.client.Courier> couriers){
		double bestOfferPercent = 0;
		int jk = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		for (ttu.idu0080.offerservice.client.Offer offer : offers) {
			Calendar c = Calendar.getInstance();
			c.setTime(new Date()); // Now use today date.
			c.add(Calendar.DATE, offer.getDeliveryDate());
			double evaluatedOffer = evaluateOffer(offer.getPrice(), offer.getDeliveryDate());
			logger.info("rank:["+evaluatedOffer+"] Courier: [" +couriers.get(jk).getName()+"]"
					+ "Transport offer price:[" +offer.getPrice()+"] days:["+offer.getDeliveryDate()+"] "
							+ "approximate delivery date ["+sdf.format(c.getTime())+"]");
			
			if(bestOfferPercent == 0 || bestOfferPercent > evaluatedOffer) {
				bestOfferPercent = evaluatedOffer;
				bestOffer = offer;
				bestCourier = couriers.get(jk);
				courierName = couriers.get(jk).getName();
			}
			jk++;
		}
	}
	//Pakkumise headus = transpordi hind * 0.01 * kohaletoimetamise paevade arv
	public double evaluateOffer(float shippingPrice, int dayAmmount) {
		return shippingPrice * 0.01 * dayAmmount;
	}
	// get order
	public ttu.idu0080.orderservice.client.Order getOrdersByOrderId(int id) {
		ttu.idu0080.orderservice.client.OrderService_OrderServicePort_Client TundTtuEeOrderServiceClient = new
				ttu.idu0080.orderservice.client.OrderService_OrderServicePort_Client();
		ttu.idu0080.orderservice.client.Order order = null;
		try {
			order = TundTtuEeOrderServiceClient.getOrdersByOrderId(id) ;
		 } catch (Exception e) {
		 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	return order ;
	 } 
	
	// get all couriers
	public List<ttu.idu0080.mycourierservice.client.Courier> getCouriers() {
		ttu.idu0080.mycourierservice.client.CourierService_CourierServicePort_Client myCourierServiceClient = new
				ttu.idu0080.mycourierservice.client.CourierService_CourierServicePort_Client();
		List<ttu.idu0080.mycourierservice.client.Courier> couriers  = null;
		try {
			couriers = myCourierServiceClient.getCouriers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return couriers;
	}
	
	// get offer
	public ttu.idu0080.offerservice.client.Offer getOffer(int courierId, ttu.idu0080.orderservice.client.Order order) {
		ttu.idu0080.offerservice.client.Offer offer = null;
		
		ttu.idu0080.offerservice.client.OfferService_OfferServicePort_Client offerServiceClient = new
				ttu.idu0080.offerservice.client.OfferService_OfferServicePort_Client();
			
		ttu.idu0080.offerservice.client.Order _getOffer_order = new ttu.idu0080.offerservice.client.Order();
		ttu.idu0080.orderservice.client.Address shippingAddress = order.getShippingAddress();
        ttu.idu0080.offerservice.client.Address _getOffer_orderShippingAddress = new ttu.idu0080.offerservice.client.Address();
        _getOffer_orderShippingAddress.setAddress(shippingAddress.getAddress());
        _getOffer_orderShippingAddress.setCountry(shippingAddress.getCountry());
        _getOffer_orderShippingAddress.setCounty(shippingAddress.getCounty());
        _getOffer_orderShippingAddress.setStreetAddress(shippingAddress.getStreetAddress());
        _getOffer_orderShippingAddress.setTownVillage(shippingAddress.getTownVillage());
        _getOffer_orderShippingAddress.setZipcode(shippingAddress.getZipcode());
        _getOffer_order.setShippingAddress(_getOffer_orderShippingAddress);
        
        
        //!!!!!!!!CHANGE
        _getOffer_order.setPriceTotal(100);
        
        ttu.idu0080.offerservice.client.Seller _getOffer_orderSeller = new ttu.idu0080.offerservice.client.Seller();
        ttu.idu0080.orderservice.client.Seller seller = order.getSeller();
        java.util.List<ttu.idu0080.offerservice.client.EntAddress> _getOffer_orderSellerAddresses = new java.util.ArrayList<ttu.idu0080.offerservice.client.EntAddress>();
        for (ttu.idu0080.orderservice.client.EntAddress entAddress : seller.getAddresses()) {
        	ttu.idu0080.offerservice.client.EntAddress _getOffer_orderSellerAddressesVal1 = new ttu.idu0080.offerservice.client.EntAddress();
            _getOffer_orderSellerAddressesVal1.setAddress(entAddress.getAddress());
            _getOffer_orderSellerAddressesVal1.setCountry(entAddress.getCountry());
            _getOffer_orderSellerAddressesVal1.setCounty(entAddress.getCounty());
            _getOffer_orderSellerAddressesVal1.setStreetAddress(entAddress.getStreetAddress());
            _getOffer_orderSellerAddressesVal1.setTownVillage(entAddress.getTownVillage());
            _getOffer_orderSellerAddressesVal1.setZipcode(entAddress.getZipcode());
            _getOffer_orderSellerAddresses.add(_getOffer_orderSellerAddressesVal1);
     
		}
        _getOffer_orderSeller.getAddresses().addAll(_getOffer_orderSellerAddresses);
        _getOffer_order.setSeller(_getOffer_orderSeller);
		
		try {
			offer = offerServiceClient.getOffer(courierId, _getOffer_order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return offer;
	}
	
	public void orderTransport(String offerId) {
		ttu.idu0080.transportorderservice.client.TransportOrderService_TransportOrderServicePort_Client transportClient = new
				ttu.idu0080.transportorderservice.client.TransportOrderService_TransportOrderServicePort_Client();

		try {
			trackingNumber = transportClient.orderTransport(offerId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public int orderShipment() {
		ttu.idu0080.ordershipmentservice.client.OrderShipmentService_OrderShipmentServicePort_Client shipmentClient = new 
				ttu.idu0080.ordershipmentservice.client.OrderShipmentService_OrderShipmentServicePort_Client();

		int returnVal = 0;
		try {
			returnVal = shipmentClient.orderShipment(orderId, ryhmName, trackingNumber, courierName, bestOffer.getPrice(), bestOffer.getDeliveryDate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return returnVal;
	}
	
}
