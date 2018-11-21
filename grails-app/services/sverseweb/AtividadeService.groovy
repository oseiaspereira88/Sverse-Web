package sverseweb

import grails.gorm.services.Service

@Service(Atividade)
interface AtividadeService {

    Atividade get(Serializable id)

    List<Atividade> list(Map args)

    Long count()

    void delete(Serializable id)

    Atividade save(Atividade atividade)

}