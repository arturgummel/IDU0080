
package ttu.idu0080.ordershipmentservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for orderShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderShipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approx_delivery_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="courier_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="order_shipment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ryhm_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipping_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tracking_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderShipment", propOrder = {
    "approxDeliveryDate",
    "courierName",
    "order",
    "orderShipment",
    "ryhmName",
    "shippingPrice",
    "trackingNumber"
})
public class OrderShipment {

    @XmlElement(name = "approx_delivery_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approxDeliveryDate;
    @XmlElement(name = "courier_name")
    protected String courierName;
    protected int order;
    @XmlElement(name = "order_shipment")
    protected int orderShipment;
    @XmlElement(name = "ryhm_name")
    protected String ryhmName;
    @XmlElement(name = "shipping_price")
    protected double shippingPrice;
    @XmlElement(name = "tracking_number")
    protected String trackingNumber;

    /**
     * Gets the value of the approxDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproxDeliveryDate() {
        return approxDeliveryDate;
    }

    /**
     * Sets the value of the approxDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproxDeliveryDate(XMLGregorianCalendar value) {
        this.approxDeliveryDate = value;
    }

    /**
     * Gets the value of the courierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierName() {
        return courierName;
    }

    /**
     * Sets the value of the courierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierName(String value) {
        this.courierName = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the orderShipment property.
     * 
     */
    public int getOrderShipment() {
        return orderShipment;
    }

    /**
     * Sets the value of the orderShipment property.
     * 
     */
    public void setOrderShipment(int value) {
        this.orderShipment = value;
    }

    /**
     * Gets the value of the ryhmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRyhmName() {
        return ryhmName;
    }

    /**
     * Sets the value of the ryhmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRyhmName(String value) {
        this.ryhmName = value;
    }

    /**
     * Gets the value of the shippingPrice property.
     * 
     */
    public double getShippingPrice() {
        return shippingPrice;
    }

    /**
     * Sets the value of the shippingPrice property.
     * 
     */
    public void setShippingPrice(double value) {
        this.shippingPrice = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

}
