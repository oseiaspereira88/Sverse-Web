<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="${resource(dir: 'css', file: 'itensInCycle.css')}" type="text/css">
<asset:javascript src="itensInCycle.js"/>

<section class="main-page content user-normal">
    <article class="post main-post user-profile-page" style="height: 90vh; position: relative;">

        <a onclick="abrirConfiguracoes()" href="#"
           style="position: absolute; top: 0px; right: 10px;">
            <g:img class="rotateInfinite" style="margin-top: 10px; height: 30px; width: 30px;"
                   src="settings-icon.png"></g:img>
        </a>

        <a onclick="abrirConfiguracoes()" href="#"
           style="position: absolute; top: 0px; left: 10px;">
            <g:img class="rotateInfinite" style="margin-top: 10px; height: 30px; width: 30px;"
                   src="settings-icon.png"></g:img>
        </a>

        <div class="menuCycle" style="position: absolute; top: 16px; left: 20%;  width: 60vw; border-style: solid;">
            <g:img class="" style="margin-top: 10px; height: 30px; width: 30px;"
                   src="settings-icon.png"></g:img>
        </div>

        <div class="cycleList" style="position: absolute; right: 48px; height: 100%; width: 80px; border-style: solid;">
            <g:img class="" style="margin-top: 10px; height: 30px; width: 30px;"
                   src="settings-icon.png"></g:img>
        </div>

        <button id="bAdd" class="addButton" onclick="openFormCreate()">
            <span id="spanAdd" class="addIcon">+</span>
        </button>

        <div id="divForm">
            <div id="area">
                <g:form class="mForm" action='newContainer' method='POST' name='frmCreateContainer'>
                    <fieldset>
                        <legend>Preencha o Formulário</legend>
                        <label>Nome:</label>
                        <input type="text" id="campo_nome" name="nome"><br>
                        <label>Tipo:</label>
                        <g:select name="tipo" id="campo_tipo" from="${["Pessoal", "Grupo", "Turma", "Sala"]}"
                                  noSelection="['': '-Escolha o tipo-']"></g:select><br>
                        <label>Dificuldade:</label>
                        <g:select name="dificuldade" id="campo_dificuldade"
                                  from="${["Muito Difícil", "Difícil", "Razoável", "Fácil"]}"
                                  noSelection="['': '-Escolha a dificulade-']"></g:select><br>
                        <label>Importância:</label>
                        <g:select name="importancia" id="campo_importancia"
                                  from="${["Muito importante", "Importante", "Razoável", "Não muito importante"]}"
                                  noSelection="['': '-Escolha a importância-']"></g:select><br>
                        <g:textArea id="campo_descricao" placeholder="Escreva a descrição do seu contêiner..."
                                    cols="30"
                                    rows="5" name="descricao" form="frmCreateContainer"></g:textArea><br>
                        <input type="submit" id="submit" value="Criar" style="color: white; "
                               class="btn float-right login_btn">
                    </fieldset>
                </g:form>
            </div>
        </div>


        <img class="bordaCycle" src="https://cdn.pixabay.com/photo/2012/04/01/18/41/button-23949_960_720.png">
        <img class="imgCycle" src="/assets/logo_sverse.png">
        <ul id="cycle">
            <li class="itemCycle" style="visibility: hidden;"></li>
            <li class="itemCycle"> <img alt="Item1" class="imgItem" src="/assets/logo_sverse.png"> </li>
            <li class="itemCycle"> <img alt="Item1" class="imgItem" src="/assets/logo_sverse.png"> </li>
            <li class="itemCycle"> <img alt="Item1" class="imgItem" src="/assets/logo_sverse.png"> </li>
        </ul>
    </article>
</section>