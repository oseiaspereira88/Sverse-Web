package sverseweb

import grails.validation.ValidationException
import seguranca.Usuario

import static org.springframework.http.HttpStatus.*

class PaginadorController {

    PaginadorService paginadorService
    def springSecurityService;

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def muralAcademico() {
        Usuario usuario = springSecurityService.getCurrentUser();
        render(view:"muralAcademico", model:[usuario:usuario])
    }

    def perfil() {
    }

    def configs() {

    }

    def ajuda() {

    }

    def baixarApp() {

    }
}
