<!DOCTYPE html>
<html>
    <head>
        <g:set var="entityName" value="${message(code: 'trabalhoEmGrupo.label', default: 'TrabalhoEmGrupo')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>

        <link rel="stylesheet" href="${resource(dir: 'css', file: 'theme.css')}" type="text/css">

        <link href=${resource(dir: 'css', file: 'sidebar.css')} rel="stylesheet">
        <link href=${resource(dir: 'css', file: 'pagina-modelo.css')} rel="stylesheet">
        <link href=${resource(dir: 'css', file: 'itens-in-grid.css')} rel="stylesheet">
        <link rel="stylesheet" href="//wa1.narvii.com/static/dist/css/desktop-style.css?v=266bb8a6f649">
        <link rel="stylesheet" href="//wa1.narvii.com/static/dist/css/misc-desktop-style.css?v=84527a92ab6d">
        <asset:link rel="icon" href="faviconSverse.ico" type="image/x-ico"/>

    </head>
    <body>

    <div class="container">
        <div class="columns">
            <div class="column col-12">
                <header class="global-header">
                    <div class="content community-bg">
                        <div class="container">
                            <g:render template="../templates/_navGlobal"/>
                        </div>
                    </div>
                </header>
                <g:render template="../templates/_navHome"/>
                <div style="text-align: center;">
                    <section class="global-body">
                        <section class="community-content">
                            <g:render template="mainPagePerfil"/>
                        </section>
                        <div class="community-livelayer-padding">
                        </div>
                        <aside class="community-sidebar"
                               data-vce="sidebar-community"
                               data-close-by-overlay="1">
                            <div class="content community-sidebar-container">
                                <g:render template="../templates/_perfilAtributos"/>
                                <g:render template="../templates/_biografia"/>
                            </div>
                        </aside>
                    </section>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>