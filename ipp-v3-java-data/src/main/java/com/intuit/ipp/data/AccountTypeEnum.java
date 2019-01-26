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
 * <p>Java class for AccountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bank"/>
 *     &lt;enumeration value="Accounts Receivable"/>
 *     &lt;enumeration value="Other Current Asset"/>
 *     &lt;enumeration value="Fixed Asset"/>
 *     &lt;enumeration value="Other Asset"/>
 *     &lt;enumeration value="Accounts Payable"/>
 *     &lt;enumeration value="Credit Card"/>
 *     &lt;enumeration value="Other Current Liability"/>
 *     &lt;enumeration value="Long Term Liability"/>
 *     &lt;enumeration value="Equity"/>
 *     &lt;enumeration value="Income"/>
 *     &lt;enumeration value="Cost of Goods Sold"/>
 *     &lt;enumeration value="Expense"/>
 *     &lt;enumeration value="Other Income"/>
 *     &lt;enumeration value="Other Expense"/>
 *     &lt;enumeration value="Non-Posting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountTypeEnum")
@XmlEnum
public enum AccountTypeEnum {

    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Accounts Receivable")
    ACCOUNTS_RECEIVABLE("Accounts Receivable"),
    @XmlEnumValue("Other Current Asset")
    OTHER_CURRENT_ASSET("Other Current Asset"),
    @XmlEnumValue("Fixed Asset")
    FIXED_ASSET("Fixed Asset"),
    @XmlEnumValue("Other Asset")
    OTHER_ASSET("Other Asset"),
    @XmlEnumValue("Accounts Payable")
    ACCOUNTS_PAYABLE("Accounts Payable"),
    @XmlEnumValue("Credit Card")
    CREDIT_CARD("Credit Card"),
    @XmlEnumValue("Other Current Liability")
    OTHER_CURRENT_LIABILITY("Other Current Liability"),
    @XmlEnumValue("Long Term Liability")
    LONG_TERM_LIABILITY("Long Term Liability"),
    @XmlEnumValue("Equity")
    EQUITY("Equity"),
    @XmlEnumValue("Income")
    INCOME("Income"),
    @XmlEnumValue("Cost of Goods Sold")
    COST_OF_GOODS_SOLD("Cost of Goods Sold"),
    @XmlEnumValue("Expense")
    EXPENSE("Expense"),
    @XmlEnumValue("Other Income")
    OTHER_INCOME("Other Income"),
    @XmlEnumValue("Other Expense")
    OTHER_EXPENSE("Other Expense"),
    @XmlEnumValue("Non-Posting")
    NON_POSTING("Non-Posting");
    private final String value;

    AccountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTypeEnum fromValue(String v) {
        for (AccountTypeEnum c: AccountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
