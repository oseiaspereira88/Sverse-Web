<div class="usuario">
    <g:if test="${usuarios.size() != null && usuarios.size() > 0}">
        <g:each status="i" var="usuario" in="${usuarios}">
            <g:if test="${usuario.username != user?.username}">
                <article class="profile profile--padding">
                    <div class="profile__img"><img src="https://randomuser.me/api/portraits/lego/${usuario.perfil.imgPerfil}.jpg"/><span class="profile__img__online"></span>
                    </div>
                    <div class="profile__info profile__info--bordered">
                        <h3 class="profile__info__name"><a>${usuario.nome}</a></h3>
                        <p class="profile__info__contact">Técnico em Informática</p>
                    </div>
                    <div class="profile__options"><a href="/perfil/usuario/${usuario.id}">Ver Perfil</a></div>
                </article>
                <g:if test="${i+1 < usuarios.size()}">
                    <div class="item--divider"></div>
                </g:if>
            </g:if>
        </g:each>
    </g:if>
    <g:else>
        <h6 style="text-align: center">Aparentemente não há nenhum usuário com esse nome.</h6>
    </g:else>
</div>