
package ttu.idu0080.ordershipmentservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrderShipmentsByOrderIdRyhmName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrderShipmentsByOrderIdRyhmName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ryhm_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderShipmentsByOrderIdRyhmName", propOrder = {
    "orderId",
    "ryhmName"
})
public class GetOrderShipmentsByOrderIdRyhmName {

    @XmlElement(name = "order_id")
    protected int orderId;
    @XmlElement(name = "ryhm_name")
    protected String ryhmName;

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

}
