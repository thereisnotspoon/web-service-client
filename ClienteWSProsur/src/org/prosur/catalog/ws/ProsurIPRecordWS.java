
package org.prosur.catalog.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProsurIPRecordWS", targetNamespace = "http://ws.catalog.prosur.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProsurIPRecordWS {


    /**
     * 
     * @param ipRecord
     * @param user
     * @throws CatalogFault_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeRecord", targetNamespace = "http://ws.catalog.prosur.org/", className = "org.prosur.catalog.ws.RemoveRecord")
    @ResponseWrapper(localName = "removeRecordResponse", targetNamespace = "http://ws.catalog.prosur.org/", className = "org.prosur.catalog.ws.RemoveRecordResponse")
    public void removeRecord(
        @WebParam(name = "ipRecord", targetNamespace = "")
        IpRecord ipRecord,
        @WebParam(name = "user", targetNamespace = "")
        String user)
        throws CatalogFault_Exception
    ;

    /**
     * 
     * @param ipRecord
     * @param user
     * @return
     *     returns org.prosur.catalog.ws.IpRecord
     * @throws CatalogFault_Exception
     */
    @WebMethod
    @WebResult(name = "ipRecordResult", targetNamespace = "")
    @RequestWrapper(localName = "getRecord", targetNamespace = "http://ws.catalog.prosur.org/", className = "org.prosur.catalog.ws.GetRecord")
    @ResponseWrapper(localName = "getRecordResponse", targetNamespace = "http://ws.catalog.prosur.org/", className = "org.prosur.catalog.ws.GetRecordResponse")
    public IpRecord getRecord(
        @WebParam(name = "ipRecord", targetNamespace = "")
        IpRecord ipRecord,
        @WebParam(name = "user", targetNamespace = "")
        String user)
        throws CatalogFault_Exception
    ;

    /**
     * 
     * @param ipRecord
     * @param user
     * @return
     *     returns org.prosur.catalog.ws.IpRecord
     * @throws CatalogFault_Exception
     */
    @WebMethod
    @WebResult(name = "ipRecordResult", targetNamespace = "")
    @RequestWrapper(localName = "createRecord", targetNamespace = "http://ws.catalog.prosur.org/", className = "org.prosur.catalog.ws.CreateRecord")
    @ResponseWrapper(localName = "createRecordResponse", targetNamespace = "http://ws.catalog.prosur.org/", className = "org.prosur.catalog.ws.CreateRecordResponse")
    public IpRecord createRecord(
        @WebParam(name = "ipRecord", targetNamespace = "")
        IpRecord ipRecord,
        @WebParam(name = "user", targetNamespace = "")
        String user)
        throws CatalogFault_Exception
    ;

}
