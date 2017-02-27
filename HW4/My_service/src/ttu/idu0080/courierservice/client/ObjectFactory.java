
package ttu.idu0080.courierservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.courierservice.client package. 
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

    private final static QName _GetAllCouriersResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllCouriersResponse");
    private final static QName _GetCouriersByAddress_QNAME = new QName("http://server.order.idu0080.ttu/", "getCouriersByAddress");
    private final static QName _GetAllCouriers_QNAME = new QName("http://server.order.idu0080.ttu/", "getAllCouriers");
    private final static QName _GetCourierById_QNAME = new QName("http://server.order.idu0080.ttu/", "getCourierById");
    private final static QName _GetCouriersByAddressResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getCouriersByAddressResponse");
    private final static QName _GetCourierByIdResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getCourierByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.courierservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourierById }
     * 
     */
    public GetCourierById createGetCourierById() {
        return new GetCourierById();
    }

    /**
     * Create an instance of {@link GetAllCouriers }
     * 
     */
    public GetAllCouriers createGetAllCouriers() {
        return new GetAllCouriers();
    }

    /**
     * Create an instance of {@link GetCouriersByAddress }
     * 
     */
    public GetCouriersByAddress createGetCouriersByAddress() {
        return new GetCouriersByAddress();
    }

    /**
     * Create an instance of {@link GetAllCouriersResponse }
     * 
     */
    public GetAllCouriersResponse createGetAllCouriersResponse() {
        return new GetAllCouriersResponse();
    }

    /**
     * Create an instance of {@link GetCourierByIdResponse }
     * 
     */
    public GetCourierByIdResponse createGetCourierByIdResponse() {
        return new GetCourierByIdResponse();
    }

    /**
     * Create an instance of {@link GetCouriersByAddressResponse }
     * 
     */
    public GetCouriersByAddressResponse createGetCouriersByAddressResponse() {
        return new GetCouriersByAddressResponse();
    }

    /**
     * Create an instance of {@link EntAddress }
     * 
     */
    public EntAddress createEntAddress() {
        return new EntAddress();
    }

    /**
     * Create an instance of {@link Courier }
     * 
     */
    public Courier createCourier() {
        return new Courier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCouriersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllCouriersResponse")
    public JAXBElement<GetAllCouriersResponse> createGetAllCouriersResponse(GetAllCouriersResponse value) {
        return new JAXBElement<GetAllCouriersResponse>(_GetAllCouriersResponse_QNAME, GetAllCouriersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouriersByAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCouriersByAddress")
    public JAXBElement<GetCouriersByAddress> createGetCouriersByAddress(GetCouriersByAddress value) {
        return new JAXBElement<GetCouriersByAddress>(_GetCouriersByAddress_QNAME, GetCouriersByAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCouriers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getAllCouriers")
    public JAXBElement<GetAllCouriers> createGetAllCouriers(GetAllCouriers value) {
        return new JAXBElement<GetAllCouriers>(_GetAllCouriers_QNAME, GetAllCouriers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCourierById")
    public JAXBElement<GetCourierById> createGetCourierById(GetCourierById value) {
        return new JAXBElement<GetCourierById>(_GetCourierById_QNAME, GetCourierById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouriersByAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCouriersByAddressResponse")
    public JAXBElement<GetCouriersByAddressResponse> createGetCouriersByAddressResponse(GetCouriersByAddressResponse value) {
        return new JAXBElement<GetCouriersByAddressResponse>(_GetCouriersByAddressResponse_QNAME, GetCouriersByAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourierByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getCourierByIdResponse")
    public JAXBElement<GetCourierByIdResponse> createGetCourierByIdResponse(GetCourierByIdResponse value) {
        return new JAXBElement<GetCourierByIdResponse>(_GetCourierByIdResponse_QNAME, GetCourierByIdResponse.class, null, value);
    }

}
