
package ttu.idu0080.ordershipmentservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for insertOrderShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertOrderShipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ryhm_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tracking_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courier_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approx_delivery_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipping_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertOrderShipment", propOrder = {
    "orderId",
    "ryhmName",
    "trackingNumber",
    "courierName",
    "approxDeliveryDate",
    "shippingPrice"
})
public class InsertOrderShipment {

    @XmlElement(name = "order_id")
    protected int orderId;
    @XmlElement(name = "ryhm_name")
    protected String ryhmName;
    @XmlElement(name = "tracking_number")
    protected String trackingNumber;
    @XmlElement(name = "courier_name")
    protected String courierName;
    @XmlElement(name = "approx_delivery_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approxDeliveryDate;
    @XmlElement(name = "shipping_price")
    protected double shippingPrice;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
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

}
