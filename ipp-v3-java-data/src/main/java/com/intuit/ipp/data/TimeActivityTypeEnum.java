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
 * <p>Java class for TimeActivityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeActivityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeActivityTypeEnum")
@XmlEnum
public enum TimeActivityTypeEnum {

    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor");
    private final String value;

    TimeActivityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeActivityTypeEnum fromValue(String v) {
        for (TimeActivityTypeEnum c: TimeActivityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
