package ttu.idu0080.offerservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.16
 * 2015-04-15T10:36:58.929+03:00
 * Generated source version: 2.6.16
 * 
 */
@WebServiceClient(name = "OfferServiceService", 
                  wsdlLocation = "http://localhost:8080/My_service/services/OfferServicePort?wsdl",
                  targetNamespace = "http://offerservice.idu0080.ttu/") 
public class OfferServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://offerservice.idu0080.ttu/", "OfferServiceService");
    public final static QName OfferServicePort = new QName("http://offerservice.idu0080.ttu/", "OfferServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/My_service/services/OfferServicePort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OfferServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/My_service/services/OfferServicePort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OfferServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OfferServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OfferServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OfferServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OfferServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OfferServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns OfferService
     */
    @WebEndpoint(name = "OfferServicePort")
    public OfferService getOfferServicePort() {
        return super.getPort(OfferServicePort, OfferService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OfferService
     */
    @WebEndpoint(name = "OfferServicePort")
    public OfferService getOfferServicePort(WebServiceFeature... features) {
        return super.getPort(OfferServicePort, OfferService.class, features);
    }

}
