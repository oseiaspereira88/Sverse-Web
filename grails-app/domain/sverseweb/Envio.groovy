package sverseweb

class Envio {
    Usuario destinatario
    static belongsTo = [emissor:Usuario]
    static hasMany = [itens:ItemEnvio]

    static constraints = {
    }
}
