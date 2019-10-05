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
 * 
 * 				Product: ALL
 * 				Description: A tax code is used to
 * 				track the taxable or non-taxable status of products, services, and
 * 				customers. You can assign a sales tax code to each of your products,
 * 				services, and customers based on their taxable or non-taxable
 * 				status. You can then use these codes to generate reports that
 * 				provide information to the tax agencies about the taxable or
 * 				non-taxable status of certain sales. [br]See [a
 * 				href="http://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0060_Financial_Management_Services_(v3)/01100_Global_Tax_Model"]Global
 * 				Tax Model[/a].
 * 			
 * 
 * <p>Java class for TaxCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesTaxRateList" type="{http://schema.intuit.com/finance/v3}TaxRateList" minOccurs="0"/>
 *         &lt;element name="PurchaseTaxRateList" type="{http://schema.intuit.com/finance/v3}TaxRateList" minOccurs="0"/>
 *         &lt;element name="AdjustmentTaxRateList" type="{http://schema.intuit.com/finance/v3}TaxRateList" minOccurs="0"/>
 *         &lt;element name="TaxCodeEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCode", propOrder = {
    "name",
    "description",
    "active",
    "hidden",
    "taxable",
    "taxGroup",
    "salesTaxRateList",
    "purchaseTaxRateList",
    "adjustmentTaxRateList",
    "taxCodeEx"
})
public class TaxCode
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Hidden")
    protected Boolean hidden;
    @XmlElement(name = "Taxable")
    protected Boolean taxable;
    @XmlElement(name = "TaxGroup")
    protected Boolean taxGroup;
    @XmlElement(name = "SalesTaxRateList")
    protected TaxRateList salesTaxRateList;
    @XmlElement(name = "PurchaseTaxRateList")
    protected TaxRateList purchaseTaxRateList;
    @XmlElement(name = "AdjustmentTaxRateList")
    protected TaxRateList adjustmentTaxRateList;
    @XmlElement(name = "TaxCodeEx")
    protected IntuitAnyType taxCodeEx;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the taxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxGroup() {
        return taxGroup;
    }

    /**
     * Sets the value of the taxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxGroup(Boolean value) {
        this.taxGroup = value;
    }

    /**
     * Gets the value of the salesTaxRateList property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateList }
     *     
     */
    public TaxRateList getSalesTaxRateList() {
        return salesTaxRateList;
    }

    /**
     * Sets the value of the salesTaxRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateList }
     *     
     */
    public void setSalesTaxRateList(TaxRateList value) {
        this.salesTaxRateList = value;
    }

    /**
     * Gets the value of the purchaseTaxRateList property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateList }
     *     
     */
    public TaxRateList getPurchaseTaxRateList() {
        return purchaseTaxRateList;
    }

    /**
     * Sets the value of the purchaseTaxRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateList }
     *     
     */
    public void setPurchaseTaxRateList(TaxRateList value) {
        this.purchaseTaxRateList = value;
    }

    /**
     * Gets the value of the adjustmentTaxRateList property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateList }
     *     
     */
    public TaxRateList getAdjustmentTaxRateList() {
        return adjustmentTaxRateList;
    }

    /**
     * Sets the value of the adjustmentTaxRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateList }
     *     
     */
    public void setAdjustmentTaxRateList(TaxRateList value) {
        this.adjustmentTaxRateList = value;
    }

    /**
     * Gets the value of the taxCodeEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getTaxCodeEx() {
        return taxCodeEx;
    }

    /**
     * Sets the value of the taxCodeEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setTaxCodeEx(IntuitAnyType value) {
        this.taxCodeEx = value;
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
        final TaxCode that = ((TaxCode) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHidden;
            lhsHidden = this.isHidden();
            Boolean rhsHidden;
            rhsHidden = that.isHidden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hidden", lhsHidden), LocatorUtils.property(thatLocator, "hidden", rhsHidden), lhsHidden, rhsHidden, (this.hidden!= null), (that.hidden!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTaxable;
            lhsTaxable = this.isTaxable();
            Boolean rhsTaxable;
            rhsTaxable = that.isTaxable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxable", lhsTaxable), LocatorUtils.property(thatLocator, "taxable", rhsTaxable), lhsTaxable, rhsTaxable, (this.taxable!= null), (that.taxable!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTaxGroup;
            lhsTaxGroup = this.isTaxGroup();
            Boolean rhsTaxGroup;
            rhsTaxGroup = that.isTaxGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxGroup", lhsTaxGroup), LocatorUtils.property(thatLocator, "taxGroup", rhsTaxGroup), lhsTaxGroup, rhsTaxGroup, (this.taxGroup!= null), (that.taxGroup!= null))) {
                return false;
            }
        }
        {
            TaxRateList lhsSalesTaxRateList;
            lhsSalesTaxRateList = this.getSalesTaxRateList();
            TaxRateList rhsSalesTaxRateList;
            rhsSalesTaxRateList = that.getSalesTaxRateList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTaxRateList", lhsSalesTaxRateList), LocatorUtils.property(thatLocator, "salesTaxRateList", rhsSalesTaxRateList), lhsSalesTaxRateList, rhsSalesTaxRateList, (this.salesTaxRateList!= null), (that.salesTaxRateList!= null))) {
                return false;
            }
        }
        {
            TaxRateList lhsPurchaseTaxRateList;
            lhsPurchaseTaxRateList = this.getPurchaseTaxRateList();
            TaxRateList rhsPurchaseTaxRateList;
            rhsPurchaseTaxRateList = that.getPurchaseTaxRateList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseTaxRateList", lhsPurchaseTaxRateList), LocatorUtils.property(thatLocator, "purchaseTaxRateList", rhsPurchaseTaxRateList), lhsPurchaseTaxRateList, rhsPurchaseTaxRateList, (this.purchaseTaxRateList!= null), (that.purchaseTaxRateList!= null))) {
                return false;
            }
        }
        {
            TaxRateList lhsAdjustmentTaxRateList;
            lhsAdjustmentTaxRateList = this.getAdjustmentTaxRateList();
            TaxRateList rhsAdjustmentTaxRateList;
            rhsAdjustmentTaxRateList = that.getAdjustmentTaxRateList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adjustmentTaxRateList", lhsAdjustmentTaxRateList), LocatorUtils.property(thatLocator, "adjustmentTaxRateList", rhsAdjustmentTaxRateList), lhsAdjustmentTaxRateList, rhsAdjustmentTaxRateList, (this.adjustmentTaxRateList!= null), (that.adjustmentTaxRateList!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsTaxCodeEx;
            lhsTaxCodeEx = this.getTaxCodeEx();
            IntuitAnyType rhsTaxCodeEx;
            rhsTaxCodeEx = that.getTaxCodeEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCodeEx", lhsTaxCodeEx), LocatorUtils.property(thatLocator, "taxCodeEx", rhsTaxCodeEx), lhsTaxCodeEx, rhsTaxCodeEx, (this.taxCodeEx!= null), (that.taxCodeEx!= null))) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            Boolean theHidden;
            theHidden = this.isHidden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hidden", theHidden), currentHashCode, theHidden, (this.hidden!= null));
        }
        {
            Boolean theTaxable;
            theTaxable = this.isTaxable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxable", theTaxable), currentHashCode, theTaxable, (this.taxable!= null));
        }
        {
            Boolean theTaxGroup;
            theTaxGroup = this.isTaxGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxGroup", theTaxGroup), currentHashCode, theTaxGroup, (this.taxGroup!= null));
        }
        {
            TaxRateList theSalesTaxRateList;
            theSalesTaxRateList = this.getSalesTaxRateList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTaxRateList", theSalesTaxRateList), currentHashCode, theSalesTaxRateList, (this.salesTaxRateList!= null));
        }
        {
            TaxRateList thePurchaseTaxRateList;
            thePurchaseTaxRateList = this.getPurchaseTaxRateList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseTaxRateList", thePurchaseTaxRateList), currentHashCode, thePurchaseTaxRateList, (this.purchaseTaxRateList!= null));
        }
        {
            TaxRateList theAdjustmentTaxRateList;
            theAdjustmentTaxRateList = this.getAdjustmentTaxRateList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adjustmentTaxRateList", theAdjustmentTaxRateList), currentHashCode, theAdjustmentTaxRateList, (this.adjustmentTaxRateList!= null));
        }
        {
            IntuitAnyType theTaxCodeEx;
            theTaxCodeEx = this.getTaxCodeEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCodeEx", theTaxCodeEx), currentHashCode, theTaxCodeEx, (this.taxCodeEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
