package sverseweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class AtividadeServiceSpec extends Specification {

    AtividadeService atividadeService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Atividade(...).save(flush: true, failOnError: true)
        //new Atividade(...).save(flush: true, failOnError: true)
        //Atividade atividade = new Atividade(...).save(flush: true, failOnError: true)
        //new Atividade(...).save(flush: true, failOnError: true)
        //new Atividade(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //atividade.id
    }

    void "test get"() {
        setupData()

        expect:
        atividadeService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Atividade> atividadeList = atividadeService.list(max: 2, offset: 2)

        then:
        atividadeList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        atividadeService.count() == 5
    }

    void "test delete"() {
        Long atividadeId = setupData()

        expect:
        atividadeService.count() == 5

        when:
        atividadeService.delete(atividadeId)
        sessionFactory.currentSession.flush()

        then:
        atividadeService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Atividade atividade = new Atividade()
        atividadeService.save(atividade)

        then:
        atividade.id != null
    }
}
