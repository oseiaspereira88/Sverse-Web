package sverseweb

import grails.gorm.services.Service

@Service(CycleItem)
interface CycleItemService {

    CycleItem get(Serializable id)

    List<CycleItem> list(Map args)

    Long count()

    void delete(Serializable id)

    CycleItem save(CycleItem cycleItem)

}