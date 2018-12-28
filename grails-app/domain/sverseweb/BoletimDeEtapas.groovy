package sverseweb

class BoletimDeEtapas {

    static constraints = {
    }
    static belongsTo = [usuario: MyUsuario]
    static hasMany = [estapas : Etapa]
}
