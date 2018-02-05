
package org.prosur.catalog.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.catalog.prosur.org/}ipRecord">
 *       &lt;sequence>
 *         &lt;element name="conclusionMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inventors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patentAbstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorities" type="{http://ws.catalog.prosur.org/}priority" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="registrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representativeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestCountryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technicalReportDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patent", propOrder = {
    "conclusionMethod",
    "description",
    "inventors",
    "patentAbstract",
    "priorities",
    "registrationNumber",
    "representativeName",
    "requestCountryId",
    "technicalReportDetail"
})
@XmlSeeAlso({
    DesignPatent.class,
    InventionPatent.class
})
public class Patent
    extends IpRecord
{

    @XmlElementRef(name = "conclusionMethod", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conclusionMethod;
    @XmlElementRef(name = "description", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(nillable = true)
    protected List<String> inventors;
    @XmlElementRef(name = "patentAbstract", type = JAXBElement.class, required = false)
    protected JAXBElement<String> patentAbstract;
    @XmlElement(nillable = true)
    protected List<Priority> priorities;
    @XmlElementRef(name = "registrationNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "representativeName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> representativeName;
    @XmlElementRef(name = "requestCountryId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestCountryId;
    @XmlElementRef(name = "technicalReportDetail", type = JAXBElement.class, required = false)
    protected JAXBElement<String> technicalReportDetail;

    /**
     * Gets the value of the conclusionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConclusionMethod() {
        return conclusionMethod;
    }

    /**
     * Sets the value of the conclusionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConclusionMethod(JAXBElement<String> value) {
        this.conclusionMethod = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the inventors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInventors() {
        if (inventors == null) {
            inventors = new ArrayList<String>();
        }
        return this.inventors;
    }

    /**
     * Gets the value of the patentAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatentAbstract() {
        return patentAbstract;
    }

    /**
     * Sets the value of the patentAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatentAbstract(JAXBElement<String> value) {
        this.patentAbstract = value;
    }

    /**
     * Gets the value of the priorities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Priority }
     * 
     * 
     */
    public List<Priority> getPriorities() {
        if (priorities == null) {
            priorities = new ArrayList<Priority>();
        }
        return this.priorities;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the representativeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepresentativeName() {
        return representativeName;
    }

    /**
     * Sets the value of the representativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepresentativeName(JAXBElement<String> value) {
        this.representativeName = value;
    }

    /**
     * Gets the value of the requestCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestCountryId() {
        return requestCountryId;
    }

    /**
     * Sets the value of the requestCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestCountryId(JAXBElement<String> value) {
        this.requestCountryId = value;
    }

    /**
     * Gets the value of the technicalReportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTechnicalReportDetail() {
        return technicalReportDetail;
    }

    /**
     * Sets the value of the technicalReportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTechnicalReportDetail(JAXBElement<String> value) {
        this.technicalReportDetail = value;
    }

}
