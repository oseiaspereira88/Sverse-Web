package sverseweb

import grails.gorm.services.Service

@Service(Nota)
interface NotaService {

    Nota get(Serializable id)

    List<Nota> list(Map args)

    Long count()

    void delete(Serializable id)

    Nota save(Nota nota)

}