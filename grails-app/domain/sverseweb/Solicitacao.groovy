package sverseweb

import seguranca.Usuario

class Solicitacao {
    String tipo;
    String estado;
    String descricao;
    Date dataSolicitacao
    static hasOne = [usuarioSolicitante: Usuario]
    static hasMany = [usuariosSolicitados: Usuario]


    static constraints = {
        tipo(nullable: false, blank: false, unique:false, inList: ["Solicitacao de Amizade","Solicitacao de Participação"])
        estado(nullable: false, blank: false, unique:false, inList: ["Solicitado", "Aceito", "Rejeitado"])
        descricao(nullable: false, blank: false, maxSize: 100, unique:false)
        dataSolicitacao(nullable: false, blank: false, unique:false)
    }
}
