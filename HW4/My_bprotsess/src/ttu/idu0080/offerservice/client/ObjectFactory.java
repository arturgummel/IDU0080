
package ttu.idu0080.offerservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.offerservice.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetOffer_QNAME = new QName("http://offerservice.idu0080.ttu/", "getOffer");
    private final static QName _GetOfferResponse_QNAME = new QName("http://offerservice.idu0080.ttu/", "getOfferResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.offerservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOffer }
     * 
     */
    public GetOffer createGetOffer() {
        return new GetOffer();
    }

    /**
     * Create an instance of {@link GetOfferResponse }
     * 
     */
    public GetOfferResponse createGetOfferResponse() {
        return new GetOfferResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link EntAddress }
     * 
     */
    public EntAddress createEntAddress() {
        return new EntAddress();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://offerservice.idu0080.ttu/", name = "getOffer")
    public JAXBElement<GetOffer> createGetOffer(GetOffer value) {
        return new JAXBElement<GetOffer>(_GetOffer_QNAME, GetOffer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOfferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://offerservice.idu0080.ttu/", name = "getOfferResponse")
    public JAXBElement<GetOfferResponse> createGetOfferResponse(GetOfferResponse value) {
        return new JAXBElement<GetOfferResponse>(_GetOfferResponse_QNAME, GetOfferResponse.class, null, value);
    }

}
