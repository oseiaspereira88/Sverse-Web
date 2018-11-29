package sverseweb

import grails.gorm.services.Service

@Service(EstudoPessoal)
interface EstudoPessoalService {

    EstudoPessoal get(Serializable id)

    List<EstudoPessoal> list(Map args)

    Long count()

    void delete(Serializable id)

    EstudoPessoal save(EstudoPessoal estudoPessoal)

}