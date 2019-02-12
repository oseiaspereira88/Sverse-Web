<div class="container">
    <g:if test="${notas.size() > 0}">
        <div class="wrapper">
            <g:each status="i" var="nota" in="${notas}">
                <div class="nota" style="padding-top: 10px;" onclick="window.location.href = '/nota/edit/${nota.id}'">
                    <h6>${nota.texto}</h6>
                </div>
            </g:each>
        </div>
    </g:if>
    <g:else>
        <h6 style="text-align: center; height: 60vh;">Crie sua primeira nota.</h6>
    </g:else>
</div>