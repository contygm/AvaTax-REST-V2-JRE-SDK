package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * A company or business entity.
 */
public class CompanyModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this company.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this company.
     */
    public void setId(int value) {
        this.id = value;
    }


    private int accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number of the account this company belongs to.
     */
    public int getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number of the account this company belongs to.
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }


    private Integer parentCompanyId;

    /**
     * Getter for parentCompanyId
     *
     * If this company is fully owned by another company, this is the unique identity of the parent company.
     */
    public Integer getParentCompanyId() {
        return this.parentCompanyId;
    }

    /**
     * Setter for parentCompanyId
     *
     * If this company is fully owned by another company, this is the unique identity of the parent company.
     */
    public void setParentCompanyId(Integer value) {
        this.parentCompanyId = value;
    }


    private string sstPid;

    /**
     * Getter for sstPid
     *
     * If this company files Streamlined Sales Tax, this is the PID of this company as defined by the Streamlined Sales Tax governing board.
     */
    public string getSstPid() {
        return this.sstPid;
    }

    /**
     * Setter for sstPid
     *
     * If this company files Streamlined Sales Tax, this is the PID of this company as defined by the Streamlined Sales Tax governing board.
     */
    public void setSstPid(string value) {
        this.sstPid = value;
    }


    private string companyCode;

    /**
     * Getter for companyCode
     *
     * A unique code that references this company within your account.
     */
    public string getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * A unique code that references this company within your account.
     */
    public void setCompanyCode(string value) {
        this.companyCode = value;
    }


    private string name;

    /**
     * Getter for name
     *
     * The name of this company, as shown to customers.
     */
    public string getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The name of this company, as shown to customers.
     */
    public void setName(string value) {
        this.name = value;
    }


    private object isDefault;

    /**
     * Getter for isDefault
     *
     * This flag is true if this company is the default company for this account. Only one company may be set as the default.
     */
    public object getIsDefault() {
        return this.isDefault;
    }

    /**
     * Setter for isDefault
     *
     * This flag is true if this company is the default company for this account. Only one company may be set as the default.
     */
    public void setIsDefault(object value) {
        this.isDefault = value;
    }


    private Integer defaultLocationId;

    /**
     * Getter for defaultLocationId
     *
     * If set, this is the unique ID number of the default location for this company.
     */
    public Integer getDefaultLocationId() {
        return this.defaultLocationId;
    }

    /**
     * Setter for defaultLocationId
     *
     * If set, this is the unique ID number of the default location for this company.
     */
    public void setDefaultLocationId(Integer value) {
        this.defaultLocationId = value;
    }


    private object isActive;

    /**
     * Getter for isActive
     *
     * This flag indicates whether tax activity can occur for this company. Set this flag to true to permit the company to process transactions.
     */
    public object getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * This flag indicates whether tax activity can occur for this company. Set this flag to true to permit the company to process transactions.
     */
    public void setIsActive(object value) {
        this.isActive = value;
    }


    private string taxpayerIdNumber;

    /**
     * Getter for taxpayerIdNumber
     *
     * For United States companies, this field contains your Taxpayer Identification Number. 
    * This is a nine digit number that is usually called an EIN for an Employer Identification Number if this company is a corporation, 
    * or SSN for a Social Security Number if this company is a person.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public string getTaxpayerIdNumber() {
        return this.taxpayerIdNumber;
    }

    /**
     * Setter for taxpayerIdNumber
     *
     * For United States companies, this field contains your Taxpayer Identification Number. 
    * This is a nine digit number that is usually called an EIN for an Employer Identification Number if this company is a corporation, 
    * or SSN for a Social Security Number if this company is a person.
    * This value is required if you subscribe to Avalara Managed Returns or the SST Certified Service Provider services, 
    * but it is optional if you do not subscribe to either of those services.
     */
    public void setTaxpayerIdNumber(string value) {
        this.taxpayerIdNumber = value;
    }


    private object hasProfile;

    /**
     * Getter for hasProfile
     *
     * Set this flag to true to give this company its own unique tax profile.
    * If this flag is true, this company will have its own Nexus, TaxRule, TaxCode, and Item definitions.
    * If this flag is false, this company will inherit all profile values from its parent.
     */
    public object getHasProfile() {
        return this.hasProfile;
    }

    /**
     * Setter for hasProfile
     *
     * Set this flag to true to give this company its own unique tax profile.
    * If this flag is true, this company will have its own Nexus, TaxRule, TaxCode, and Item definitions.
    * If this flag is false, this company will inherit all profile values from its parent.
     */
    public void setHasProfile(object value) {
        this.hasProfile = value;
    }


    private object isReportingEntity;

    /**
     * Getter for isReportingEntity
     *
     * Set this flag to true if this company must file its own tax returns.
    * For users who have Returns enabled, this flag turns on monthly Worksheet generation for the company.
     */
    public object getIsReportingEntity() {
        return this.isReportingEntity;
    }

    /**
     * Setter for isReportingEntity
     *
     * Set this flag to true if this company must file its own tax returns.
    * For users who have Returns enabled, this flag turns on monthly Worksheet generation for the company.
     */
    public void setIsReportingEntity(object value) {
        this.isReportingEntity = value;
    }


    private Instant sstEffectiveDate;

    /**
     * Getter for sstEffectiveDate
     *
     * If this company participates in Streamlined Sales Tax, this is the date when the company joined the SST program.
     */
    public Instant getSstEffectiveDate() {
        return this.sstEffectiveDate;
    }

    /**
     * Setter for sstEffectiveDate
     *
     * If this company participates in Streamlined Sales Tax, this is the date when the company joined the SST program.
     */
    public void setSstEffectiveDate(Instant value) {
        this.sstEffectiveDate = value;
    }


    private string defaultCountry;

    /**
     * Getter for defaultCountry
     *
     * The two character ISO-3166 country code of the default country for this company.
     */
    public string getDefaultCountry() {
        return this.defaultCountry;
    }

    /**
     * Setter for defaultCountry
     *
     * The two character ISO-3166 country code of the default country for this company.
     */
    public void setDefaultCountry(string value) {
        this.defaultCountry = value;
    }


    private string baseCurrencyCode;

    /**
     * Getter for baseCurrencyCode
     *
     * This is the three character ISO-4217 currency code of the default currency used by this company.
     */
    public string getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    /**
     * Setter for baseCurrencyCode
     *
     * This is the three character ISO-4217 currency code of the default currency used by this company.
     */
    public void setBaseCurrencyCode(string value) {
        this.baseCurrencyCode = value;
    }


    private RoundingLevelId roundingLevelId;

    /**
     * Getter for roundingLevelId
     *
     * Indicates whether this company prefers to round amounts at the document level or line level.
     */
    public RoundingLevelId getRoundingLevelId() {
        return this.roundingLevelId;
    }

    /**
     * Setter for roundingLevelId
     *
     * Indicates whether this company prefers to round amounts at the document level or line level.
     */
    public void setRoundingLevelId(RoundingLevelId value) {
        this.roundingLevelId = value;
    }


    private object warningsEnabled;

    /**
     * Getter for warningsEnabled
     *
     * Set this value to true to receive warnings in API calls via SOAP.
     */
    public object getWarningsEnabled() {
        return this.warningsEnabled;
    }

    /**
     * Setter for warningsEnabled
     *
     * Set this value to true to receive warnings in API calls via SOAP.
     */
    public void setWarningsEnabled(object value) {
        this.warningsEnabled = value;
    }


    private object isTest;

    /**
     * Getter for isTest
     *
     * Set this flag to true to indicate that this company is a test company.
    * If you have Returns enabled, Test companies will not file tax returns and can be used for validation purposes.
     */
    public object getIsTest() {
        return this.isTest;
    }

    /**
     * Setter for isTest
     *
     * Set this flag to true to indicate that this company is a test company.
    * If you have Returns enabled, Test companies will not file tax returns and can be used for validation purposes.
     */
    public void setIsTest(object value) {
        this.isTest = value;
    }


    private TaxDependencyLevelId taxDependencyLevelId;

    /**
     * Getter for taxDependencyLevelId
     *
     * Used to apply tax detail dependency at a jurisdiction level.
     */
    public TaxDependencyLevelId getTaxDependencyLevelId() {
        return this.taxDependencyLevelId;
    }

    /**
     * Setter for taxDependencyLevelId
     *
     * Used to apply tax detail dependency at a jurisdiction level.
     */
    public void setTaxDependencyLevelId(TaxDependencyLevelId value) {
        this.taxDependencyLevelId = value;
    }


    private object inProgress;

    /**
     * Getter for inProgress
     *
     * Set this value to true to indicate that you are still working to finish configuring this company.
    * While this value is true, no tax reporting will occur and the company will not be usable for transactions.
     */
    public object getInProgress() {
        return this.inProgress;
    }

    /**
     * Setter for inProgress
     *
     * Set this value to true to indicate that you are still working to finish configuring this company.
    * While this value is true, no tax reporting will occur and the company will not be usable for transactions.
     */
    public void setInProgress(object value) {
        this.inProgress = value;
    }


    private string businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * Business Identification No
     */
    public string getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo
     *
     * Business Identification No
     */
    public void setBusinessIdentificationNo(string value) {
        this.businessIdentificationNo = value;
    }


    private Instant createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Instant getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Instant value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Instant modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Instant getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Instant value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    private ContactModel[] contacts;

    /**
     * Getter for contacts
     *
     * Optional: A list of contacts defined for this company. To fetch this list, add the query string "?$include=Contacts" to your URL.
     */
    public ContactModel[] getContacts() {
        return this.contacts;
    }

    /**
     * Setter for contacts
     *
     * Optional: A list of contacts defined for this company. To fetch this list, add the query string "?$include=Contacts" to your URL.
     */
    public void setContacts(ContactModel[] value) {
        this.contacts = value;
    }


    private ItemModel[] items;

    /**
     * Getter for items
     *
     * Optional: A list of items defined for this company. To fetch this list, add the query string "?$include=Items" to your URL.
     */
    public ItemModel[] getItems() {
        return this.items;
    }

    /**
     * Setter for items
     *
     * Optional: A list of items defined for this company. To fetch this list, add the query string "?$include=Items" to your URL.
     */
    public void setItems(ItemModel[] value) {
        this.items = value;
    }


    private LocationModel[] locations;

    /**
     * Getter for locations
     *
     * Optional: A list of locations defined for this company. To fetch this list, add the query string "?$include=Locations" to your URL.
     */
    public LocationModel[] getLocations() {
        return this.locations;
    }

    /**
     * Setter for locations
     *
     * Optional: A list of locations defined for this company. To fetch this list, add the query string "?$include=Locations" to your URL.
     */
    public void setLocations(LocationModel[] value) {
        this.locations = value;
    }


    private NexusModel[] nexus;

    /**
     * Getter for nexus
     *
     * Optional: A list of nexus defined for this company. To fetch this list, add the query string "?$include=Nexus" to your URL.
     */
    public NexusModel[] getNexus() {
        return this.nexus;
    }

    /**
     * Setter for nexus
     *
     * Optional: A list of nexus defined for this company. To fetch this list, add the query string "?$include=Nexus" to your URL.
     */
    public void setNexus(NexusModel[] value) {
        this.nexus = value;
    }


    private SettingModel[] settings;

    /**
     * Getter for settings
     *
     * Optional: A list of settings defined for this company. To fetch this list, add the query string "?$include=Settings" to your URL.
     */
    public SettingModel[] getSettings() {
        return this.settings;
    }

    /**
     * Setter for settings
     *
     * Optional: A list of settings defined for this company. To fetch this list, add the query string "?$include=Settings" to your URL.
     */
    public void setSettings(SettingModel[] value) {
        this.settings = value;
    }


    private TaxCodeModel[] taxCodes;

    /**
     * Getter for taxCodes
     *
     * Optional: A list of tax codes defined for this company. To fetch this list, add the query string "?$include=TaxCodes" to your URL.
     */
    public TaxCodeModel[] getTaxCodes() {
        return this.taxCodes;
    }

    /**
     * Setter for taxCodes
     *
     * Optional: A list of tax codes defined for this company. To fetch this list, add the query string "?$include=TaxCodes" to your URL.
     */
    public void setTaxCodes(TaxCodeModel[] value) {
        this.taxCodes = value;
    }


    private TaxRuleModel[] taxRules;

    /**
     * Getter for taxRules
     *
     * Optional: A list of tax rules defined for this company. To fetch this list, add the query string "?$include=TaxRules" to your URL.
     */
    public TaxRuleModel[] getTaxRules() {
        return this.taxRules;
    }

    /**
     * Setter for taxRules
     *
     * Optional: A list of tax rules defined for this company. To fetch this list, add the query string "?$include=TaxRules" to your URL.
     */
    public void setTaxRules(TaxRuleModel[] value) {
        this.taxRules = value;
    }


    private UPCModel[] upcs;

    /**
     * Getter for upcs
     *
     * Optional: A list of UPCs defined for this company. To fetch this list, add the query string "?$include=UPCs" to your URL.
     */
    public UPCModel[] getUpcs() {
        return this.upcs;
    }

    /**
     * Setter for upcs
     *
     * Optional: A list of UPCs defined for this company. To fetch this list, add the query string "?$include=UPCs" to your URL.
     */
    public void setUpcs(UPCModel[] value) {
        this.upcs = value;
    }


    /**
     * Returns a JSON string representation of CompanyModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
