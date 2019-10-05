//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.05 at 02:37:37 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCSecurityCodeMatchEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCSecurityCodeMatchEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="Pass"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CCSecurityCodeMatchEnum")
@XmlEnum
public enum CCSecurityCodeMatchEnum {

    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("Pass")
    PASS("Pass");
    private final String value;

    CCSecurityCodeMatchEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCSecurityCodeMatchEnum fromValue(String v) {
        for (CCSecurityCodeMatchEnum c: CCSecurityCodeMatchEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
