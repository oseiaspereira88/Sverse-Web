package sverseweb

import grails.validation.ValidationException
import seguranca.Usuario

import static org.springframework.http.HttpStatus.*

class NotaController {

    NotaService notaService
    def springSecurityService;


    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(){
        Usuario user = springSecurityService.getCurrentUser();
        def lista = user.notas;
        render(view: "/nota/index", model: [notas:lista])
    }

    def newNota(){
        Usuario user = springSecurityService.getCurrentUser();
        Nota nota = new Nota()
        nota.texto = params.texto
        nota.setDataCriacao(new Date())
        nota.setDataAtualizacao(new Date())
        nota.setUsuario(user)
        notaService.save(nota)
        redirect(view: "index")
    }
}
