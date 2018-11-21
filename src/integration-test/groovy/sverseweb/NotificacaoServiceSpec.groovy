package sverseweb

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class NotificacaoServiceSpec extends Specification {

    NotificacaoService notificacaoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Notificacao(...).save(flush: true, failOnError: true)
        //new Notificacao(...).save(flush: true, failOnError: true)
        //Notificacao notificacao = new Notificacao(...).save(flush: true, failOnError: true)
        //new Notificacao(...).save(flush: true, failOnError: true)
        //new Notificacao(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //notificacao.id
    }

    void "test get"() {
        setupData()

        expect:
        notificacaoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Notificacao> notificacaoList = notificacaoService.list(max: 2, offset: 2)

        then:
        notificacaoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        notificacaoService.count() == 5
    }

    void "test delete"() {
        Long notificacaoId = setupData()

        expect:
        notificacaoService.count() == 5

        when:
        notificacaoService.delete(notificacaoId)
        sessionFactory.currentSession.flush()

        then:
        notificacaoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Notificacao notificacao = new Notificacao()
        notificacaoService.save(notificacao)

        then:
        notificacao.id != null
    }
}
