package sverseweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AtividadeController {

    AtividadeService atividadeService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond atividadeService.list(params), model:[atividadeCount: atividadeService.count()]
    }

    def show(Long id) {
        respond atividadeService.get(id)
    }

    def create() {
        respond new Atividade(params)
    }

    def save(Atividade atividade) {
        if (atividade == null) {
            notFound()
            return
        }

        try {
            atividadeService.save(atividade)
        } catch (ValidationException e) {
            respond atividade.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'atividade.label', default: 'Atividade'), atividade.id])
                redirect atividade
            }
            '*' { respond atividade, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond atividadeService.get(id)
    }

    def update(Atividade atividade) {
        if (atividade == null) {
            notFound()
            return
        }

        try {
            atividadeService.save(atividade)
        } catch (ValidationException e) {
            respond atividade.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'atividade.label', default: 'Atividade'), atividade.id])
                redirect atividade
            }
            '*'{ respond atividade, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        atividadeService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'atividade.label', default: 'Atividade'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'atividade.label', default: 'Atividade'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
