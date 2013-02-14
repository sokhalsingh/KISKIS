/*
 * Copyright (C) 2004 by Tobias Buchloh.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this program; if not, write to the Free
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * If you didn't download this code from the following link, you should check if
 * you aren't using an obsolete version:
 * http://www.sourceforge.net/projects/kiskis
 */

/* Generated by Together */

package de.tbuchloh.kiskis.model;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

import de.tbuchloh.kiskis.model.annotations.SecretInfo;

/**
 * <b>CreditCard</b>: a Credit Card has a number, a deploying bank and an
 * expiration Date.
 * 
 * @author gandalf
 * @version $Id: CreditCard.java,v 1.9 2007/02/18 14:37:29 tbuchloh Exp $
 */
public class CreditCard extends SecuredElement implements Cloneable {

    private static final Calendar INVALID = new GregorianCalendar(0, 0, 0);

    private static final long serialVersionUID = 1L;

    @SecretInfo
    private String _deployer;

    private Calendar _expDate;

    @SecretInfo
    private String _number;

    @SecretInfo
    private char[] _pin;

    @SecretInfo
    private String _cardValidationCode;

    /**
     * creates a new CreditCard.
     */
    public CreditCard() {
        super();
        _number = "";
        _deployer = "";
        _expDate = INVALID;
        _cardValidationCode = "";
        _pin = new char[0];
    }

    /**
     * @see java.lang.Object#clone()
     */
    @Override
    public CreditCard clone() {
        CreditCard inst = null;
        inst = (CreditCard) super.clone();
        inst._number = this._number == null ? null : this._number;
        inst._deployer = this._deployer == null ? null : this._deployer;
        inst._expDate = this._expDate == null ? null : (Calendar) this._expDate
                .clone();
        inst._cardValidationCode = this._cardValidationCode;
        return inst;
    }

    /**
     * Overridden!
     * 
     * @see de.tbuchloh.kiskis.model.ModelNode#contains(Pattern)
     */
    @Override
    public boolean contains(final Pattern regex) {
        return super.contains(regex) || regex.matcher(_deployer).matches()
        || regex.matcher(_number).matches();
    }

    /**
     * @return the deploying bank
     */
    public String getDeployer() {
        return _deployer;
    }

    /**
     * @return the expiration date
     */
    public Calendar getExpDate() {
        return _expDate;
    }

    /**
     * @return the card number
     */
    public String getNumber() {
        return _number;
    }

    /**
     * @return Returns the pin.
     */
    public final char[] getPin() {
        return _pin.clone();
    }

    @Override
    public boolean matches(final SecuredElement other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCard)) {
            return false;
        }
        final CreditCard castOther = (CreditCard) other;
        return super.matches(other) && _number.equals(castOther._number)
        && _deployer.equals(castOther._deployer)
        && _expDate.equals(castOther._expDate)
        && Arrays.equals(_pin, castOther._pin);
    }

    /**
     * @param string
     *            the deploying bank
     */
    public void setDeployer(final String string) {
        _deployer = string;
    }

    /**
     * @param calendar
     *            the expiration date
     */
    public void setExpDate(final Calendar calendar) {
        _expDate = calendar;
    }

    /**
     * @param string
     *            the card number.
     */
    public void setNumber(final String string) {
        _number = string;
    }

    /**
     * @param pin
     *            The pin to set.
     */
    public final void setPin(final char[] pin) {
        _pin = pin.clone();
    }

    /**
     * Overridden!
     * 
     * @see de.tbuchloh.kiskis.model.ModelNode#visit(de.tbuchloh.kiskis.model.ModelNodeVisitor)
     */
    @Override
    public void visit(final ModelNodeVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * @return the cardValidationCode
     */
    public String getCardValidationCode() {
        return _cardValidationCode;
    }

    /**
     * @param cardValidationCode
     *            {@link cardValidationCode}
     */
    public void setCardValidationCode(String cardValidationCode) {
        _cardValidationCode = cardValidationCode;
    }
}