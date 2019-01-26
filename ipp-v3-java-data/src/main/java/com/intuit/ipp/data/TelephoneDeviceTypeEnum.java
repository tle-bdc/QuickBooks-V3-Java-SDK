//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.08 at 07:59:36 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneDeviceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneDeviceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LandLine"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Pager"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneDeviceTypeEnum")
@XmlEnum
public enum TelephoneDeviceTypeEnum {

    @XmlEnumValue("LandLine")
    LAND_LINE("LandLine"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Pager")
    PAGER("Pager");
    private final String value;

    TelephoneDeviceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneDeviceTypeEnum fromValue(String v) {
        for (TelephoneDeviceTypeEnum c: TelephoneDeviceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
