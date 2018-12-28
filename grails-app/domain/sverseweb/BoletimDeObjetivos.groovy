package sverseweb

class BoletimDeObjetivos {
    Integer desempenho

    static belongsTo = [usuario : MyUsuario]

    static hasOne = [meta : Meta]

}
