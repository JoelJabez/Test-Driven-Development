package org.example;

public abstract class Money
{
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object)
    {
        Money dollar = (Money) object;
        return amount == dollar.amount;
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    String currency() {
        return currency;
    }
}
