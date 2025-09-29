/*
 * Copyright (c) 2025. mCruncher Sdn Bhd, Cyberjaya, Malaysia.
 * All rights reserved.
 */

package org.example;

/**
 * @author joel
 * @since 10.2.0
 */
public class Bank implements Expression
{
    Money reduce(Expression source, String to)
    {
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }
}
