package sverseweb

class Envio {
    static belongsTo = [emissor:MyUsuario, destinatario:MyUsuario]
    static hasMany = [itens:ItemEnvio]

    static constraints = {
    }
}
