package seguranca

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic
import sverseweb.BoletimDeEstudo
import sverseweb.BoletimDeEtapas
import sverseweb.BoletimDeObjetivos
import sverseweb.CicloDeEstudo
import sverseweb.Container
import sverseweb.Envio
import sverseweb.Lixeira
import sverseweb.Nota
import sverseweb.Perfil
import sverseweb.TrabalhoEmGrupo

@GrailsCompileStatic
@EqualsAndHashCode(includes = 'username')
@ToString(includes = 'username', includeNames = true, includePackage = false)
class Usuario implements Serializable {

    private static final long serialVersionUID = 1

    String nome
    String username
    String password
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired
    String tipo
    Integer nNotificacoes
    Lixeira lixeira
    Perfil perfil

    Set<Permissao> getAuthorities() {
        (UsuarioPermissao.findAllByUsuario(this) as List<UsuarioPermissao>)*.permissao as Set<Permissao>
    }

    static hasMany = [boletinsDeEstudo  : BoletimDeEstudo,
                      boletinsDeEtapas  : BoletimDeEtapas,
                      boletinsDeObjetivo: BoletimDeObjetivos,
                      notas             : Nota,
                      containers        : Container,
                      containersAdmin   : Container,
                      ciclosDeEstudo    : CicloDeEstudo,
                      envios            : Envio,
                      recibos           : Envio,
                      trabalhosEmGrupo  : TrabalhoEmGrupo,
                      amigos            : Usuario]

    static constraints = {
        password nullable: false, blank: false, password: true
        username nullable: false, blank: false, unique: true
        nome(nullable: false, blank: false, size: 3..24, maxSize: 100, unique: false)
        tipo(nullable: false, blank: false, maxSize: 100, unique: false, inList: ["Aluno","Professor","Administrador"])
        nNotificacoes(nullable: false, blank: false, maxSize: 100, unique: false)
        perfil(nullable: true, unique: true)
        lixeira(nullable: true, unique: true)
    }

    static mapping = {
        password column: '`password`'
    }
}
