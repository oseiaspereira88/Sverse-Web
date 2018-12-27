<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="layout-secundario" />
        <g:set var="entityName" value="${message(code: 'trabalhoEmGrupo.label', default: 'TrabalhoEmGrupo')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>

        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <style>
        #sortable { list-style-type: none; margin: 0; padding: 0; width: 60%; }
        #sortable li { margin: 0 3px 3px 3px; padding: 0.4em; padding-left: 1.5em; font-size: 1.4em; height: 18px; }
        #sortable li span { position: absolute; margin-left: -1.3em; }
        </style>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $( function() {
                $( "#sortable1" ).sortable();
                $( "#sortable1" ).disableSelection();
                $( "#sortable2" ).sortable();
                $( "#sortable2" ).disableSelection();
                $( "#sortable3" ).sortable();
                $( "#sortable3" ).disableSelection();
            } );
        </script>

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
                <div class="col-9" style="border-style: solid; border: 1px">

                    <div class="mdiv">
                        <div class="modeloheader">
                            <h6>Aqui estão todos os seus trabalhos.</h6>
                        </div>

                        <div class="conteudo">
                            <button class="btn btn-action s-circle badd" onclick="window.location.href = '/trabalhoEmGrupo/create'">
                                <i class="icon icon-plus" style="margin-top: 2px"></i>
                            </button>
                            <g:render template="area" model="trabalhos:trabalhos"></g:render>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>