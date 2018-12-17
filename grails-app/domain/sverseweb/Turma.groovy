package sverseweb

class Turma extends Container{
    String codTurma

    static hasMany = [materias : Materia]
    
    static constraints = {
        codTurma(nullable: false, blank: false,        maxSize: 100, unique:false)
    }
}
