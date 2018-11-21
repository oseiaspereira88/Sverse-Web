package sverseweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class EstudoPessoalController {

    EstudoPessoalService estudoPessoalService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond estudoPessoalService.list(params), model:[estudoPessoalCount: estudoPessoalService.count()]
    }

    def show(Long id) {
        respond estudoPessoalService.get(id)
    }

    def create() {
        respond new EstudoPessoal(params)
    }

    def save(EstudoPessoal estudoPessoal) {
        if (estudoPessoal == null) {
            notFound()
            return
        }

        try {
            estudoPessoalService.save(estudoPessoal)
        } catch (ValidationException e) {
            respond estudoPessoal.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'estudoPessoal.label', default: 'EstudoPessoal'), estudoPessoal.id])
                redirect estudoPessoal
            }
            '*' { respond estudoPessoal, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond estudoPessoalService.get(id)
    }

    def update(EstudoPessoal estudoPessoal) {
        if (estudoPessoal == null) {
            notFound()
            return
        }

        try {
            estudoPessoalService.save(estudoPessoal)
        } catch (ValidationException e) {
            respond estudoPessoal.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'estudoPessoal.label', default: 'EstudoPessoal'), estudoPessoal.id])
                redirect estudoPessoal
            }
            '*'{ respond estudoPessoal, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        estudoPessoalService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'estudoPessoal.label', default: 'EstudoPessoal'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'estudoPessoal.label', default: 'EstudoPessoal'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
