
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ipRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ipRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="files" type="{http://ws.catalog.prosur.org/}fileData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ipRecordDetailLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRecordFilesService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRecordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nationalPresentationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nationalPublishingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="onapiId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordType" type="{http://ws.catalog.prosur.org/}ipRecordTypeEnum" minOccurs="0"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ipRecord", propOrder = {
    "applicantName",
    "applicationId",
    "files",
    "ipRecordDetailLink",
    "ipRecordFilesService",
    "ipRecordId",
    "nationalPresentationDate",
    "nationalPublishingDate",
    "onapiId",
    "recordType",
    "statusId",
    "title"
})
@XmlSeeAlso({
    Patent.class,
    DistinctiveSign.class
})
public class IpRecord {

    @XmlElement(nillable = true)
    protected List<String> applicantName;
    @XmlElementRef(name = "applicationId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationId;
    @XmlElement(nillable = true)
    protected List<FileData> files;
    @XmlElementRef(name = "ipRecordDetailLink", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipRecordDetailLink;
    @XmlElementRef(name = "ipRecordFilesService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipRecordFilesService;
    @XmlElementRef(name = "ipRecordId", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ipRecordId;
    @XmlElementRef(name = "nationalPresentationDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nationalPresentationDate;
    @XmlElementRef(name = "nationalPublishingDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nationalPublishingDate;
    @XmlElementRef(name = "onapiId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> onapiId;
    @XmlElementRef(name = "recordType", type = JAXBElement.class, required = false)
    protected JAXBElement<IpRecordTypeEnum> recordType;
    @XmlElementRef(name = "statusId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusId;
    @XmlElementRef(name = "title", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

    /**
     * Gets the value of the applicantName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicantName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicantName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicantName() {
        if (applicantName == null) {
            applicantName = new ArrayList<String>();
        }
        return this.applicantName;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationId(JAXBElement<String> value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileData }
     * 
     * 
     */
    public List<FileData> getFiles() {
        if (files == null) {
            files = new ArrayList<FileData>();
        }
        return this.files;
    }

    /**
     * Gets the value of the ipRecordDetailLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpRecordDetailLink() {
        return ipRecordDetailLink;
    }

    /**
     * Sets the value of the ipRecordDetailLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpRecordDetailLink(JAXBElement<String> value) {
        this.ipRecordDetailLink = value;
    }

    /**
     * Gets the value of the ipRecordFilesService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpRecordFilesService() {
        return ipRecordFilesService;
    }

    /**
     * Sets the value of the ipRecordFilesService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpRecordFilesService(JAXBElement<String> value) {
        this.ipRecordFilesService = value;
    }

    /**
     * Gets the value of the ipRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIpRecordId() {
        return ipRecordId;
    }

    /**
     * Sets the value of the ipRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIpRecordId(JAXBElement<Long> value) {
        this.ipRecordId = value;
    }

    /**
     * Gets the value of the nationalPresentationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNationalPresentationDate() {
        return nationalPresentationDate;
    }

    /**
     * Sets the value of the nationalPresentationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNationalPresentationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.nationalPresentationDate = value;
    }

    /**
     * Gets the value of the nationalPublishingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNationalPublishingDate() {
        return nationalPublishingDate;
    }

    /**
     * Sets the value of the nationalPublishingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNationalPublishingDate(JAXBElement<XMLGregorianCalendar> value) {
        this.nationalPublishingDate = value;
    }

    /**
     * Gets the value of the onapiId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOnapiId() {
        return onapiId;
    }

    /**
     * Sets the value of the onapiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOnapiId(JAXBElement<String> value) {
        this.onapiId = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IpRecordTypeEnum }{@code >}
     *     
     */
    public JAXBElement<IpRecordTypeEnum> getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IpRecordTypeEnum }{@code >}
     *     
     */
    public void setRecordType(JAXBElement<IpRecordTypeEnum> value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusId(JAXBElement<String> value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
