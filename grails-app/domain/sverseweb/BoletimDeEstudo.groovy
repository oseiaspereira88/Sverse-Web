package sverseweb

class BoletimDeEstudo {
    Integer desempenho

    static belongsTo = [usuario : Usuario]
    static hasOne = [topico : TopicoDeEstudo]
}
