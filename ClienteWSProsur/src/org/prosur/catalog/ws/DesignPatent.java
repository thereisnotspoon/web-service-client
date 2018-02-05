
package org.prosur.catalog.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designPatent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designPatent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.catalog.prosur.org/}patent">
 *       &lt;sequence>
 *         &lt;element name="designClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locarnoClassification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mainDesignImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designPatent", propOrder = {
    "designClassification",
    "locarnoClassification",
    "mainDesignImage"
})
public class DesignPatent
    extends Patent
{

    @XmlElementRef(name = "designClassification", type = JAXBElement.class, required = false)
    protected JAXBElement<String> designClassification;
    @XmlElement(nillable = true)
    protected List<String> locarnoClassification;
    @XmlElementRef(name = "mainDesignImage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainDesignImage;

    /**
     * Gets the value of the designClassification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesignClassification() {
        return designClassification;
    }

    /**
     * Sets the value of the designClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesignClassification(JAXBElement<String> value) {
        this.designClassification = value;
    }

    /**
     * Gets the value of the locarnoClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locarnoClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocarnoClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocarnoClassification() {
        if (locarnoClassification == null) {
            locarnoClassification = new ArrayList<String>();
        }
        return this.locarnoClassification;
    }

    /**
     * Gets the value of the mainDesignImage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainDesignImage() {
        return mainDesignImage;
    }

    /**
     * Sets the value of the mainDesignImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainDesignImage(JAXBElement<String> value) {
        this.mainDesignImage = value;
    }

}
