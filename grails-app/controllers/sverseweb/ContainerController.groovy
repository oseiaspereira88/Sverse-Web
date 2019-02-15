package sverseweb

import grails.validation.ValidationException
import seguranca.Usuario
import static org.springframework.http.HttpStatus.*

class ContainerController {

    ContainerService containerService
    UsuarioService usuarioService
    def springSecurityService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(){
        def lista = containerService.list();
        render(view: "/container/index", model: [containers:lista])
    }

    def newContainer(){
        //criando containers e associando ao usuario
        Usuario user = springSecurityService.getCurrentUser()
        Container container = new Container()
        container.nome = params.nome
        container.descricao = params.descricao
        container.tipo = params.tipo
        container.imgContainer = "default"
        container.dificuldade = params.dificuldade
        container.importancia = params.importancia
        container.nNotificacoes = 0
        container.imgBackground = "default"
        container.dataCriacao = new Date()
        container.dataAtualizacao = new Date()

        //adicionando participantes, administradores e salvando
        container.addToParticipantes(user)
        container.addToAdmins(user)
        user.addToContainers(container)
        user.addToContainersAdmin(container)
        containerService.save(container)

        def publico = user.amigos
        publico.add(user)

        //criando publicaçao de container publico e salvando
        MyPost post = new MyPost(
                tipo: "Container Publico",
                usuario: user,
                publico: publico,
                dataDePublicacao: new Date())
        user.addToPosts(post)
        user.save(flash:true)

        redirect(action: "index")
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
                //flash.message = message(code: 'default.created.message', args: [message(code: 'container.label', default: 'Container'), container.id])
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
                //flash.message = message(code: 'default.updated.message', args: [message(code: 'container.label', default: 'Container'), container.id])
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
                //flash.message = message(code: 'default.deleted.message', args: [message(code: 'container.label', default: 'Container'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.not.found.message', args: [message(code: 'container.label', default: 'Container'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
