
package ttu.idu0080.ordershipmentservice.client;

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
 * 2015-04-15T10:39:43.661+03:00
 * Generated source version: 2.6.16
 * 
 */
public final class OrderShipmentService_OrderShipmentServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.order.idu0080.ttu/", "OrderShipmentServiceService");

    public OrderShipmentService_OrderShipmentServicePort_Client() {
    }

    public int orderShipment(int orderId, String ryhmName, String trackingNumber, String courierName, double shippingPrice, int days) throws java.lang.Exception {
        URL wsdlURL = OrderShipmentServiceService.WSDL_LOCATION;
        
        OrderShipmentServiceService ss = new OrderShipmentServiceService(wsdlURL, SERVICE_NAME);
        OrderShipmentService port = ss.getOrderShipmentServicePort();  
        int _insertOrderShipment__return = 0;
        {

        //javax.xml.datatype.XMLGregorianCalendar _insertOrderShipment_approxDeliveryDate = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2015-04-14T22:53:35.083+03:00");
        
        java.util.GregorianCalendar c = new java.util.GregorianCalendar();
        c.setTime(new java.util.Date());
        c.add(java.util.Calendar.DATE, days);
        javax.xml.datatype.XMLGregorianCalendar _insertOrderShipment_approxDeliveryDate = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        
        _insertOrderShipment__return = port.insertOrderShipment(orderId, ryhmName, trackingNumber, courierName, _insertOrderShipment_approxDeliveryDate, shippingPrice);
        }
       
        return _insertOrderShipment__return;
    }

}
