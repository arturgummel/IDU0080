
package ttu.idu0080.transportorderservice.client;

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
 * 2015-04-15T10:37:34.718+03:00
 * Generated source version: 2.6.16
 * 
 */
public final class TransportOrderService_TransportOrderServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://transportorderservice.idu0080.ttu/", "TransportOrderServiceService");

    public TransportOrderService_TransportOrderServicePort_Client() {
    }

    public String orderTransport(String offerId) throws java.lang.Exception {
        URL wsdlURL = TransportOrderServiceService.WSDL_LOCATION;
      
        TransportOrderServiceService ss = new TransportOrderServiceService(wsdlURL, SERVICE_NAME);
        TransportOrderService port = ss.getTransportOrderServicePort();  
        String _orderTransport__return = "";
        {
        _orderTransport__return = port.orderTransport(offerId);
        }
        return _orderTransport__return;
    }
}
