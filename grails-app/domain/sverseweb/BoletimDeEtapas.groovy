package sverseweb

class BoletimDeEtapas {

    static constraints = {
    }
    static belongsTo = [usuari: Usuario]
    static hasMany = [estapas : Etapa]
}
