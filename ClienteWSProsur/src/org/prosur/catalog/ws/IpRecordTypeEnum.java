
package org.prosur.catalog.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ipRecordTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ipRecordTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISTINCTIVE_SIGN"/>
 *     &lt;enumeration value="INVENTION_PATENT"/>
 *     &lt;enumeration value="DESIGN_PATENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ipRecordTypeEnum")
@XmlEnum
public enum IpRecordTypeEnum {

    DISTINCTIVE_SIGN,
    INVENTION_PATENT,
    DESIGN_PATENT;

    public String value() {
        return name();
    }

    public static IpRecordTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
