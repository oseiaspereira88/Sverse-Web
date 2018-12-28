package sverseweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PaginadorController {

    PaginadorService paginadorService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def muralAcademico() {

    }

    def perfil() {
    }

    def configs() {
        params.max = Math.min(max ?: 10, 100)
        respond paginadorService.list(params), model:[paginadorCount: paginadorService.count()]
    }

    def ajuda() {
        params.max = Math.min(max ?: 10, 100)
        respond paginadorService.list(params), model:[paginadorCount: paginadorService.count()]
    }
}
