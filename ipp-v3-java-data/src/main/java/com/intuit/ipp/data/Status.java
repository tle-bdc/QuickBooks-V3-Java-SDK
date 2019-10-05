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
 * 		        Product: QBW
 * 		        Description: generic meta data response for any add mod
 * 		      
 * 
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", propOrder = {
    "requestId",
    "batchId",
    "objectType",
    "stateCode",
    "stateDesc",
    "messageCode",
    "messageDesc"
})
public class Status
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "BatchId")
    protected String batchId;
    @XmlElement(name = "ObjectType", required = true)
    protected String objectType;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "StateDesc")
    protected String stateDesc;
    @XmlElement(name = "MessageCode")
    protected String messageCode;
    @XmlElement(name = "MessageDesc")
    protected String messageDesc;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the stateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDesc() {
        return stateDesc;
    }

    /**
     * Sets the value of the stateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDesc(String value) {
        this.stateDesc = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the messageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDesc() {
        return messageDesc;
    }

    /**
     * Sets the value of the messageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDesc(String value) {
        this.messageDesc = value;
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
        final Status that = ((Status) object);
        {
            String lhsRequestId;
            lhsRequestId = this.getRequestId();
            String rhsRequestId;
            rhsRequestId = that.getRequestId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestId", lhsRequestId), LocatorUtils.property(thatLocator, "requestId", rhsRequestId), lhsRequestId, rhsRequestId, (this.requestId!= null), (that.requestId!= null))) {
                return false;
            }
        }
        {
            String lhsBatchId;
            lhsBatchId = this.getBatchId();
            String rhsBatchId;
            rhsBatchId = that.getBatchId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchId", lhsBatchId), LocatorUtils.property(thatLocator, "batchId", rhsBatchId), lhsBatchId, rhsBatchId, (this.batchId!= null), (that.batchId!= null))) {
                return false;
            }
        }
        {
            String lhsObjectType;
            lhsObjectType = this.getObjectType();
            String rhsObjectType;
            rhsObjectType = that.getObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectType", lhsObjectType), LocatorUtils.property(thatLocator, "objectType", rhsObjectType), lhsObjectType, rhsObjectType, (this.objectType!= null), (that.objectType!= null))) {
                return false;
            }
        }
        {
            String lhsStateCode;
            lhsStateCode = this.getStateCode();
            String rhsStateCode;
            rhsStateCode = that.getStateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateCode", lhsStateCode), LocatorUtils.property(thatLocator, "stateCode", rhsStateCode), lhsStateCode, rhsStateCode, (this.stateCode!= null), (that.stateCode!= null))) {
                return false;
            }
        }
        {
            String lhsStateDesc;
            lhsStateDesc = this.getStateDesc();
            String rhsStateDesc;
            rhsStateDesc = that.getStateDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateDesc", lhsStateDesc), LocatorUtils.property(thatLocator, "stateDesc", rhsStateDesc), lhsStateDesc, rhsStateDesc, (this.stateDesc!= null), (that.stateDesc!= null))) {
                return false;
            }
        }
        {
            String lhsMessageCode;
            lhsMessageCode = this.getMessageCode();
            String rhsMessageCode;
            rhsMessageCode = that.getMessageCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageCode", lhsMessageCode), LocatorUtils.property(thatLocator, "messageCode", rhsMessageCode), lhsMessageCode, rhsMessageCode, (this.messageCode!= null), (that.messageCode!= null))) {
                return false;
            }
        }
        {
            String lhsMessageDesc;
            lhsMessageDesc = this.getMessageDesc();
            String rhsMessageDesc;
            rhsMessageDesc = that.getMessageDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageDesc", lhsMessageDesc), LocatorUtils.property(thatLocator, "messageDesc", rhsMessageDesc), lhsMessageDesc, rhsMessageDesc, (this.messageDesc!= null), (that.messageDesc!= null))) {
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
            String theRequestId;
            theRequestId = this.getRequestId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestId", theRequestId), currentHashCode, theRequestId, (this.requestId!= null));
        }
        {
            String theBatchId;
            theBatchId = this.getBatchId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchId", theBatchId), currentHashCode, theBatchId, (this.batchId!= null));
        }
        {
            String theObjectType;
            theObjectType = this.getObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectType", theObjectType), currentHashCode, theObjectType, (this.objectType!= null));
        }
        {
            String theStateCode;
            theStateCode = this.getStateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateCode", theStateCode), currentHashCode, theStateCode, (this.stateCode!= null));
        }
        {
            String theStateDesc;
            theStateDesc = this.getStateDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateDesc", theStateDesc), currentHashCode, theStateDesc, (this.stateDesc!= null));
        }
        {
            String theMessageCode;
            theMessageCode = this.getMessageCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageCode", theMessageCode), currentHashCode, theMessageCode, (this.messageCode!= null));
        }
        {
            String theMessageDesc;
            theMessageDesc = this.getMessageDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageDesc", theMessageDesc), currentHashCode, theMessageDesc, (this.messageDesc!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
