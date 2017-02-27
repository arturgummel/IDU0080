
package ttu.idu0080.ordershipmentservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttu.idu0080.ordershipmentservice.client package. 
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

    private final static QName _GetOrderShipmentsByOrderIdRyhmName_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrderShipmentsByOrderIdRyhmName");
    private final static QName _GetOrderShipmentsByOrderIdRyhmNameResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "getOrderShipmentsByOrderIdRyhmNameResponse");
    private final static QName _InsertOrderShipmentResponse_QNAME = new QName("http://server.order.idu0080.ttu/", "insertOrderShipmentResponse");
    private final static QName _InsertOrderShipment_QNAME = new QName("http://server.order.idu0080.ttu/", "insertOrderShipment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttu.idu0080.ordershipmentservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertOrderShipmentResponse }
     * 
     */
    public InsertOrderShipmentResponse createInsertOrderShipmentResponse() {
        return new InsertOrderShipmentResponse();
    }

    /**
     * Create an instance of {@link GetOrderShipmentsByOrderIdRyhmNameResponse }
     * 
     */
    public GetOrderShipmentsByOrderIdRyhmNameResponse createGetOrderShipmentsByOrderIdRyhmNameResponse() {
        return new GetOrderShipmentsByOrderIdRyhmNameResponse();
    }

    /**
     * Create an instance of {@link GetOrderShipmentsByOrderIdRyhmName }
     * 
     */
    public GetOrderShipmentsByOrderIdRyhmName createGetOrderShipmentsByOrderIdRyhmName() {
        return new GetOrderShipmentsByOrderIdRyhmName();
    }

    /**
     * Create an instance of {@link InsertOrderShipment }
     * 
     */
    public InsertOrderShipment createInsertOrderShipment() {
        return new InsertOrderShipment();
    }

    /**
     * Create an instance of {@link OrderShipment }
     * 
     */
    public OrderShipment createOrderShipment() {
        return new OrderShipment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderShipmentsByOrderIdRyhmName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrderShipmentsByOrderIdRyhmName")
    public JAXBElement<GetOrderShipmentsByOrderIdRyhmName> createGetOrderShipmentsByOrderIdRyhmName(GetOrderShipmentsByOrderIdRyhmName value) {
        return new JAXBElement<GetOrderShipmentsByOrderIdRyhmName>(_GetOrderShipmentsByOrderIdRyhmName_QNAME, GetOrderShipmentsByOrderIdRyhmName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderShipmentsByOrderIdRyhmNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "getOrderShipmentsByOrderIdRyhmNameResponse")
    public JAXBElement<GetOrderShipmentsByOrderIdRyhmNameResponse> createGetOrderShipmentsByOrderIdRyhmNameResponse(GetOrderShipmentsByOrderIdRyhmNameResponse value) {
        return new JAXBElement<GetOrderShipmentsByOrderIdRyhmNameResponse>(_GetOrderShipmentsByOrderIdRyhmNameResponse_QNAME, GetOrderShipmentsByOrderIdRyhmNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrderShipmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "insertOrderShipmentResponse")
    public JAXBElement<InsertOrderShipmentResponse> createInsertOrderShipmentResponse(InsertOrderShipmentResponse value) {
        return new JAXBElement<InsertOrderShipmentResponse>(_InsertOrderShipmentResponse_QNAME, InsertOrderShipmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrderShipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.order.idu0080.ttu/", name = "insertOrderShipment")
    public JAXBElement<InsertOrderShipment> createInsertOrderShipment(InsertOrderShipment value) {
        return new JAXBElement<InsertOrderShipment>(_InsertOrderShipment_QNAME, InsertOrderShipment.class, null, value);
    }

}
