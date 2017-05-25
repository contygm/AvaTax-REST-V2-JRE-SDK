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
 * Worksheet Checkup Report Suggested Form Model
 */
public class FilingsCheckupSuggestedFormModel {


    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * Tax Authority ID of the suggested form returned
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * Tax Authority ID of the suggested form returned
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }


    private string country;

    /**
     * Getter for country
     *
     * Country of the suggested form returned
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Country of the suggested form returned
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * Region of the suggested form returned
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Region of the suggested form returned
     */
    public void setRegion(string value) {
        this.region = value;
    }


    private string returnName;

    /**
     * Getter for returnName
     *
     * 
     */
    public string getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName
     *
     * 
     */
    public void setReturnName(string value) {
        this.returnName = value;
    }


    private string taxFormCode;

    /**
     * Getter for taxFormCode
     *
     * Name of the suggested form returned
     */
    public string getTaxFormCode() {
        return this.taxFormCode;
    }

    /**
     * Setter for taxFormCode
     *
     * Name of the suggested form returned
     */
    public void setTaxFormCode(string value) {
        this.taxFormCode = value;
    }


    /**
     * Returns a JSON string representation of FilingsCheckupSuggestedFormModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
