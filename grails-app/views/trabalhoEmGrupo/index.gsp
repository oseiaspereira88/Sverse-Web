<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="layout-secundario" />
        <g:set var="entityName" value="${message(code: 'trabalhoEmGrupo.label', default: 'TrabalhoEmGrupo')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>

        <link href=${resource(dir: 'css', file: 'sidebar.css')} rel="stylesheet">
        <link href=${resource(dir: 'css', file: 'pagina-modelo.css')} rel="stylesheet">
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

                            <a href="#list-trabalhoEmGrupo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
                            <div class="nav" role="navigation">
                                <ul>
                                    <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                                    <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                                </ul>
                            </div>
                            <div id="list-trabalhoEmGrupo" class="content scaffold-list" role="main">
                                <g:if test="${flash.message}">
                                    <div class="message" role="status">${flash.message}</div>
                                </g:if>
                                <f:table collection="${trabalhoEmGrupoList}" />

                                <div class="pagination">
                                    <g:paginate total="${trabalhoEmGrupoCount ?: 0}" />
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>