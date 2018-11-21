package sverseweb

import grails.gorm.services.Service

@Service(Estudo)
interface EstudoService {

    Estudo get(Serializable id)

    List<Estudo> list(Map args)

    Long count()

    void delete(Serializable id)

    Estudo save(Estudo estudo)

}