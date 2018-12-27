<div class="container">
    <g:if test="${notas.size() > 0}">
        <div class="columns">
            <div id="bloco1" class="column col-4">
                <g:if test="${notas.size() > 0}">
                    <g:each status="i" var="nota" in="${notas}">
                        <g:if test="${(i % 3) == 0}">
                            <div class="nota" onclick="window.location.href = '/nota/edit/${nota.id}'">
                                <h6>${nota.texto}</h6>
                            </div>
                        </g:if>
                    </g:each>
                </g:if>
            </div>

            <div id="bloco2" class="column col-4">
                <g:if test="${notas.size() > 1}">
                    <g:each status="i" var="nota" in="${notas}">
                        <g:if test="${((i + 2) % 3) == 0}">
                            <div class="nota" onclick="window.location.href = '/nota/edit/${nota.id}'">
                                <h6>${nota.texto}</h6>
                            </div>
                        </g:if>
                    </g:each>
                </g:if>
            </div>

            <div id="bloco3" class="column col-4">
                <g:if test="${notas.size() > 2}">
                    <g:each status="i" var="nota" in="${notas}">
                        <g:if test="${((i + 1) % 3) == 0}">
                            <div class="nota" onclick="window.location.href = '/nota/edit/${nota.id}'">
                                <h6>${nota.texto}</h6>
                            </div>
                        </g:if>
                    </g:each>
                </g:if>
            </div>
        </div>
    </g:if>
    <g:else>
        <h6 style="text-align: center">Você não tem nenhuma nota.</h6>
    </g:else>
</div>