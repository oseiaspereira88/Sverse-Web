package sverseweb

import seguranca.Permissao
import seguranca.Usuario
import seguranca.UsuarioPermissao

class BootStrap {

    def init = { servletContext ->
        Permissao admin = Permissao.findByAuthority("ROLE_ADMIN")
        if (admin == null){
            admin = new Permissao(authority: "ROLE_ADMIN").save(flush:true)
        }

        Usuario jeff = Usuario.findByUsername("jeff")
        Usuario administrador = Usuario.findByUsername("administrador")
        if (administrador == null){
            jeff = new Usuario(
                    username: "jeff", password: "123", nome: "Jefferson Igor",
                    tipo: "Aluno", nNotificacoes: 0,
                    enabled: true, accountExpired: false, accountLocked: false,
                    passwordExpired: false)

            Perfil perfil1 = new Perfil(
                    imgPerfil: "qualquer",
                    email: "jeff88@gmail.com",
                    trello: "jeffsz88",
                    github: "Jeff88",
                    contato: "(84)99442299",
                    biografia: "My name is Garfanhoto and i am the flash man on live.",
                    nFollowing: "0",
                    nFollowers: "0",
                    usuario: jeff
            ).save(flush: true)

            jeff.setPerfil(perfil1)
            jeff.save(flush: true)

            administrador = new Usuario(
                    username: "admin", password: "123", nome: "Administrador",
                    tipo: "Administrador", nNotificacoes: 0,
                    enabled: true, accountExpired: false, accountLocked: false,
                    passwordExpired: false)

            Perfil perfil2 = new Perfil(
                    imgPerfil: "qualquer",
                    email: "oseiaspereira88@gmail.com",
                    trello: "oseiaspereira88",
                    github: "oseiaspereira88",
                    contato: "(84)99442299",
                    biografia: "My name is Barry Alan and i am the flash man on live.",
                    nFollowing: "0",
                    nFollowers: "0",
                    usuario: administrador
            ).save(flush: true)

            administrador.setPerfil(perfil2)
            administrador.addToAmigos(jeff)
            administrador.save(flush: true)

            jeff.addToAmigos(administrador)
            jeff.save(flush: true)

        }

        if (UsuarioPermissao.findByUsuarioAndPermissao(administrador,admin) == null)
        {
            new UsuarioPermissao(usuario: administrador, permissao: admin).save(flush:true)
        }

        if (UsuarioPermissao.findByUsuarioAndPermissao(jeff,admin) == null)
        {
            new UsuarioPermissao(usuario: jeff, permissao: admin).save(flush:true)
        }
    }
    def destroy = {

    }
}
