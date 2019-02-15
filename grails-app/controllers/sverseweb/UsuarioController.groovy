package sverseweb


import seguranca.Permissao
import seguranca.Usuario
import seguranca.UsuarioPermissao
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

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
        String username = springSecurityService.principal.username
        Usuario usuario = Usuario.findByUsername(username)
        render(view:"/usuario/muralAcademico", model:[nome:usuario.nome, posts:usuario.posts])
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
