<div class="container">
    <g:if test="${trabalho.etapas.size() > 0}">
        <div class="columns">
            <div id="bloco1" class="column col-4" style="padding: 0;">
                <div class="modeloheader" style="background-color: #309570; margin-left: 16px; margin-right: 16px; margin-bottom: 0;">
                    <h6>Todas as etapas</h6>
                </div>

                <div class="label"
                     style="width: 263px; box-shadow: 0px 2px 7px; border-top-left-radius:0; border-top-right-radius:0; padding:0; margin-left: 16px; margin-right: 16px; margin-bottom: 0; background-color: darkgrey;">
                    <ul id="sortable1" style="margin-top: 0;">
                        <g:each in="${trabalho.etapas}" var="etapa" status="i">
                            <li class="ui-state-default label" style="text-align: center; width: 232px;">
                                <div class="btn-link" style="border-style: none; padding: 4px" onclick="window.location.href = '/etapa/edit/${etapa.id}'">
                                    ${etapa.titulo}
                                </div>
                            </li>
                        </g:each>
                    </ul>
                </div>
            </div>

            <div id="bloco2" class="column col-4" style="padding: 0;">
                <div class="modeloheader" style="background-color: #309570; margin-left: 16px; margin-right: 16px; margin-bottom: 0;">
                    <h6>Etapas em Andamento</h6>
                </div>

                <div class="label"
                     style="width: 263px; box-shadow: 0px 2px 7px; border-top-left-radius:0; border-top-right-radius:0; padding:0; margin-left: 16px; margin-right: 16px; margin-bottom: 0; background-color: darkgrey;">
                    <ul id="sortable2" style="margin-top: 0;">
                        <g:each in="${trabalho.etapas}" var="etapa" status="i">
                            <g:if test="${etapa.estado == 'Em andamento'}">
                                <li class="ui-state-default label" style="text-align: center; width: 232px;">
                                    <div class="btn-link" style="border-style: none; padding: 4px" onclick="window.location.href = '/etapa/edit/${etapa.id}'">
                                        ${etapa.titulo}
                                    </div>
                                </li>
                            </g:if>
                        </g:each>
                    </ul>
                </div>
            </div>

            <div id="bloco3" class="column col-4" style="padding: 0;">
                <div class="modeloheader" style="background-color: #309570; margin-left: 16px; margin-right: 16px; margin-bottom: 0;">
                    <h6>Etapas Concluidas</h6>
                </div>

                <div class="label"
                     style="width: 263px; box-shadow: 0px 2px 7px; border-top-left-radius:0; border-top-right-radius:0; padding:0; margin-left: 16px; margin-right: 16px; margin-bottom: 0; background-color: darkgrey;">
                    <ul id="sortable3" style="margin-top: 0;">
                        <g:each in="${trabalho.etapas}" var="etapa" status="i">
                            <g:if test="${etapa.estado == 'Concluida'}">
                                <li class="ui-state-default label" style="text-align: center; width: 232px;">
                                    <div class="btn-link" style="border-style: none; padding: 4px" onclick="window.location.href = '/etapa/edit/${etapa.id}'">
                                        ${etapa.titulo}
                                    </div>
                                </li>
                            </g:if>
                        </g:each>
                    </ul>
                </div>
            </div>
        </div>
    </g:if>
    <g:else>
        <h6 style="text-align: center">Organize as etapas do seu trabalho.</h6>
    </g:else>
</div>