package sverseweb

class Lixeira {
    static belongsTo = [MyUsuario]
    static hasMany = [itensLixeira : ItemLixeira]

    static constraints = {
        usuario(nullable: true, blank: true, unique:false)
    }
}
