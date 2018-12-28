package sverseweb

import grails.gorm.services.Service

@Service(MyUsuario)
interface UsuarioService {

    MyUsuario get(Serializable id)

    List<MyUsuario> list(Map args)

    Long count()

    void delete(Serializable id)

    MyUsuario save(MyUsuario usuario)

}