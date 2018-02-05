
package org.prosur.catalog.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.prosur.catalog.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CatalogFault_QNAME = new QName("http://ws.catalog.prosur.org/", "CatalogFault");
    private final static QName _GetRecordResponse_QNAME = new QName("http://ws.catalog.prosur.org/", "getRecordResponse");
    private final static QName _RemoveRecordResponse_QNAME = new QName("http://ws.catalog.prosur.org/", "removeRecordResponse");
    private final static QName _CreateRecord_QNAME = new QName("http://ws.catalog.prosur.org/", "createRecord");
    private final static QName _RemoveRecord_QNAME = new QName("http://ws.catalog.prosur.org/", "removeRecord");
    private final static QName _CreateRecordResponse_QNAME = new QName("http://ws.catalog.prosur.org/", "createRecordResponse");
    private final static QName _GetRecord_QNAME = new QName("http://ws.catalog.prosur.org/", "getRecord");
    private final static QName _PriorityPriorityNumber_QNAME = new QName("", "priorityNumber");
    private final static QName _PriorityPriorityDate_QNAME = new QName("", "priorityDate");
    private final static QName _IpRecordOnapiId_QNAME = new QName("", "onapiId");
    private final static QName _IpRecordIpRecordDetailLink_QNAME = new QName("", "ipRecordDetailLink");
    private final static QName _IpRecordStatusId_QNAME = new QName("", "statusId");
    private final static QName _IpRecordIpRecordId_QNAME = new QName("", "ipRecordId");
    private final static QName _IpRecordRecordType_QNAME = new QName("", "recordType");
    private final static QName _IpRecordNationalPublishingDate_QNAME = new QName("", "nationalPublishingDate");
    private final static QName _IpRecordApplicationId_QNAME = new QName("", "applicationId");
    private final static QName _IpRecordTitle_QNAME = new QName("", "title");
    private final static QName _IpRecordIpRecordFilesService_QNAME = new QName("", "ipRecordFilesService");
    private final static QName _IpRecordNationalPresentationDate_QNAME = new QName("", "nationalPresentationDate");
    private final static QName _InventionPatentPatentTypeId_QNAME = new QName("", "patentTypeId");
    private final static QName _InventionPatentPctApplicationNumber_QNAME = new QName("", "pctApplicationNumber");
    private final static QName _DistinctiveSignDistinctiveSignType_QNAME = new QName("", "distinctiveSignType");
    private final static QName _DistinctiveSignRegistrationDate_QNAME = new QName("", "registrationDate");
    private final static QName _DistinctiveSignLogoDescription_QNAME = new QName("", "logoDescription");
    private final static QName _DistinctiveSignExpiration_QNAME = new QName("", "expiration");
    private final static QName _DistinctiveSignPresentationType_QNAME = new QName("", "presentationType");
    private final static QName _PatentTechnicalReportDetail_QNAME = new QName("", "technicalReportDetail");
    private final static QName _PatentConclusionMethod_QNAME = new QName("", "conclusionMethod");
    private final static QName _PatentPatentAbstract_QNAME = new QName("", "patentAbstract");
    private final static QName _PatentRegistrationNumber_QNAME = new QName("", "registrationNumber");
    private final static QName _PatentDescription_QNAME = new QName("", "description");
    private final static QName _PatentRequestCountryId_QNAME = new QName("", "requestCountryId");
    private final static QName _PatentRepresentativeName_QNAME = new QName("", "representativeName");
    private final static QName _DesignPatentDesignClassification_QNAME = new QName("", "designClassification");
    private final static QName _DesignPatentMainDesignImage_QNAME = new QName("", "mainDesignImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.prosur.catalog.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogFault }
     * 
     */
    public CatalogFault createCatalogFault() {
        return new CatalogFault();
    }

    /**
     * Create an instance of {@link GetRecordResponse }
     * 
     */
    public GetRecordResponse createGetRecordResponse() {
        return new GetRecordResponse();
    }

    /**
     * Create an instance of {@link RemoveRecordResponse }
     * 
     */
    public RemoveRecordResponse createRemoveRecordResponse() {
        return new RemoveRecordResponse();
    }

    /**
     * Create an instance of {@link CreateRecord }
     * 
     */
    public CreateRecord createCreateRecord() {
        return new CreateRecord();
    }

    /**
     * Create an instance of {@link RemoveRecord }
     * 
     */
    public RemoveRecord createRemoveRecord() {
        return new RemoveRecord();
    }

    /**
     * Create an instance of {@link CreateRecordResponse }
     * 
     */
    public CreateRecordResponse createCreateRecordResponse() {
        return new CreateRecordResponse();
    }

    /**
     * Create an instance of {@link GetRecord }
     * 
     */
    public GetRecord createGetRecord() {
        return new GetRecord();
    }

    /**
     * Create an instance of {@link Patent }
     * 
     */
    public Patent createPatent() {
        return new Patent();
    }

    /**
     * Create an instance of {@link DesignPatent }
     * 
     */
    public DesignPatent createDesignPatent() {
        return new DesignPatent();
    }

    /**
     * Create an instance of {@link FileData }
     * 
     */
    public FileData createFileData() {
        return new FileData();
    }

    /**
     * Create an instance of {@link Priority }
     * 
     */
    public Priority createPriority() {
        return new Priority();
    }

    /**
     * Create an instance of {@link CatalogFaultMessage }
     * 
     */
    public CatalogFaultMessage createCatalogFaultMessage() {
        return new CatalogFaultMessage();
    }

    /**
     * Create an instance of {@link InventionPatent }
     * 
     */
    public InventionPatent createInventionPatent() {
        return new InventionPatent();
    }

    /**
     * Create an instance of {@link NiceClass }
     * 
     */
    public NiceClass createNiceClass() {
        return new NiceClass();
    }

    /**
     * Create an instance of {@link IpRecord }
     * 
     */
    public IpRecord createIpRecord() {
        return new IpRecord();
    }

    /**
     * Create an instance of {@link DistinctiveSign }
     * 
     */
    public DistinctiveSign createDistinctiveSign() {
        return new DistinctiveSign();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.catalog.prosur.org/", name = "CatalogFault")
    public JAXBElement<CatalogFault> createCatalogFault(CatalogFault value) {
        return new JAXBElement<CatalogFault>(_CatalogFault_QNAME, CatalogFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.catalog.prosur.org/", name = "getRecordResponse")
    public JAXBElement<GetRecordResponse> createGetRecordResponse(GetRecordResponse value) {
        return new JAXBElement<GetRecordResponse>(_GetRecordResponse_QNAME, GetRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.catalog.prosur.org/", name = "removeRecordResponse")
    public JAXBElement<RemoveRecordResponse> createRemoveRecordResponse(RemoveRecordResponse value) {
        return new JAXBElement<RemoveRecordResponse>(_RemoveRecordResponse_QNAME, RemoveRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.catalog.prosur.org/", name = "createRecord")
    public JAXBElement<CreateRecord> createCreateRecord(CreateRecord value) {
        return new JAXBElement<CreateRecord>(_CreateRecord_QNAME, CreateRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.catalog.prosur.org/", name = "removeRecord")
    public JAXBElement<RemoveRecord> createRemoveRecord(RemoveRecord value) {
        return new JAXBElement<RemoveRecord>(_RemoveRecord_QNAME, RemoveRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.catalog.prosur.org/", name = "createRecordResponse")
    public JAXBElement<CreateRecordResponse> createCreateRecordResponse(CreateRecordResponse value) {
        return new JAXBElement<CreateRecordResponse>(_CreateRecordResponse_QNAME, CreateRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.catalog.prosur.org/", name = "getRecord")
    public JAXBElement<GetRecord> createGetRecord(GetRecord value) {
        return new JAXBElement<GetRecord>(_GetRecord_QNAME, GetRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "priorityNumber", scope = Priority.class)
    public JAXBElement<String> createPriorityPriorityNumber(String value) {
        return new JAXBElement<String>(_PriorityPriorityNumber_QNAME, String.class, Priority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "priorityDate", scope = Priority.class)
    public JAXBElement<XMLGregorianCalendar> createPriorityPriorityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PriorityPriorityDate_QNAME, XMLGregorianCalendar.class, Priority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "onapiId", scope = IpRecord.class)
    public JAXBElement<String> createIpRecordOnapiId(String value) {
        return new JAXBElement<String>(_IpRecordOnapiId_QNAME, String.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ipRecordDetailLink", scope = IpRecord.class)
    public JAXBElement<String> createIpRecordIpRecordDetailLink(String value) {
        return new JAXBElement<String>(_IpRecordIpRecordDetailLink_QNAME, String.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statusId", scope = IpRecord.class)
    public JAXBElement<String> createIpRecordStatusId(String value) {
        return new JAXBElement<String>(_IpRecordStatusId_QNAME, String.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ipRecordId", scope = IpRecord.class)
    public JAXBElement<Long> createIpRecordIpRecordId(Long value) {
        return new JAXBElement<Long>(_IpRecordIpRecordId_QNAME, Long.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpRecordTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recordType", scope = IpRecord.class)
    public JAXBElement<IpRecordTypeEnum> createIpRecordRecordType(IpRecordTypeEnum value) {
        return new JAXBElement<IpRecordTypeEnum>(_IpRecordRecordType_QNAME, IpRecordTypeEnum.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nationalPublishingDate", scope = IpRecord.class)
    public JAXBElement<XMLGregorianCalendar> createIpRecordNationalPublishingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IpRecordNationalPublishingDate_QNAME, XMLGregorianCalendar.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "applicationId", scope = IpRecord.class)
    public JAXBElement<String> createIpRecordApplicationId(String value) {
        return new JAXBElement<String>(_IpRecordApplicationId_QNAME, String.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title", scope = IpRecord.class)
    public JAXBElement<String> createIpRecordTitle(String value) {
        return new JAXBElement<String>(_IpRecordTitle_QNAME, String.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ipRecordFilesService", scope = IpRecord.class)
    public JAXBElement<String> createIpRecordIpRecordFilesService(String value) {
        return new JAXBElement<String>(_IpRecordIpRecordFilesService_QNAME, String.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nationalPresentationDate", scope = IpRecord.class)
    public JAXBElement<XMLGregorianCalendar> createIpRecordNationalPresentationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IpRecordNationalPresentationDate_QNAME, XMLGregorianCalendar.class, IpRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "patentTypeId", scope = InventionPatent.class)
    public JAXBElement<String> createInventionPatentPatentTypeId(String value) {
        return new JAXBElement<String>(_InventionPatentPatentTypeId_QNAME, String.class, InventionPatent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pctApplicationNumber", scope = InventionPatent.class)
    public JAXBElement<String> createInventionPatentPctApplicationNumber(String value) {
        return new JAXBElement<String>(_InventionPatentPctApplicationNumber_QNAME, String.class, InventionPatent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "distinctiveSignType", scope = DistinctiveSign.class)
    public JAXBElement<String> createDistinctiveSignDistinctiveSignType(String value) {
        return new JAXBElement<String>(_DistinctiveSignDistinctiveSignType_QNAME, String.class, DistinctiveSign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationDate", scope = DistinctiveSign.class)
    public JAXBElement<XMLGregorianCalendar> createDistinctiveSignRegistrationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DistinctiveSignRegistrationDate_QNAME, XMLGregorianCalendar.class, DistinctiveSign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "logoDescription", scope = DistinctiveSign.class)
    public JAXBElement<String> createDistinctiveSignLogoDescription(String value) {
        return new JAXBElement<String>(_DistinctiveSignLogoDescription_QNAME, String.class, DistinctiveSign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expiration", scope = DistinctiveSign.class)
    public JAXBElement<XMLGregorianCalendar> createDistinctiveSignExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DistinctiveSignExpiration_QNAME, XMLGregorianCalendar.class, DistinctiveSign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "presentationType", scope = DistinctiveSign.class)
    public JAXBElement<String> createDistinctiveSignPresentationType(String value) {
        return new JAXBElement<String>(_DistinctiveSignPresentationType_QNAME, String.class, DistinctiveSign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "technicalReportDetail", scope = Patent.class)
    public JAXBElement<String> createPatentTechnicalReportDetail(String value) {
        return new JAXBElement<String>(_PatentTechnicalReportDetail_QNAME, String.class, Patent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "conclusionMethod", scope = Patent.class)
    public JAXBElement<String> createPatentConclusionMethod(String value) {
        return new JAXBElement<String>(_PatentConclusionMethod_QNAME, String.class, Patent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "patentAbstract", scope = Patent.class)
    public JAXBElement<String> createPatentPatentAbstract(String value) {
        return new JAXBElement<String>(_PatentPatentAbstract_QNAME, String.class, Patent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "registrationNumber", scope = Patent.class)
    public JAXBElement<String> createPatentRegistrationNumber(String value) {
        return new JAXBElement<String>(_PatentRegistrationNumber_QNAME, String.class, Patent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = Patent.class)
    public JAXBElement<String> createPatentDescription(String value) {
        return new JAXBElement<String>(_PatentDescription_QNAME, String.class, Patent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestCountryId", scope = Patent.class)
    public JAXBElement<String> createPatentRequestCountryId(String value) {
        return new JAXBElement<String>(_PatentRequestCountryId_QNAME, String.class, Patent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "representativeName", scope = Patent.class)
    public JAXBElement<String> createPatentRepresentativeName(String value) {
        return new JAXBElement<String>(_PatentRepresentativeName_QNAME, String.class, Patent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "designClassification", scope = DesignPatent.class)
    public JAXBElement<String> createDesignPatentDesignClassification(String value) {
        return new JAXBElement<String>(_DesignPatentDesignClassification_QNAME, String.class, DesignPatent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mainDesignImage", scope = DesignPatent.class)
    public JAXBElement<String> createDesignPatentMainDesignImage(String value) {
        return new JAXBElement<String>(_DesignPatentMainDesignImage_QNAME, String.class, DesignPatent.class, value);
    }

}
