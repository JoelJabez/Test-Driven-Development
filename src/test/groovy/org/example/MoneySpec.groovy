package org.example

import spock.lang.Specification

class MoneySpec extends Specification
{
//    def "test equality"() {
//        expect:
//        Money.dollar(5) == Money.dollar(5)
//        Money.dollar(5) != Money.dollar(6)
//        Money.franc(5)  != Money.dollar(5)
//    }
//
//    def "test multiplication"() {
//        given:
//        def five = Money.dollar(5)
//
//        expect:
//        five.times(2) == Money.dollar(10)
//        five.times(3) == Money.dollar(15)
//    }
//
//    def "Plus"()
//    {
//        given:
//        Money sum = Money.dollar(5).plus(Money.dollar(5))
//
//        expect:
//        Money.dollar(10) == sum
//    }
//
//    def "Plus 1"()
//    {
//        given:
//        Money five= Money.dollar(5)
//        Expression sum = five.plus(five)
//        Bank bank= new Bank()
//
//        when:
//        Money reduced= bank.reduce(sum, "USD")
//
//        then:
//        Money.dollar(10) ==  reduced
//    }
//
//    def "Plus return sum"()
//    {
//        given:
//        Money five= Money.dollar(5)
//        Expression result = five.plus(five)
//        Sum sum = (Sum) result
//
//        expect:
//        five == sum.augend
//        five == sum.addend
//    }

    def "Reduce money difference currency"()
    {
        setup:
        Bank bank = new Bank()
//        bank.addRate("CHF", "USD", 2)

        when:
        Money result = bank.reduce(Money.franc(2), "USD")

        then:
        Money.dollar(1) == result
    }

    def "Identity Bank"()
    {
        expect:
        new Bank().rate("USD", "USD") == 1
    }
}
