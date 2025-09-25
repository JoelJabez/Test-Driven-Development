package org.example

import spock.lang.Specification

class MoneySpec extends Specification
{
    def "test equality"() {
        expect:
        Money.dollar(5) == Money.dollar(5)
        Money.dollar(5) != Money.dollar(6)
        Money.franc(5)  != Money.dollar(5)
    }

    def "test multiplication"() {
        given:
        def five = Money.dollar(5)

        expect:
        five.times(2) == Money.dollar(10)
        five.times(3) == Money.dollar(15)
    }

    def "Plus"()
    {
        given:
        Money sum = Money.dollar(5).plus(Money.dollar(5));

        expect:
        Money.dollar(10) == sum
    }
}
