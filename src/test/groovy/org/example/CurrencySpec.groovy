package org.example

import spock.lang.Specification

class CurrencySpec extends Specification {

    def "Multiplication"() {
        given:
        def five = Money.dollar(5)

        expect:
        five.times(2) == new Money(10, "USD")
        five.times(3) == new Money(15, "USD")
    }

    def "quality"() {
        expect:
        Money.dollar(5) == Money.dollar(5)
        Money.dollar(5) != Money.dollar(6)
        Money.franc(5) != Money.dollar(5)
    }

    def "Currency"() {
        expect:
        Money.dollar(1).currency() == "USD"
        Money.franc(1).currency() == "CHF"
    }

    def "Different class equality"() {
        expect:
        new Money(10, "CHF") == new Franc(10, "CHF")
    }
}
