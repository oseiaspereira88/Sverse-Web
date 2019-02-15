package sverseweb

import grails.validation.ValidationException
import seguranca.Usuario

import static org.springframework.http.HttpStatus.*

class TrabalhoEmGrupoController {

    TrabalhoEmGrupoService trabalhoEmGrupoService
    UsuarioService usuarioService
    def springSecurityService;

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        Usuario user = springSecurityService.getCurrentUser()
        def lista = trabalhoEmGrupoService.list();
        def aux = lista;
        //aux.removeAll(lista)
        for(int i = 0; i < lista.size(); i++) {
            boolean isParticipante = false;
            for(int x = 0; x < lista.get(i).getParticipantes().size(); i++){
                if(lista.get(i).getParticipantes()[x].username == user.username){
                    isParticipante=true;
                }
            }
            if(isParticipante){
                aux.add(lista.get(i))
            }
        }

        render(view: "/trabalhoEmGrupo/index", model: [trabalhos:aux])
    }

    def newTrabalho(){
        Usuario user = springSecurityService.getCurrentUser()
        TrabalhoEmGrupo trabalho = new TrabalhoEmGrupo()
        trabalho.nome = params.nome
        trabalho.andamento = 0
        trabalho.descricao = params.descricao
        trabalho.dataCriacao = new Date()
        trabalho.dataTermino = new Date()
        String data = params.dataTermino;
        def dataPart = data.split("-")
        trabalho.dataTermino.setYear(Integer.parseInt(dataPart[0]))
        trabalho.dataTermino.setMonth(Integer.parseInt(dataPart[1]))
        trabalho.dataTermino.setDate(Integer.parseInt(dataPart[2]))

        trabalho.addToParticipantes(user)
        user.addToTrabalhosEmGrupo(trabalho)
        trabalhoEmGrupoService.save(trabalho)
        usuarioService.save(user)
        redirect(action: "index")
    }




    def area(int trabalhoId) {
        def lista = trabalhoEmGrupoService.list()
        if(lista){
            def trabalho = lista.get(trabalhoId)
            render(view: "/trabalhoEmGrupo/area", model: [trabalho:trabalho])
        }

    }

    def show(Long id) {
        respond trabalhoEmGrupoService.get(id)
    }

    def create() {
        respond new TrabalhoEmGrupo(params)
    }

    def save(TrabalhoEmGrupo trabalhoEmGrupo) {
        if (trabalhoEmGrupo == null) {
            notFound()
            return
        }

        try {
            trabalhoEmGrupoService.save(trabalhoEmGrupo)
        } catch (ValidationException e) {
            respond trabalhoEmGrupo.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.created.message', args: [message(code: 'trabalhoEmGrupo.label', default: 'TrabalhoEmGrupo'), trabalhoEmGrupo.id])
                redirect trabalhoEmGrupo
            }
            '*' { respond trabalhoEmGrupo, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond trabalhoEmGrupoService.get(id)
    }

    def update(TrabalhoEmGrupo trabalhoEmGrupo) {
        if (trabalhoEmGrupo == null) {
            notFound()
            return
        }

        try {
            trabalhoEmGrupoService.save(trabalhoEmGrupo)
        } catch (ValidationException e) {
            respond trabalhoEmGrupo.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.updated.message', args: [message(code: 'trabalhoEmGrupo.label', default: 'TrabalhoEmGrupo'), trabalhoEmGrupo.id])
                redirect trabalhoEmGrupo
            }
            '*'{ respond trabalhoEmGrupo, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        trabalhoEmGrupoService.delete(id)

        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.deleted.message', args: [message(code: 'trabalhoEmGrupo.label', default: 'TrabalhoEmGrupo'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                //flash.message = message(code: 'default.not.found.message', args: [message(code: 'trabalhoEmGrupo.label', default: 'TrabalhoEmGrupo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
