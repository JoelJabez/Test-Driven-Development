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
    Dollar(int amount, String currency)
    {
        super(amount, currency);
    }

    Money times(int multiplier)
    {
        return Money.dollar(amount * multiplier);
    }
}
