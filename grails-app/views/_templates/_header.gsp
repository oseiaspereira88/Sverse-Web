<link rel="stylesheet" href="${resource(dir: 'css', file: 'header.css')}" type="text/css">

<div class="columns">

</div>

<div style="position: absolute; z-index:2; float:left; border:0; margin-left: 88%; margin-top: 0.4vh" class="popover popover-bottom">
    <!-- dropdown button group -->
    <div class="dropdown" style="margin: 0;">
        <div class="btn-group">
            <a href="#" class="btn dropdown-toggle chip" style="height: 48px; margin-top: 0; border-style: none;">
                <asset:image class="avatar avatar-lg" alt="Oséias Pereira" src="perfil_sverse.png"/>
                Oséias Pereira
            </a>
            <!-- menu component -->
            <ul class="menu">
                <li class="menu-item">
                    <div class="menu-badge">
                        <label class="label label-primary">1</label>
                    </div>
                    <a class="disabled" href="${createLink(uri: '/perfil')}">Perfil</a>
                </li>
                <li class="menu-item">
                    <div class="menu-badge">
                        <label class="label label-primary">2</label>
                    </div>
                    <a class="disabled" href="${createLink(uri: '/perfil')}">Notificações</a>
                </li>
                <li class="menu-item"><a href="${createLink(uri: '/Paginador/configs')}">Configurações</a></li>
                <li class="menu-item"><a href="#"
                                         onclick="window.location.href = '${request.contextPath}/logoff'">Sair</a></li>
            </ul>
        </div>
    </div>
</div>
