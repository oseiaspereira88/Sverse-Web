<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="layout-secundario" />
        <g:set var="entityName" value="${message(code: 'cicloDeEstudo.label', default: 'CicloDeEstudo')}" />
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

                    <div class="mdiv" style="background-color: rgba(0, 0, 0, 0.4);">
                        <div class="modeloheader">
                            <h6>Começe seus Estudos em Ciclo!</h6>
                        </div>

                        <div class="conteudo">

                            <a href="#list-cicloDeEstudo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
                            <div class="nav" role="navigation">
                                <ul>
                                    <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                                    <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                                </ul>
                            </div>
                            <div id="list-cicloDeEstudo" class="content scaffold-list" role="main">
                                <g:if test="${flash.message}">
                                    <div class="message" role="status">${flash.message}</div>
                                </g:if>
                                <f:table collection="${cicloDeEstudoList}" />

                                <div class="pagination">
                                    <g:paginate total="${cicloDeEstudoCount ?: 0}" />
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>