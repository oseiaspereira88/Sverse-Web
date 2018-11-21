package sverseweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class NotaServiceSpec extends Specification {

    NotaService notaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Nota(...).save(flush: true, failOnError: true)
        //new Nota(...).save(flush: true, failOnError: true)
        //Nota nota = new Nota(...).save(flush: true, failOnError: true)
        //new Nota(...).save(flush: true, failOnError: true)
        //new Nota(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //nota.id
    }

    void "test get"() {
        setupData()

        expect:
        notaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Nota> notaList = notaService.list(max: 2, offset: 2)

        then:
        notaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        notaService.count() == 5
    }

    void "test delete"() {
        Long notaId = setupData()

        expect:
        notaService.count() == 5

        when:
        notaService.delete(notaId)
        sessionFactory.currentSession.flush()

        then:
        notaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Nota nota = new Nota()
        notaService.save(nota)

        then:
        nota.id != null
    }
}
