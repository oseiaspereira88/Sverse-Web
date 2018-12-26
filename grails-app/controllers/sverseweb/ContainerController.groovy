package sverseweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ContainerController {

    ContainerService containerService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(){
        def lista = containerService.list();
        render(view: "/container/index", model: [containers:lista])
    }

    def show(Long id) {
        respond containerService.get(id)
    }

    def create() {
        respond new Container(params)
    }

    def save(Container container) {
        if (container == null) {
            notFound()
            return
        }

        try {
            containerService.save(container)
        } catch (ValidationException e) {
            respond container.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'container.label', default: 'Container'), container.id])
                redirect container
            }
            '*' { respond container, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond containerService.get(id)
    }

    def update(Container container) {
        if (container == null) {
            notFound()
            return
        }

        try {
            containerService.save(container)
        } catch (ValidationException e) {
            respond container.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'container.label', default: 'Container'), container.id])
                redirect container
            }
            '*'{ respond container, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        containerService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'container.label', default: 'Container'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'container.label', default: 'Container'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
