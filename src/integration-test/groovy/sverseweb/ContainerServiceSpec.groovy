package sverseweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ContainerServiceSpec extends Specification {

    ContainerService containerService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Container(...).save(flush: true, failOnError: true)
        //new Container(...).save(flush: true, failOnError: true)
        //Container container = new Container(...).save(flush: true, failOnError: true)
        //new Container(...).save(flush: true, failOnError: true)
        //new Container(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //container.id
    }

    void "test get"() {
        setupData()

        expect:
        containerService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Container> containerList = containerService.list(max: 2, offset: 2)

        then:
        containerList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        containerService.count() == 5
    }

    void "test delete"() {
        Long containerId = setupData()

        expect:
        containerService.count() == 5

        when:
        containerService.delete(containerId)
        sessionFactory.currentSession.flush()

        then:
        containerService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Container container = new Container()
        containerService.save(container)

        then:
        container.id != null
    }
}
