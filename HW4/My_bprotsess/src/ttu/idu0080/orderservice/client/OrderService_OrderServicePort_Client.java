
package ttu.idu0080.orderservice.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.16
 * 2015-04-15T10:40:20.681+03:00
 * Generated source version: 2.6.16
 * 
 */
public final class OrderService_OrderServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.order.idu0080.ttu/", "OrderServiceService");

    public OrderService_OrderServicePort_Client() {
    }

    public ttu.idu0080.orderservice.client.Order getOrdersByOrderId(int orderId) throws Exception {
    	URL wsdlURL = OrderServiceService.WSDL_LOCATION;
   	 	ttu.idu0080.orderservice.client.Order _getOrdersByOrderId__return = null ;

        OrderServiceService ss = new OrderServiceService(wsdlURL, SERVICE_NAME);
        OrderService port = ss.getOrderServicePort(); 

        {
        	_getOrdersByOrderId__return = port.getOrdersByOrderId(orderId);
        }
   		 return _getOrdersByOrderId__return;
   	 }

}
