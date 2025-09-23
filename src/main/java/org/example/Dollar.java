/*
 * Copyright (c) 2025. mCruncher Sdn Bhd, Cyberjaya, Malaysia.
 * All rights reserved.
 */

package org.example;

/**
 * @author joel
 * @since 10.2.0
 */
public class Dollar extends Money
{
    public Dollar(int amount)
    {
        this.amount = amount;
    }

    Dollar times(int rate)
    {
        return new Dollar(amount * rate);
    }
}
