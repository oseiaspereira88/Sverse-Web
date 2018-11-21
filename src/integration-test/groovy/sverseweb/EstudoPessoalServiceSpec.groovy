package sverseweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EstudoPessoalServiceSpec extends Specification {

    EstudoPessoalService estudoPessoalService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new EstudoPessoal(...).save(flush: true, failOnError: true)
        //new EstudoPessoal(...).save(flush: true, failOnError: true)
        //EstudoPessoal estudoPessoal = new EstudoPessoal(...).save(flush: true, failOnError: true)
        //new EstudoPessoal(...).save(flush: true, failOnError: true)
        //new EstudoPessoal(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //estudoPessoal.id
    }

    void "test get"() {
        setupData()

        expect:
        estudoPessoalService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<EstudoPessoal> estudoPessoalList = estudoPessoalService.list(max: 2, offset: 2)

        then:
        estudoPessoalList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        estudoPessoalService.count() == 5
    }

    void "test delete"() {
        Long estudoPessoalId = setupData()

        expect:
        estudoPessoalService.count() == 5

        when:
        estudoPessoalService.delete(estudoPessoalId)
        sessionFactory.currentSession.flush()

        then:
        estudoPessoalService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        EstudoPessoal estudoPessoal = new EstudoPessoal()
        estudoPessoalService.save(estudoPessoal)

        then:
        estudoPessoal.id != null
    }
}
