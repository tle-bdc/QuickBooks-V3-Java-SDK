//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.05 at 02:37:37 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Master Account is the list of accounts in the
 * 				master list. The master list is the complete list of accounts
 * 				prescribed by the French Government. These accounts can be created
 * 				in the company on a need basis. The account create API needs to be
 * 				used to create an account. 
 * 
 * <p>Java class for MasterAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Account">
 *       &lt;sequence>
 *         &lt;element name="AccountExistsInCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterAccount", propOrder = {
    "accountExistsInCompany"
})
public class MasterAccount
    extends Account
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccountExistsInCompany")
    protected Boolean accountExistsInCompany;

    /**
     * Gets the value of the accountExistsInCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountExistsInCompany() {
        return accountExistsInCompany;
    }

    /**
     * Sets the value of the accountExistsInCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountExistsInCompany(Boolean value) {
        this.accountExistsInCompany = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MasterAccount that = ((MasterAccount) object);
        {
            Boolean lhsAccountExistsInCompany;
            lhsAccountExistsInCompany = this.isAccountExistsInCompany();
            Boolean rhsAccountExistsInCompany;
            rhsAccountExistsInCompany = that.isAccountExistsInCompany();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountExistsInCompany", lhsAccountExistsInCompany), LocatorUtils.property(thatLocator, "accountExistsInCompany", rhsAccountExistsInCompany), lhsAccountExistsInCompany, rhsAccountExistsInCompany, (this.accountExistsInCompany!= null), (that.accountExistsInCompany!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Boolean theAccountExistsInCompany;
            theAccountExistsInCompany = this.isAccountExistsInCompany();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountExistsInCompany", theAccountExistsInCompany), currentHashCode, theAccountExistsInCompany, (this.accountExistsInCompany!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
