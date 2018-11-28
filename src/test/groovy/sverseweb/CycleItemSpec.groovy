package sverseweb

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CycleItemSpec extends Specification implements DomainUnitTest<CycleItem> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
