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
 * Create a transaction
 */
public class CreateTransactionModel {


    private DocumentType type;

    /**
     * Getter for type
     *
     * Document Type: if not specified, a document with type of SalesOrder will be created by default
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Document Type: if not specified, a document with type of SalesOrder will be created by default
     */
    public void setType(DocumentType value) {
        this.type = value;
    }


    private string code;

    /**
     * Getter for code
     *
     * Transaction Code - the internal reference code used by the client application. This is used for operations such as
    * Get, Adjust, Settle, and Void. If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public string getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Transaction Code - the internal reference code used by the client application. This is used for operations such as
    * Get, Adjust, Settle, and Void. If you leave the transaction code blank, a GUID will be assigned to each transaction.
     */
    public void setCode(string value) {
        this.code = value;
    }


    private string companyCode;

    /**
     * Getter for companyCode
     *
     * Company Code - Specify the code of the company creating this transaction here. If you leave this value null,
    * your account's default company will be used instead.
     */
    public string getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Company Code - Specify the code of the company creating this transaction here. If you leave this value null,
    * your account's default company will be used instead.
     */
    public void setCompanyCode(string value) {
        this.companyCode = value;
    }


    private Instant date;

    /**
     * Getter for date
     *
     * Transaction Date - The date on the invoice, purchase order, etc.
     */
    public Instant getDate() {
        return this.date;
    }

    /**
     * Setter for date
     *
     * Transaction Date - The date on the invoice, purchase order, etc.
     */
    public void setDate(Instant value) {
        this.date = value;
    }


    private string salespersonCode;

    /**
     * Getter for salespersonCode
     *
     * Salesperson Code - The client application salesperson reference code.
     */
    public string getSalespersonCode() {
        return this.salespersonCode;
    }

    /**
     * Setter for salespersonCode
     *
     * Salesperson Code - The client application salesperson reference code.
     */
    public void setSalespersonCode(string value) {
        this.salespersonCode = value;
    }


    private string customerCode;

    /**
     * Getter for customerCode
     *
     * Customer Code - The client application customer reference code.
     */
    public string getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * Customer Code - The client application customer reference code.
     */
    public void setCustomerCode(string value) {
        this.customerCode = value;
    }


    private string customerUsageType;

    /**
     * Getter for customerUsageType
     *
     * Customer Usage Type - The client application customer or usage type. For a list of 
    * available usage types, see `/api/v2/definitions/entityusecodes`.
     */
    public string getCustomerUsageType() {
        return this.customerUsageType;
    }

    /**
     * Setter for customerUsageType
     *
     * Customer Usage Type - The client application customer or usage type. For a list of 
    * available usage types, see `/api/v2/definitions/entityusecodes`.
     */
    public void setCustomerUsageType(string value) {
        this.customerUsageType = value;
    }


    private Decimal discount;

    /**
     * Getter for discount
     *
     * Discount - The discount amount to apply to the document. This value will be applied only to lines
    * that have the `discounted` flag set to true. If no lines have `discounted` set to true, this discount
    * cannot be applied.
     */
    public Decimal getDiscount() {
        return this.discount;
    }

    /**
     * Setter for discount
     *
     * Discount - The discount amount to apply to the document. This value will be applied only to lines
    * that have the `discounted` flag set to true. If no lines have `discounted` set to true, this discount
    * cannot be applied.
     */
    public void setDiscount(Decimal value) {
        this.discount = value;
    }


    private string purchaseOrderNo;

    /**
     * Getter for purchaseOrderNo
     *
     * Purchase Order Number for this document
    * This is required for single use exemption certificates to match the order and invoice with the certificate.
     */
    public string getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    /**
     * Setter for purchaseOrderNo
     *
     * Purchase Order Number for this document
    * This is required for single use exemption certificates to match the order and invoice with the certificate.
     */
    public void setPurchaseOrderNo(string value) {
        this.purchaseOrderNo = value;
    }


    private string exemptionNo;

    /**
     * Getter for exemptionNo
     *
     * Exemption Number for this document
     */
    public string getExemptionNo() {
        return this.exemptionNo;
    }

    /**
     * Setter for exemptionNo
     *
     * Exemption Number for this document
     */
    public void setExemptionNo(string value) {
        this.exemptionNo = value;
    }


    private AddressesModel addresses;

    /**
     * Getter for addresses
     *
     * Default addresses for all lines in this document
     */
    public AddressesModel getAddresses() {
        return this.addresses;
    }

    /**
     * Setter for addresses
     *
     * Default addresses for all lines in this document
     */
    public void setAddresses(AddressesModel value) {
        this.addresses = value;
    }


    private LineItemModel[] lines;

    /**
     * Getter for lines
     *
     * Document line items list
     */
    public LineItemModel[] getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * Document line items list
     */
    public void setLines(LineItemModel[] value) {
        this.lines = value;
    }


    private object parameters;

    /**
     * Getter for parameters
     *
     * Special parameters for this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public object getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * Special parameters for this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public void setParameters(object value) {
        this.parameters = value;
    }


    private string referenceCode;

    /**
     * Getter for referenceCode
     *
     * Reference Code used to reference the original document for a return invoice
     */
    public string getReferenceCode() {
        return this.referenceCode;
    }

    /**
     * Setter for referenceCode
     *
     * Reference Code used to reference the original document for a return invoice
     */
    public void setReferenceCode(string value) {
        this.referenceCode = value;
    }


    private string reportingLocationCode;

    /**
     * Getter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public string getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
     */
    public void setReportingLocationCode(string value) {
        this.reportingLocationCode = value;
    }


    private object commit;

    /**
     * Getter for commit
     *
     * Causes the document to be committed if true. This option is only applicable for invoice document 
    * types, not orders.
     */
    public object getCommit() {
        return this.commit;
    }

    /**
     * Setter for commit
     *
     * Causes the document to be committed if true. This option is only applicable for invoice document 
    * types, not orders.
     */
    public void setCommit(object value) {
        this.commit = value;
    }


    private string batchCode;

    /**
     * Getter for batchCode
     *
     * BatchCode for batch operations.
     */
    public string getBatchCode() {
        return this.batchCode;
    }

    /**
     * Setter for batchCode
     *
     * BatchCode for batch operations.
     */
    public void setBatchCode(string value) {
        this.batchCode = value;
    }


    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride
     *
     * Specifies a tax override for the entire document
     */
    public TaxOverrideModel getTaxOverride() {
        return this.taxOverride;
    }

    /**
     * Setter for taxOverride
     *
     * Specifies a tax override for the entire document
     */
    public void setTaxOverride(TaxOverrideModel value) {
        this.taxOverride = value;
    }


    private string currencyCode;

    /**
     * Getter for currencyCode
     *
     * 3 character ISO 4217 currency code.
     */
    public string getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * 3 character ISO 4217 currency code.
     */
    public void setCurrencyCode(string value) {
        this.currencyCode = value;
    }


    private ServiceMode serviceMode;

    /**
     * Getter for serviceMode
     *
     * Specifies whether the tax calculation is handled Local, Remote, or Automatic (default). This only 
    * applies when using an AvaLocal server.
     */
    public ServiceMode getServiceMode() {
        return this.serviceMode;
    }

    /**
     * Setter for serviceMode
     *
     * Specifies whether the tax calculation is handled Local, Remote, or Automatic (default). This only 
    * applies when using an AvaLocal server.
     */
    public void setServiceMode(ServiceMode value) {
        this.serviceMode = value;
    }


    private Decimal exchangeRate;

    /**
     * Getter for exchangeRate
     *
     * Currency exchange rate from this transaction to the company base currency.
     */
    public Decimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Setter for exchangeRate
     *
     * Currency exchange rate from this transaction to the company base currency.
     */
    public void setExchangeRate(Decimal value) {
        this.exchangeRate = value;
    }


    private Instant exchangeRateEffectiveDate;

    /**
     * Getter for exchangeRateEffectiveDate
     *
     * Effective date of the exchange rate.
     */
    public Instant getExchangeRateEffectiveDate() {
        return this.exchangeRateEffectiveDate;
    }

    /**
     * Setter for exchangeRateEffectiveDate
     *
     * Effective date of the exchange rate.
     */
    public void setExchangeRateEffectiveDate(Instant value) {
        this.exchangeRateEffectiveDate = value;
    }


    private string posLaneCode;

    /**
     * Getter for posLaneCode
     *
     * Sets the POS Lane Code sent by the User for this document.
     */
    public string getPosLaneCode() {
        return this.posLaneCode;
    }

    /**
     * Setter for posLaneCode
     *
     * Sets the POS Lane Code sent by the User for this document.
     */
    public void setPosLaneCode(string value) {
        this.posLaneCode = value;
    }


    private string businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo
     *
     * VAT business identification number for the customer for this transaction. This number will be used for all lines 
    * in the transaction, except for those lines where you have defined a different business identification number.
    * 
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a 
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public string getBusinessIdentificationNo() {
        return this.businessIdentificationNo;
    }

    /**
     * Setter for businessIdentificationNo
     *
     * VAT business identification number for the customer for this transaction. This number will be used for all lines 
    * in the transaction, except for those lines where you have defined a different business identification number.
    * 
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a 
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public void setBusinessIdentificationNo(string value) {
        this.businessIdentificationNo = value;
    }


    private object isSellerImporterOfRecord;

    /**
     * Getter for isSellerImporterOfRecord
     *
     * Specifies if the Transaction has the seller as IsSellerImporterOfRecord
     */
    public object getIsSellerImporterOfRecord() {
        return this.isSellerImporterOfRecord;
    }

    /**
     * Setter for isSellerImporterOfRecord
     *
     * Specifies if the Transaction has the seller as IsSellerImporterOfRecord
     */
    public void setIsSellerImporterOfRecord(object value) {
        this.isSellerImporterOfRecord = value;
    }


    private string description;

    /**
     * Getter for description
     *
     * Description
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description
     */
    public void setDescription(string value) {
        this.description = value;
    }


    private string email;

    /**
     * Getter for email
     *
     * Email
     */
    public string getEmail() {
        return this.email;
    }

    /**
     * Setter for email
     *
     * Email
     */
    public void setEmail(string value) {
        this.email = value;
    }


    private TaxDebugLevel debugLevel;

    /**
     * Getter for debugLevel
     *
     * If the user wishes to request additional debug information from this transaction, specify a level higher than 'normal'
     */
    public TaxDebugLevel getDebugLevel() {
        return this.debugLevel;
    }

    /**
     * Setter for debugLevel
     *
     * If the user wishes to request additional debug information from this transaction, specify a level higher than 'normal'
     */
    public void setDebugLevel(TaxDebugLevel value) {
        this.debugLevel = value;
    }


    /**
     * Returns a JSON string representation of CreateTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
