package sverseweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EstudoServiceSpec extends Specification {

    EstudoService estudoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Estudo(...).save(flush: true, failOnError: true)
        //new Estudo(...).save(flush: true, failOnError: true)
        //Estudo estudo = new Estudo(...).save(flush: true, failOnError: true)
        //new Estudo(...).save(flush: true, failOnError: true)
        //new Estudo(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //estudo.id
    }

    void "test get"() {
        setupData()

        expect:
        estudoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Estudo> estudoList = estudoService.list(max: 2, offset: 2)

        then:
        estudoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        estudoService.count() == 5
    }

    void "test delete"() {
        Long estudoId = setupData()

        expect:
        estudoService.count() == 5

        when:
        estudoService.delete(estudoId)
        sessionFactory.currentSession.flush()

        then:
        estudoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Estudo estudo = new Estudo()
        estudoService.save(estudo)

        then:
        estudo.id != null
    }
}
