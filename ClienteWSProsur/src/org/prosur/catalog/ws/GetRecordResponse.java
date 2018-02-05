
package org.prosur.catalog.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRecordResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRecordResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ipRecordResult" type="{http://ws.catalog.prosur.org/}ipRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecordResponse", propOrder = {
    "ipRecordResult"
})
public class GetRecordResponse {

    protected IpRecord ipRecordResult;

    /**
     * Gets the value of the ipRecordResult property.
     * 
     * @return
     *     possible object is
     *     {@link IpRecord }
     *     
     */
    public IpRecord getIpRecordResult() {
        return ipRecordResult;
    }

    /**
     * Sets the value of the ipRecordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRecord }
     *     
     */
    public void setIpRecordResult(IpRecord value) {
        this.ipRecordResult = value;
    }

}
