<link rel="stylesheet" href="${resource(dir: 'css', file: 'itens-in-grid.css')}" type="text/css">

<div class="container">
    <div class="wrapper">
        <g:if test="${containers.size() > 0}">
            <g:each status="i" var="container" in="${containers}">
                <div class="mcontainer" onclick="window.location.href = '/container/edit/${i+1}'">
                    <h6>${container.nome}</h6>
                </div>
            </g:each>
        </g:if>
        <g:else>
            <h6 style="text-align: center">Você não tem nenhum container.</h6>
        </g:else>
    </div>
</div>