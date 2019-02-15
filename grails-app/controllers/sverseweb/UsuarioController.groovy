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

    def muralAcademico(){
        def user = springSecurityService.currentUser
        user.posts = (MyPost.all)
        def posts = user.posts
        render(view:"/usuario/muralAcademico", model: [usuario: user, posts: posts])
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
