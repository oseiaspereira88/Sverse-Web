package sverseweb

class BoletimDeEstudo {
    Integer desempenho

    static belongsTo = [usuario : MyUsuario]
    static hasOne = [topico : TopicoDeEstudo]
}
