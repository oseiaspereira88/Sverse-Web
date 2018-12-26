<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="layout-secundario" />
        <g:set var="entityName" value="${message(code: 'nota.label', default: 'Nota')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>

        <link href=${resource(dir: 'css', file: 'sidebar.css')} rel="stylesheet">
        <link href=${resource(dir: 'css', file: 'pagina-modelo.css')} rel="stylesheet">
        <link href=${resource(dir: 'css', file: 'itens-in-grid.css')} rel="stylesheet">
    </head>
    <body>
    <div class="container">
        <div class="columns">
            <div class="col-3" style="border-style: solid; border: 1px">
                <g:render template="../templates/_sidebar"/>
            </div>

            <div class="col-9">
                <div class="mdiv">
                    <div class="modeloheader">
                        <h6>Bloco de Notas</h6>
                    </div>

                    <div class="conteudo">
                        <button class="btn btn-action s-circle badd" onclick="window.location.href = '/nota/create'">
                            <i class="icon icon-plus" style="margin-top: 2px"></i>
                        </button>
                        <g:render template="blocodenotas" model="notas:notas"></g:render>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>