
package org.prosur.catalog.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for inventionPatent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventionPatent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.catalog.prosur.org/}patent">
 *       &lt;sequence>
 *         &lt;element name="internationalClassification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pctApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="pctApplicationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventionPatent", propOrder = {
    "internationalClassification",
    "patentTypeId",
    "pctApplicationDate",
    "pctApplicationNumber"
})
public class InventionPatent
    extends Patent
{

    @XmlElement(nillable = true)
    protected List<String> internationalClassification;
    @XmlElementRef(name = "patentTypeId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> patentTypeId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pctApplicationDate;
    @XmlElementRef(name = "pctApplicationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pctApplicationNumber;

    /**
     * Gets the value of the internationalClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternationalClassification() {
        if (internationalClassification == null) {
            internationalClassification = new ArrayList<String>();
        }
        return this.internationalClassification;
    }

    /**
     * Gets the value of the patentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatentTypeId() {
        return patentTypeId;
    }

    /**
     * Sets the value of the patentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatentTypeId(JAXBElement<String> value) {
        this.patentTypeId = value;
    }

    /**
     * Gets the value of the pctApplicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPctApplicationDate() {
        return pctApplicationDate;
    }

    /**
     * Sets the value of the pctApplicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPctApplicationDate(XMLGregorianCalendar value) {
        this.pctApplicationDate = value;
    }

    /**
     * Gets the value of the pctApplicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPctApplicationNumber() {
        return pctApplicationNumber;
    }

    /**
     * Sets the value of the pctApplicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPctApplicationNumber(JAXBElement<String> value) {
        this.pctApplicationNumber = value;
    }

}
