package sverseweb

class Professor {

    String nome
    Integer numeroDaImagem
    String tipo
    Integer numeroDeNotificacoes

    static constraints = {
        nome(nullable: false, blank: false,        maxSize: 100, unique:true)
        numeroDaImagem(nullable: false, blank: false,        maxSize: 100, unique:true)
        tipo(nullable: false, blank: false,        maxoSize: 100, unique:true)
    }
}
