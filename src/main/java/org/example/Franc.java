/*
 * Copyright (c) 2025. mCruncher Sdn Bhd, Cyberjaya, Malaysia.
 * All rights reserved.
 */

package org.example;

/**
 * @author joel
 * @since 10.2.0
 */
public class Franc extends Money
{
    public Franc(int amount)
    {
        this.amount = amount;
    }

    Franc times(int rate)
    {
        return new Franc(amount * rate);
    }
}
