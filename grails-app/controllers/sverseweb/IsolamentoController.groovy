package sverseweb

import seguranca.Permissao
import seguranca.Usuario
import seguranca.UsuarioPermissao

class IsolamentoController {

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

        Perfil perfilDefault = Perfil.findByBiografia("Sua Biografia")
        if (perfilDefault == null){
            perfilDefault = new Perfil(
                    imgPerfil: "def2",
                    email: "def@gmail.com",
                    trello: "def",
                    github: "def",
                    contato: "def",
                    biografia: "Sua Biografia",
                    nFollowing: "0",
                    nFollowers: "0",
                    usuario: user
            ).save(flash:true)
        }
        user.setPerfil(perfilDefault)

        user.validate()
        def mErrors = user.errors.getAllErrors()
        if(user.errors.getAllErrors().isEmpty()){
            user.save(flash:true)
            Permissao admin = Permissao.findByAuthority("ROLE_ADMIN")
            UsuarioPermissao.create(user, admin, true)
        } else{
            user = null;
        }

        render(view:"confirmacao-singup", model:[user:user, mErrors:mErrors])
    }
}
