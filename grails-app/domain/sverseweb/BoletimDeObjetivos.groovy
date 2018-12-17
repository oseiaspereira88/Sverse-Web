package sverseweb

class BoletimDeObjetivos {
    Integer desempenho

    static belongsTo = [usuario : Usuario]

    static hasOne = [meta : Meta]

}
