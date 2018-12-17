package sverseweb

class Lixeira {

    static constraints = {
    }
    static belongsTo = [usuario : Usuario,
                        itensLixeira : ItemLixeira]
}
