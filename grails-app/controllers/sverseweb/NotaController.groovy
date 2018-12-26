package sverseweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class NotaController {

    NotaService notaService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(){
        def lista = notaService.list();
        render(view: "/nota/index", model: [notas:lista])
    }

    def show(Long id) {
        respond notaService.get(id)
    }

    def create() {
        respond new Nota(params)
    }

    def save(Nota nota) {
        if (nota == null) {
            notFound()
            return
        }

        try {
            notaService.save(nota)
        } catch (ValidationException e) {
            respond nota.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nota.label', default: 'Nota'), nota.id])
                redirect nota
            }
            '*' { respond nota, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond notaService.get(id)
    }

    def update(Nota nota) {
        if (nota == null) {
            notFound()
            return
        }

        try {
            notaService.save(nota)
        } catch (ValidationException e) {
            respond nota.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'nota.label', default: 'Nota'), nota.id])
                redirect nota
            }
            '*'{ respond nota, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        notaService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'nota.label', default: 'Nota'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nota.label', default: 'Nota'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
