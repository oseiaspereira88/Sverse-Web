package sverseweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class EstudoController {

    EstudoService estudoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond estudoService.list(params), model:[estudoCount: estudoService.count()]
    }

    def show(Long id) {
        respond estudoService.get(id)
    }

    def create() {
        respond new Estudo(params)
    }

    def save(Estudo estudo) {
        if (estudo == null) {
            notFound()
            return
        }

        try {
            estudoService.save(estudo)
        } catch (ValidationException e) {
            respond estudo.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.created.message', args: [message(code: 'estudo.label', default: 'Estudo'), estudo.id])
                redirect estudo
            }
            '*' { respond estudo, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond estudoService.get(id)
    }

    def update(Estudo estudo) {
        if (estudo == null) {
            notFound()
            return
        }

        try {
            estudoService.save(estudo)
        } catch (ValidationException e) {
            respond estudo.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.updated.message', args: [message(code: 'estudo.label', default: 'Estudo'), estudo.id])
                redirect estudo
            }
            '*'{ respond estudo, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        estudoService.delete(id)

        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.deleted.message', args: [message(code: 'estudo.label', default: 'Estudo'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.not.found.message', args: [message(code: 'estudo.label', default: 'Estudo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
