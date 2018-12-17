package sverseweb

class Envio {

    static belongsTo = [usuario:Usuario]
    static hasOne = [destinatario: Usuario]
    static hasMany = [itens:ItemEnvio]

    static constraints = {
    }
}
