package sverseweb

class BoletimDeEtapas {

    static constraints = {
    }
    static belongsTo = [usuario: Usuario]
    static hasMany = [estapas : Etapa]
}
