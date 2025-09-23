package org.example

import spock.lang.Specification

class EqualSpec extends Specification
{
    def "Equals"()
    {
        expect:
        new Dollar(5) == new Dollar(5)
        new Franc(5) == new Franc(5)

        and:
        new Dollar(5) != new Dollar(6)
        new Franc(5) != new Franc(6)

        and:
        new Franc(5) != new Dollar(5)
    }
}
