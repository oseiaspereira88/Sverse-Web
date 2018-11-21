package sverseweb

import grails.gorm.services.Service

@Service(Notificacao)
interface NotificacaoService {

    Notificacao get(Serializable id)

    List<Notificacao> list(Map args)

    Long count()

    void delete(Serializable id)

    Notificacao save(Notificacao notificacao)

}