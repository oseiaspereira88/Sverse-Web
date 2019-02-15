package sverseweb

import grails.converters.JSON
import seguranca.Permissao
import seguranca.Usuario
import seguranca.UsuarioPermissao

class UsuarioController {

    UsuarioService usuarioService
    def springSecurityService;

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def amigos(){
        String username = springSecurityService.principal.username
        Usuario usuario = Usuario.findByUsername(username)
        def lista = usuario.getAmigos()
        render(view: "/usuario/amigos", model: [usuarios:lista])
    }

    def index(){
        def lista = usuarioService.list();
        render(view: "/container/index", model: [containers:lista])
    }

    def calendarioAcademico(){
        String username = springSecurityService.principal.username
        Usuario usuario = Usuario.findByUsername(username)
        render(view: "/usuario/calendarioAcademico", model: [usuario:usuario])
    }

    def show(Long id) {
        respond usuarioService.get(id)
    }

    def edit(Long id) {
        respond usuarioService.get(id)
    }
}
