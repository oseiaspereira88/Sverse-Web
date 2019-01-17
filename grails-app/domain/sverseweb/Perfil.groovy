package sverseweb

import seguranca.Usuario

class Perfil {
    String imgPerfil
    String email
    String trello
    String github
    String contato
    String biografia
    Integer nFollowing
    Integer nFollowers

    static belongsTo = Usuario
    static constraints = {
        imgPerfil(nullable: false, blank: false, maxSize: 100, unique:true)
        email(nullable: false, blank: false, email: true, maxSize: 100, unique:true)
        trello(nullable: false, blank: false, maxSize: 100, unique:true)
        github(nullable: false, blank: false, maxSize: 100, unique:true)
        contato(nullable: false, blank: false,  maxSize: 100, unique:true)
        biografia(nullable: false, blank: false, maxSize: 100, unique:false)
        nFollowing(nullable: false, blank: false, maxSize: 100, unique:false)
        nFollowers(nullable: false, blank: false, maxSize: 100, unique:false)
    }
}
