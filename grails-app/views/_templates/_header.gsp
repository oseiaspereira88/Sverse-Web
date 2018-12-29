<link rel="stylesheet" href="${resource(dir: 'css', file: 'header.css')}" type="text/css">

<div style="position: absolute; z-index:2; float:left; border:0; margin-left: 4%; margin-top: 2%" class="popover popover-bottom">
    <!-- dropdown button group -->
    <div class="dropdown" style="margin-top: 28px">
        <div class="btn-group">
            <a href="#" class="btn chip" style="height: 36px; margin-top: 0; border-style: none;">
                <asset:image class="avatar avatar-lg" alt="Oséias Pereira" src="perfil_sverse.png"/>
                Oséias Pereira
            </a>
            <a href="#" class="btn dropdown-toggle" tabindex="0">
                <i class="icon icon-caret"></i>
            </a>

            <!-- menu component -->
            <ul class="menu">
                <li class="menu-item">
                    <div class="menu-badge">
                        <label class="label label-primary">2</label>
                    </div><a class="active" href="${createLink(uri: '/perfil')}">Perfil</a>
                </li>
                <li class="menu-item"><a href="${createLink(uri: '/Paginador/configs')}">Configurações</a></li>
                <li class="menu-item"><a href="#"
                                         onclick="window.location.href = '${request.contextPath}/logoff'">Sair</a></li>
            </ul>
        </div>
    </div>
</div>

<ul class="header" style="z-index:1">
    <li class="appTitle"><a id="Titulo" href="${createLink(uri: '/')}" class="appTitle">Sverse Web</a></li>
    <li><a id="mural-academico" onclick="navegar('mural-academico')" href="#}">Mural Acadêmico</a></li>
    <li><a id="container-de-estudo" onclick="navegar('containers-de-estudo')" href="#">Containers de Estudo</a></li>
    <li><a id="bloco-de-notas" onclick="navegar('bloco-de-notas')" href="#">Bloco de Notas</a></li>
    <li style="float:right"><a id="ajuda" onclick="navegar('ajuda')" href="#}">Ajuda</a></li>
</ul>