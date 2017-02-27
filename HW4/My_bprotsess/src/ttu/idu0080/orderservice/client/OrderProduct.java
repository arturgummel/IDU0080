
package ttu.idu0080.orderservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order_product" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="price_total" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="product_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderProduct", propOrder = {
    "orderProduct",
    "price",
    "priceTotal",
    "productCount",
    "productName"
})
public class OrderProduct {

    @XmlElement(name = "order_product")
    protected int orderProduct;
    protected float price;
    @XmlElement(name = "price_total")
    protected float priceTotal;
    @XmlElement(name = "product_count")
    protected int productCount;
    @XmlElement(name = "product_name")
    protected String productName;

    /**
     * Gets the value of the orderProduct property.
     * 
     */
    public int getOrderProduct() {
        return orderProduct;
    }

    /**
     * Sets the value of the orderProduct property.
     * 
     */
    public void setOrderProduct(int value) {
        this.orderProduct = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceTotal property.
     * 
     */
    public float getPriceTotal() {
        return priceTotal;
    }

    /**
     * Sets the value of the priceTotal property.
     * 
     */
    public void setPriceTotal(float value) {
        this.priceTotal = value;
    }

    /**
     * Gets the value of the productCount property.
     * 
     */
    public int getProductCount() {
        return productCount;
    }

    /**
     * Sets the value of the productCount property.
     * 
     */
    public void setProductCount(int value) {
        this.productCount = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
