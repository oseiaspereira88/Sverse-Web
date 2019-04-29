<div class="container">
    <g:if test="${containers.size() != null && containers.size()>0}">
        <section class="friends-container">
            <g:each status="i" var="container" in="${containers}">
                <g:if test="${usuario.username != user?.username}">
                    <article class="profile profile--padding">
                        <div class="profile__img"><img src="/assets/groupIcon.jpg"/><span class="profile__img__online"></span>
                        </div>
                        <div class="profile__info profile__info--bordered">
                            <h3 class="profile__info__name"><a>${container.nome}</a></h3>
                            <p class="profile__info__contact">${container.tipo}</p>
                        </div>
                        <div class="profile__options"><a href="/perfil/${container.id}">Ver Perfil</a></div>
                    </article>
                    <g:if test="${i+1 < containers.size()}">
                        <div class="item--divider"></div>
                    </g:if>
                </g:if>
            </g:each>
        </section>
    </g:if>
    <g:else>
        <h6 style="text-align: center">Aparentemente não há nenhum grupo com esse nome.</h6>
    </g:else>
</div>