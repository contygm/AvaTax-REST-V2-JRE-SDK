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
 * Cycle Safe Expiration results.
 */
public class CycleExpireModel {


    private object success;

    /**
     * Getter for success
     *
     * Whether or not the filing calendar can be expired.
    * e.g. if user makes end date of a calendar earlier than latest filing, this would be set to false.
     */
    public object getSuccess() {
        return this.success;
    }

    /**
     * Setter for success
     *
     * Whether or not the filing calendar can be expired.
    * e.g. if user makes end date of a calendar earlier than latest filing, this would be set to false.
     */
    public void setSuccess(object value) {
        this.success = value;
    }


    private string message;

    /**
     * Getter for message
     *
     * The message to present to the user if expiration is successful or unsuccessful.
     */
    public string getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The message to present to the user if expiration is successful or unsuccessful.
     */
    public void setMessage(string value) {
        this.message = value;
    }


    private CycleExpireOptionModel[] cycleExpirationOptions;

    /**
     * Getter for cycleExpirationOptions
     *
     * A list of options for expiring the filing calendar.
     */
    public CycleExpireOptionModel[] getCycleExpirationOptions() {
        return this.cycleExpirationOptions;
    }

    /**
     * Setter for cycleExpirationOptions
     *
     * A list of options for expiring the filing calendar.
     */
    public void setCycleExpirationOptions(CycleExpireOptionModel[] value) {
        this.cycleExpirationOptions = value;
    }


    /**
     * Returns a JSON string representation of CycleExpireModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
