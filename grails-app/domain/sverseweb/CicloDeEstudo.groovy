package sverseweb

class CicloDeEstudo {
    String nome
    String estado
    String cor

    static belongsTo = [usuario: Usuario]
    static hasOne = [pomodoro : Pomodoro]
    static hasMany = [estudo:Estudo]

    static constraints = {
        nome(nullable: false, blank: false,        maxSize: 100, unique:false)
        estado(nullable: false, blank: false,        maxSize: 100, unique:false)
        cor(nullable: false, blank: false,        maxSize: 100, unique:false)
    }
}
