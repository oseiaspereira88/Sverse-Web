package sverseweb

class Container {
    String nome
    Integer numeroDaImagem
    String tipo
    Integer numeroDeNotificacoes
    Date data_de_criacao
    Date data_de_atualizacao

    static constraints = {
        nome(nullable: false, blank: false,        maxSize: 100, unique:true)
        numeroDaImagem(nullable: false, blank: false,        maxSize: 100, unique:true)
        tipo(nullable: false, blank: false,        maxoSize: 100, unique:true)
        data_de_criacao(nullable: false, blank: false,        maxoSize: 100, unique:true)
        data_de_atualizacao(nullable: false, blank: false,        maxSize: 100, unique:true)
    }
}
