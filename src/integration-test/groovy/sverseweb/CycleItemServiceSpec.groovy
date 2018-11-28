package sverseweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CycleItemServiceSpec extends Specification {

    CycleItemService cycleItemService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CycleItem(...).save(flush: true, failOnError: true)
        //new CycleItem(...).save(flush: true, failOnError: true)
        //CycleItem cycleItem = new CycleItem(...).save(flush: true, failOnError: true)
        //new CycleItem(...).save(flush: true, failOnError: true)
        //new CycleItem(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //cycleItem.id
    }

    void "test get"() {
        setupData()

        expect:
        cycleItemService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CycleItem> cycleItemList = cycleItemService.list(max: 2, offset: 2)

        then:
        cycleItemList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        cycleItemService.count() == 5
    }

    void "test delete"() {
        Long cycleItemId = setupData()

        expect:
        cycleItemService.count() == 5

        when:
        cycleItemService.delete(cycleItemId)
        sessionFactory.currentSession.flush()

        then:
        cycleItemService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CycleItem cycleItem = new CycleItem()
        cycleItemService.save(cycleItem)

        then:
        cycleItem.id != null
    }
}
