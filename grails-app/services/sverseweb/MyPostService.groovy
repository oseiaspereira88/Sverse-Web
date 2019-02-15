package sverseweb

import grails.gorm.services.Service

@Service(MyPost)
interface MyPostService {

    MyPost get(Serializable id)

    List<MyPost> list(Map args)

    Long count()

    void delete(Serializable id)

    MyPost save(MyPost post)

}
