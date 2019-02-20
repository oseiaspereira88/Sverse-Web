<div class="container">
    <g:if test="${trabalhos.size() > 0}">
        <div class="wrapper">
            <g:each status="i" var="trabalho" in="${trabalhos}">
                <div class="nota"
                     style="background:
                     url('https://encceja2018.net.br/wp-content/uploads/2018/04/capa-3.jpg');
                      background-size: contain"
                     onclick="window.location.href = '/trabalhoEmGrupo/area/${trabalho.id}'">
                    <h6 style="background-color: rgba(0, 0, 0, 0.4)">${trabalho.nome}</h6>
                </div>
            </g:each>
        </div>
    </g:if>
    <g:else>
        <h6 style="text-align: center">Você não tem nenhum trabalho.</h6>
    </g:else>
</div>