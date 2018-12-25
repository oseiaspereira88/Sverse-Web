package sverseweb

class Lixeira {
    Usuario usuario;
    static hasMany = [itensLixeira : ItemLixeira]

    static constraints = {
        usuario(nullable: true, blank: true, unique:false)
    }
}
