package sverseweb

class Nota{

    String titulo
    String texto
    Integer nCor
    Integer nEmoji
    String tag
    Date data_de_criacao
    Date data_de_atualizacao

    static constraints = {
        titulo(nullable: false, blank: false,        maxSize: 100, unique:true)
        texto(nullable: false, blank: false,        maxSize: 100, unique:true)
        nCor(nullable: false, blank: false,        maxSize: 100, unique:true)
        nEmoji(nullable: false, blank: false,        maxoSize: 100, unique:true)
        tag(nullable: false, blank: false,        maxoSize: 100, unique:true)
        data_de_criacao(nullable: false, blank: false,        maxoSize: 100, unique:true)
        data_de_atualizacao(nullable: false, blank: false,        maxSize: 100, unique:true)
    }
}
