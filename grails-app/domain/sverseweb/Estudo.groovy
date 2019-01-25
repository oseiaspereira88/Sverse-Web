package sverseweb

import java.time.DayOfWeek

class Estudo {
    String nome
    String tipo
    String imgItem
    Integer nEtapas
    DayOfWeek dia
    Integer hora
    Integer minuto
    String turno
    Integer idDinamico

    static belongsTo = [cicloDeEstudo:CicloDeEstudo]

    static constraints = {
        nome(nullable: false, blank: false,        maxSize: 100, unique:false)
        tipo(nullable: false, blank: false,        maxoSize: 100, unique:false)
        imgItem(nullable: false, blank: false,        maxSize: 100, unique:false)
        nEtapas(nullable: false, blank: false,        maxSize: 100, unique:false)
        dia(nullable: false, blank: false,        maxSize: 100, unique:false)
        hora(nullable: false, blank: false,        maxSize: 100, unique:false, size: 1..12)
        minuto(nullable: false, blank: false,        maxSize: 100, unique:false, size: 1..59)
        turno(nullable: false, blank: false,        maxSize: 100, unique:false, inList: [ "AM" , "PM"])
        idDinamico(nullable: false, blank: false,        maxSize: 100, unique:false)
    }
}
