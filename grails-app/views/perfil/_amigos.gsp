<div class="amigo">
    <g:if test="${usuario.amigos.size() != null && usuario.amigos.size()>0}">
        <div class="wrapper">
            <g:each status="i" var="amigo" in="${usuario.amigos}">
                <article class="profile profile--padding">
                    <div class="profile__img"><img src="https://randomuser.me/api/portraits/lego/${amigo.perfil.imgPerfil}.jpg"/><span class="profile__img__online"></span>
                    </div>
                    <div class="profile__info profile__info--bordered">
                        <h3 class="profile__info__name"><a>${amigo.nome}</a></h3>
                        <p class="profile__info__contact">Técnico em Informática</p>
                    </div>
                    <div class="profile__options"><a href="/perfil/usuario/${amigo.id}">Ver Perfil</a></div>
                </article>
            </g:each>
        </div>
    </g:if>
    <g:else>
        <h6 style="text-align: center">Aparentemente não há nenhum grupo ou usuário com esse nome.</h6>
    </g:else>
</div>