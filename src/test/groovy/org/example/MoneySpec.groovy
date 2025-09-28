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

    def "Plus with reduce"()
    {
        given:
        Money five= Money.dollar(5)
        Expression sum= five.plus(five)
        Bank bank= new Bank()

        when:
        Money reduced= bank.reduce(sum, "USD")

        then:
        Money.dollar(10) == reduced
    }
}
