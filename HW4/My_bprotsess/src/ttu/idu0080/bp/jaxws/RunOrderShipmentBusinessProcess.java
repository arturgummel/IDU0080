
package ttu.idu0080.bp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.16
 * Wed Apr 15 12:11:22 EEST 2015
 * Generated source version: 2.6.16
 */

@XmlRootElement(name = "runOrderShipmentBusinessProcess", namespace = "http://bp.idu0080.ttu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runOrderShipmentBusinessProcess", namespace = "http://bp.idu0080.ttu/")

public class RunOrderShipmentBusinessProcess {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}
