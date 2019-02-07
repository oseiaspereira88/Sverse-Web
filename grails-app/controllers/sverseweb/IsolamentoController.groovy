package sverseweb

import seguranca.Permissao
import seguranca.Usuario
import seguranca.UsuarioPermissao

class IsolamentoController {
    def springSecurityService;

    def login() {
        render(view: "/isolamento/login")
    }

    def logout() {
        render(view: "/isolamento/login")
    }

    def error() {
        render(view: "/isolamento/error")
    }

    def save() {
        Usuario user = new Usuario()
        user.nome = params.nome
        user.username = params.username
        user.password = params.password
        user.tipo = "Aluno";
        user.nNotificacoes = 0;
        user.enabled = true
        user.accountExpired = false
        user.accountLocked = false
        user.passwordExpired = false

        user.setPerfil(new Perfil(
                imgPerfil: "aleatoria",
                email: "aeuEmail@gmail.com",
                trello: "userName",
                github: "userName",
                contato: "(DDD)99999-9999",
                biografia: "Escreva sua biografia.",
                nFollowing: "0",
                nFollowers: "0",
                usuario: user
        ));

        user.validate()
        def mErrors = user.errors.getAllErrors()
        if (user.errors.getAllErrors().isEmpty()) {
            user.save(flash: true)
            Permissao admin = Permissao.findByAuthority("ROLE_ADMIN")
            UsuarioPermissao.create(user, admin, true)
            user.save(flash: true)
        } else {
            user = null;
        }

        render(view: "confirmacao-singup", model: [user: user, mErrors: mErrors])
    }

    def autenticarUsuario(String username){
        String password = spring
    }

    def listarUsuarios() {
        def users = Usuario.getAll();
        render(view: "lista-users", model: [users: users])
    }
}
