
package org.prosur.catalog.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for priority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priorityCountryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="priorityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priority", propOrder = {
    "priorityCountryId",
    "priorityDate",
    "priorityNumber"
})
public class Priority {

    protected String priorityCountryId;
    @XmlElementRef(name = "priorityDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> priorityDate;
    @XmlElementRef(name = "priorityNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priorityNumber;

    /**
     * Gets the value of the priorityCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCountryId() {
        return priorityCountryId;
    }

    /**
     * Sets the value of the priorityCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCountryId(String value) {
        this.priorityCountryId = value;
    }

    /**
     * Gets the value of the priorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPriorityDate() {
        return priorityDate;
    }

    /**
     * Sets the value of the priorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPriorityDate(JAXBElement<XMLGregorianCalendar> value) {
        this.priorityDate = value;
    }

    /**
     * Gets the value of the priorityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Sets the value of the priorityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriorityNumber(JAXBElement<String> value) {
        this.priorityNumber = value;
    }

}
