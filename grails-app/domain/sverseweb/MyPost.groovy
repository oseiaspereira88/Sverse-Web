package sverseweb

import seguranca.Usuario

class MyPost {
    String tipo
    Integer containerId
    Date dataDePublicacao

    static belongsTo = Usuario
    static hasMany = [comentarios: Comentario, publico: Usuario]

    static constraints = {
        tipo(nullable: false, blank: false, unique: false, inList: [
                "Container Publico",
                "Solicitacao de Amizade",
                "Solitacao de Participacao",
                "Adicao de Participante",
                "Aviso de Estudo",
                "Aviso do Sistema"])
        containerId(nullable: true, blank: false, unique: false)
        dataDePublicacao(nullable: false, blank: false, unique: false)
    }
}
