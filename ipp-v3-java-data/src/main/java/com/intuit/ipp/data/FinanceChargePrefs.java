//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.05 at 02:37:37 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for FinanceChargePrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinanceChargePrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnualInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinFinChrg" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GracePeriod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CalcFinChrgFromTxnDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssessFinChrgForOverdueCharges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinChrgAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinanceChargePrefs", propOrder = {
    "annualInterestRate",
    "minFinChrg",
    "gracePeriod",
    "calcFinChrgFromTxnDate",
    "assessFinChrgForOverdueCharges",
    "finChrgAccountRef"
})
public class FinanceChargePrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AnnualInterestRate")
    protected BigDecimal annualInterestRate;
    @XmlElement(name = "MinFinChrg")
    protected BigDecimal minFinChrg;
    @XmlElement(name = "GracePeriod")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gracePeriod;
    @XmlElement(name = "CalcFinChrgFromTxnDate")
    protected Boolean calcFinChrgFromTxnDate;
    @XmlElement(name = "AssessFinChrgForOverdueCharges")
    protected Boolean assessFinChrgForOverdueCharges;
    @XmlElement(name = "FinChrgAccountRef")
    protected ReferenceType finChrgAccountRef;

    /**
     * Gets the value of the annualInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Sets the value of the annualInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualInterestRate(BigDecimal value) {
        this.annualInterestRate = value;
    }

    /**
     * Gets the value of the minFinChrg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinFinChrg() {
        return minFinChrg;
    }

    /**
     * Sets the value of the minFinChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinFinChrg(BigDecimal value) {
        this.minFinChrg = value;
    }

    /**
     * Gets the value of the gracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Sets the value of the gracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGracePeriod(BigInteger value) {
        this.gracePeriod = value;
    }

    /**
     * Gets the value of the calcFinChrgFromTxnDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalcFinChrgFromTxnDate() {
        return calcFinChrgFromTxnDate;
    }

    /**
     * Sets the value of the calcFinChrgFromTxnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalcFinChrgFromTxnDate(Boolean value) {
        this.calcFinChrgFromTxnDate = value;
    }

    /**
     * Gets the value of the assessFinChrgForOverdueCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssessFinChrgForOverdueCharges() {
        return assessFinChrgForOverdueCharges;
    }

    /**
     * Sets the value of the assessFinChrgForOverdueCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssessFinChrgForOverdueCharges(Boolean value) {
        this.assessFinChrgForOverdueCharges = value;
    }

    /**
     * Gets the value of the finChrgAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFinChrgAccountRef() {
        return finChrgAccountRef;
    }

    /**
     * Sets the value of the finChrgAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFinChrgAccountRef(ReferenceType value) {
        this.finChrgAccountRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FinanceChargePrefs that = ((FinanceChargePrefs) object);
        {
            BigDecimal lhsAnnualInterestRate;
            lhsAnnualInterestRate = this.getAnnualInterestRate();
            BigDecimal rhsAnnualInterestRate;
            rhsAnnualInterestRate = that.getAnnualInterestRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annualInterestRate", lhsAnnualInterestRate), LocatorUtils.property(thatLocator, "annualInterestRate", rhsAnnualInterestRate), lhsAnnualInterestRate, rhsAnnualInterestRate, (this.annualInterestRate!= null), (that.annualInterestRate!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMinFinChrg;
            lhsMinFinChrg = this.getMinFinChrg();
            BigDecimal rhsMinFinChrg;
            rhsMinFinChrg = that.getMinFinChrg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minFinChrg", lhsMinFinChrg), LocatorUtils.property(thatLocator, "minFinChrg", rhsMinFinChrg), lhsMinFinChrg, rhsMinFinChrg, (this.minFinChrg!= null), (that.minFinChrg!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsGracePeriod;
            lhsGracePeriod = this.getGracePeriod();
            BigInteger rhsGracePeriod;
            rhsGracePeriod = that.getGracePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gracePeriod", lhsGracePeriod), LocatorUtils.property(thatLocator, "gracePeriod", rhsGracePeriod), lhsGracePeriod, rhsGracePeriod, (this.gracePeriod!= null), (that.gracePeriod!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCalcFinChrgFromTxnDate;
            lhsCalcFinChrgFromTxnDate = this.isCalcFinChrgFromTxnDate();
            Boolean rhsCalcFinChrgFromTxnDate;
            rhsCalcFinChrgFromTxnDate = that.isCalcFinChrgFromTxnDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calcFinChrgFromTxnDate", lhsCalcFinChrgFromTxnDate), LocatorUtils.property(thatLocator, "calcFinChrgFromTxnDate", rhsCalcFinChrgFromTxnDate), lhsCalcFinChrgFromTxnDate, rhsCalcFinChrgFromTxnDate, (this.calcFinChrgFromTxnDate!= null), (that.calcFinChrgFromTxnDate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAssessFinChrgForOverdueCharges;
            lhsAssessFinChrgForOverdueCharges = this.isAssessFinChrgForOverdueCharges();
            Boolean rhsAssessFinChrgForOverdueCharges;
            rhsAssessFinChrgForOverdueCharges = that.isAssessFinChrgForOverdueCharges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assessFinChrgForOverdueCharges", lhsAssessFinChrgForOverdueCharges), LocatorUtils.property(thatLocator, "assessFinChrgForOverdueCharges", rhsAssessFinChrgForOverdueCharges), lhsAssessFinChrgForOverdueCharges, rhsAssessFinChrgForOverdueCharges, (this.assessFinChrgForOverdueCharges!= null), (that.assessFinChrgForOverdueCharges!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsFinChrgAccountRef;
            lhsFinChrgAccountRef = this.getFinChrgAccountRef();
            ReferenceType rhsFinChrgAccountRef;
            rhsFinChrgAccountRef = that.getFinChrgAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finChrgAccountRef", lhsFinChrgAccountRef), LocatorUtils.property(thatLocator, "finChrgAccountRef", rhsFinChrgAccountRef), lhsFinChrgAccountRef, rhsFinChrgAccountRef, (this.finChrgAccountRef!= null), (that.finChrgAccountRef!= null))) {
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
            BigDecimal theAnnualInterestRate;
            theAnnualInterestRate = this.getAnnualInterestRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annualInterestRate", theAnnualInterestRate), currentHashCode, theAnnualInterestRate, (this.annualInterestRate!= null));
        }
        {
            BigDecimal theMinFinChrg;
            theMinFinChrg = this.getMinFinChrg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minFinChrg", theMinFinChrg), currentHashCode, theMinFinChrg, (this.minFinChrg!= null));
        }
        {
            BigInteger theGracePeriod;
            theGracePeriod = this.getGracePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gracePeriod", theGracePeriod), currentHashCode, theGracePeriod, (this.gracePeriod!= null));
        }
        {
            Boolean theCalcFinChrgFromTxnDate;
            theCalcFinChrgFromTxnDate = this.isCalcFinChrgFromTxnDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calcFinChrgFromTxnDate", theCalcFinChrgFromTxnDate), currentHashCode, theCalcFinChrgFromTxnDate, (this.calcFinChrgFromTxnDate!= null));
        }
        {
            Boolean theAssessFinChrgForOverdueCharges;
            theAssessFinChrgForOverdueCharges = this.isAssessFinChrgForOverdueCharges();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assessFinChrgForOverdueCharges", theAssessFinChrgForOverdueCharges), currentHashCode, theAssessFinChrgForOverdueCharges, (this.assessFinChrgForOverdueCharges!= null));
        }
        {
            ReferenceType theFinChrgAccountRef;
            theFinChrgAccountRef = this.getFinChrgAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finChrgAccountRef", theFinChrgAccountRef), currentHashCode, theFinChrgAccountRef, (this.finChrgAccountRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
