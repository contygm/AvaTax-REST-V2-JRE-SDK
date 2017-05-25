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
 * Approve a set of filings.
 */
public class ApproveFilingsModel {


    private boolean approve;

    /**
     * Getter for approve
     *
     * Set this value to true in order to approve the filings.
     */
    public boolean getApprove() {
        return this.approve;
    }

    /**
     * Setter for approve
     *
     * Set this value to true in order to approve the filings.
     */
    public void setApprove(boolean value) {
        this.approve = value;
    }


    /**
     * Returns a JSON string representation of ApproveFilingsModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
