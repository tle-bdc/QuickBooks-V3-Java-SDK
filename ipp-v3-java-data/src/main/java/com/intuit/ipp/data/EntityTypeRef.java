//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.08 at 07:59:36 PM PST 
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
 * 				Description: Reference information for
 * 				an entity.
 * 			
 * 
 * <p>Java class for EntityTypeRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityTypeRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://schema.intuit.com/finance/v3}EntityTypeEnum" minOccurs="0"/>
 *         &lt;element name="EntityRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityTypeRef", propOrder = {
    "type",
    "entityRef"
})
public class EntityTypeRef implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Type")
    protected EntityTypeEnum type;
    @XmlElement(name = "EntityRef")
    protected ReferenceType entityRef;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeEnum }
     *     
     */
    public EntityTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeEnum }
     *     
     */
    public void setType(EntityTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the entityRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getEntityRef() {
        return entityRef;
    }

    /**
     * Sets the value of the entityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setEntityRef(ReferenceType value) {
        this.entityRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EntityTypeRef that = ((EntityTypeRef) object);
        {
            EntityTypeEnum lhsType;
            lhsType = this.getType();
            EntityTypeEnum rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsEntityRef;
            lhsEntityRef = this.getEntityRef();
            ReferenceType rhsEntityRef;
            rhsEntityRef = that.getEntityRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityRef", lhsEntityRef), LocatorUtils.property(thatLocator, "entityRef", rhsEntityRef), lhsEntityRef, rhsEntityRef, (this.entityRef!= null), (that.entityRef!= null))) {
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
        int currentHashCode = 1;
        {
            EntityTypeEnum theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            ReferenceType theEntityRef;
            theEntityRef = this.getEntityRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityRef", theEntityRef), currentHashCode, theEntityRef, (this.entityRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
