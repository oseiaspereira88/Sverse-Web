package sverseweb

import seguranca.Permissao
import seguranca.Usuario
import seguranca.UsuarioPermissao

class BootStrap {

    def init = { servletContext ->
        Permissao admin = Permissao.findByAuthority("ROLE_ADMIN")
        if (admin == null){
            admin = new Permissao(authority: "ROLE_ADMIN")
            admin.save(flush:true)
        }

        Usuario jeff = Usuario.findByUsername("jeff")
        Usuario administrador = Usuario.findByUsername("admin")

        if (administrador == null || jeff == null){
            jeff = new Usuario(
                    username: "jeff", password: "123", nome: "Jefferson Igor",
                    tipo: "Aluno", nNotificacoes: 0,
                    enabled: true, accountExpired: false, accountLocked: false,
                    passwordExpired: false)
            Perfil perfil1 = new Perfil(
                    imgPerfil: "qualquer1",
                    email: "jeff88@gmail.com",
                    trello: "jeffsz88",
                    github: "Jeff88",
                    contato: "(84)99443299",
                    biografia: "My name is Garfanhoto and i am the flash man on live.",
                    nFollowing: "0",
                    nFollowers: "0",
                    usuario: jeff
            )

            administrador = new Usuario(
                    username: "admin", password: "123", nome: "Administrador",
                    tipo: "Administrador", nNotificacoes: 0,
                    enabled: true, accountExpired: false, accountLocked: false,
                    passwordExpired: false)
            Perfil perfil2 = new Perfil(
                    imgPerfil: "qualquer2",
                    email: "oseiaspereira88@gmail.com",
                    trello: "oseiaspereira88",
                    github: "oseiaspereira88",
                    contato: "(84)99442299",
                    biografia: "My name is Barry Alan and i am the flash man on live.",
                    nFollowing: "0",
                    nFollowers: "0",
                    usuario: administrador
            )

            jeff.setPerfil(perfil1)
            administrador.setPerfil(perfil2)

            administrador.addToAmigos(jeff)
            jeff.addToAmigos(administrador)

            jeff.save(flash:true)
            administrador.save(flash:true)
        }

        if (UsuarioPermissao.findByUsuarioAndPermissao(administrador,admin) == null)
        {
            UsuarioPermissao.create(administrador, admin, true)
        }

        if (UsuarioPermissao.findByUsuarioAndPermissao(jeff,admin) == null)
        {
            UsuarioPermissao.create(jeff, admin, true)
        }
    }
    def destroy = {

    }
}
