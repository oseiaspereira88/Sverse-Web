package sverseweb

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CycleItemController {

    CycleItemService cycleItemService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond cycleItemService.list(params), model:[cycleItemCount: cycleItemService.count()]
    }

    def show(Long id) {
        respond cycleItemService.get(id)
    }

    def create() {
        respond new CycleItem(params)
    }

    def save(CycleItem cycleItem) {
        if (cycleItem == null) {
            notFound()
            return
        }

        try {
            cycleItemService.save(cycleItem)
        } catch (ValidationException e) {
            respond cycleItem.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'cycleItem.label', default: 'CycleItem'), cycleItem.id])
                redirect cycleItem
            }
            '*' { respond cycleItem, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond cycleItemService.get(id)
    }

    def update(CycleItem cycleItem) {
        if (cycleItem == null) {
            notFound()
            return
        }

        try {
            cycleItemService.save(cycleItem)
        } catch (ValidationException e) {
            respond cycleItem.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'cycleItem.label', default: 'CycleItem'), cycleItem.id])
                redirect cycleItem
            }
            '*'{ respond cycleItem, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        cycleItemService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'cycleItem.label', default: 'CycleItem'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'cycleItem.label', default: 'CycleItem'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
