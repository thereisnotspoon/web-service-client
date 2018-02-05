
package org.prosur.catalog.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipRecord" type="{http://ws.catalog.prosur.org/}ipRecord" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createRecord", propOrder = {
    "ipRecord",
    "user"
})
public class CreateRecord {

    protected IpRecord ipRecord;
    protected String user;

    /**
     * Gets the value of the ipRecord property.
     * 
     * @return
     *     possible object is
     *     {@link IpRecord }
     *     
     */
    public IpRecord getIpRecord() {
        return ipRecord;
    }

    /**
     * Sets the value of the ipRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRecord }
     *     
     */
    public void setIpRecord(IpRecord value) {
        this.ipRecord = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
