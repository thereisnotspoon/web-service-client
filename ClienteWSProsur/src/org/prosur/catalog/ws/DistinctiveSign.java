
package org.prosur.catalog.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for distinctiveSign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distinctiveSign">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.catalog.prosur.org/}ipRecord">
 *       &lt;sequence>
 *         &lt;element name="distinctiveSignType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="logoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="niceClasses" type="{http://ws.catalog.prosur.org/}niceClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="presentationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distinctiveSign", propOrder = {
    "distinctiveSignType",
    "expiration",
    "logoDescription",
    "niceClasses",
    "presentationType",
    "registrationDate"
})
public class DistinctiveSign
    extends IpRecord
{

    @XmlElementRef(name = "distinctiveSignType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distinctiveSignType;
    @XmlElementRef(name = "expiration", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiration;
    @XmlElementRef(name = "logoDescription", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logoDescription;
    @XmlElement(nillable = true)
    protected List<NiceClass> niceClasses;
    @XmlElementRef(name = "presentationType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> presentationType;
    @XmlElementRef(name = "registrationDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> registrationDate;

    /**
     * Gets the value of the distinctiveSignType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistinctiveSignType() {
        return distinctiveSignType;
    }

    /**
     * Sets the value of the distinctiveSignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistinctiveSignType(JAXBElement<String> value) {
        this.distinctiveSignType = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiration(JAXBElement<XMLGregorianCalendar> value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the logoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogoDescription() {
        return logoDescription;
    }

    /**
     * Sets the value of the logoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogoDescription(JAXBElement<String> value) {
        this.logoDescription = value;
    }

    /**
     * Gets the value of the niceClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the niceClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNiceClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NiceClass }
     * 
     * 
     */
    public List<NiceClass> getNiceClasses() {
        if (niceClasses == null) {
            niceClasses = new ArrayList<NiceClass>();
        }
        return this.niceClasses;
    }

    /**
     * Gets the value of the presentationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPresentationType() {
        return presentationType;
    }

    /**
     * Sets the value of the presentationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPresentationType(JAXBElement<String> value) {
        this.presentationType = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRegistrationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.registrationDate = value;
    }

}
