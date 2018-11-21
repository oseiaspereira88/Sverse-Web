package sverseweb

import grails.gorm.services.Service

@Service(Container)
interface ContainerService {

    Container get(Serializable id)

    List<Container> list(Map args)

    Long count()

    void delete(Serializable id)

    Container save(Container container)

}