package sverseweb

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class MyPostSpec extends Specification implements DomainUnitTest<MyPost> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
