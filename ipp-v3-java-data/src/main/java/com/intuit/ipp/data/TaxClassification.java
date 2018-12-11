//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.08 at 07:59:36 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * 				Description: Tax classification segregates different items into different classifications and the tax
 * 				classification is one of the key parameters to determine appropriate tax on transactions involving items.
 * 				Tax classifications are sourced by either tax governing authorities as in India/Malaysia or externally like Exactor.
 * 				"Fuel", "Garments" and "Soft drinks" are a few examples of tax classification in layman terms.
 * 				User can choose a specific tax classification for an item while creating it.
 * 			
 * 
 * <p>Java class for TaxClassification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxClassification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ApplicableTo" type="{http://schema.intuit.com/finance/v3}ItemTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxClassification", propOrder = {
    "code",
    "name",
    "description",
    "level",
    "parentRef",
    "applicableTo"
})
public class TaxClassification
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Level")
    protected String level;
    @XmlElement(name = "ParentRef")
    protected ReferenceType parentRef;
    @XmlElement(name = "ApplicableTo")
    protected List<ItemTypeEnum> applicableTo;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setParentRef(ReferenceType value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the applicableTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTypeEnum }
     * 
     * 
     */
    public List<ItemTypeEnum> getApplicableTo() {
        if (applicableTo == null) {
            applicableTo = new ArrayList<ItemTypeEnum>();
        }
        return this.applicableTo;
    }

    /**
     * Sets the value of the applicableTo property.
     * 
     * @param applicableTo
     *     allowed object is
     *     {@link ItemTypeEnum }
     *     
     */
    public void setApplicableTo(List<ItemTypeEnum> applicableTo) {
        this.applicableTo = applicableTo;
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
        final TaxClassification that = ((TaxClassification) object);
        {
            String lhsCode;
            lhsCode = this.getCode();
            String rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode, (this.code!= null), (that.code!= null))) {
                return false;
            }
        }
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
            String lhsLevel;
            lhsLevel = this.getLevel();
            String rhsLevel;
            rhsLevel = that.getLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "level", lhsLevel), LocatorUtils.property(thatLocator, "level", rhsLevel), lhsLevel, rhsLevel, (this.level!= null), (that.level!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsParentRef;
            lhsParentRef = this.getParentRef();
            ReferenceType rhsParentRef;
            rhsParentRef = that.getParentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentRef", lhsParentRef), LocatorUtils.property(thatLocator, "parentRef", rhsParentRef), lhsParentRef, rhsParentRef, (this.parentRef!= null), (that.parentRef!= null))) {
                return false;
            }
        }
        {
            List<ItemTypeEnum> lhsApplicableTo;
            lhsApplicableTo = (((this.applicableTo!= null)&&(!this.applicableTo.isEmpty()))?this.getApplicableTo():null);
            List<ItemTypeEnum> rhsApplicableTo;
            rhsApplicableTo = (((that.applicableTo!= null)&&(!that.applicableTo.isEmpty()))?that.getApplicableTo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicableTo", lhsApplicableTo), LocatorUtils.property(thatLocator, "applicableTo", rhsApplicableTo), lhsApplicableTo, rhsApplicableTo, ((this.applicableTo!= null)&&(!this.applicableTo.isEmpty())), ((that.applicableTo!= null)&&(!that.applicableTo.isEmpty())))) {
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
            String theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode, (this.code!= null));
        }
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
            String theLevel;
            theLevel = this.getLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "level", theLevel), currentHashCode, theLevel, (this.level!= null));
        }
        {
            ReferenceType theParentRef;
            theParentRef = this.getParentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentRef", theParentRef), currentHashCode, theParentRef, (this.parentRef!= null));
        }
        {
            List<ItemTypeEnum> theApplicableTo;
            theApplicableTo = (((this.applicableTo!= null)&&(!this.applicableTo.isEmpty()))?this.getApplicableTo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicableTo", theApplicableTo), currentHashCode, theApplicableTo, ((this.applicableTo!= null)&&(!this.applicableTo.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}