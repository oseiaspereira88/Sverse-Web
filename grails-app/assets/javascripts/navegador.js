window.onload = function () {
    ativarMarcacao();
    $('.conteudo').animate({height: 'toggle'});
}

function ativarMarcacao() {
    switch (window.location.href) {
        case "/**/":
            $('.active').removeClass('active');
            $('#mural-academico').addClass('active');
            break;
        case "/**/container":
        case "/**/container/":
        case "/**/container/index":
            $('.active').removeClass('active');
            $('#containers-de-estudo').addClass('active');
            break;
        case "/**/nota":
        case "/**/nota/":
        case "/**/nota/index":
            $('.active').removeClass('active');
            $('#bloco-de-notas').addClass('active');
            break;
        case "/**/paginador/ajuda":
        case "/**/paginador/ajuda/":
        case "/**/paginador/ajuda/index":
            $('.active').removeClass('active');
            $('#ajuda').addClass('active');
            break;
        case "/**/paginador/perfil":
        case "/**/paginador/perfil/":
        case "/**/paginador/perfil/index":
            $('.active').removeClass('active');
            $('#perfil').addClass('active');
            break;
        case "/**/paginador/config":
        case "/**/paginador/config/":
        case "/**/paginador/config/index":
            $('.active').removeClass('active');
            $('#config').addClass('active');
            break;
        case "/**/cicloDeEstudo":
        case "/**/cicloDeEstudo/":
        case "/**/cicloDeEstudo/index":
            $('.active').removeClass('active');
            $('#cicloDeEstudo').addClass('active');
            break;
        case "/**/trabalhoEmGrupo":
        case "/**/trabalhoEmGrupo/":
        case "/**/trabalhoEmGrupo/index":
            $('.active').removeClass('active');
            $('#trabalhoEmGrupo').addClass('active');
            break;
        case "/**/perfil":
        case "/**/perfil/":
        case "/**/perfil/index":
            $('.active').removeClass('active');
            $('#perfil').addClass('active');
            break;
        case "/**/lixeira":
        case "/**/lixeira/":
        case "/**/lixeira/index":
            $('.active').removeClass('active');
            $('#lixeira').addClass('active');
            break;
    }
}

function navegar(pag) {
    switch (pag) {
        case "mural-academico":
            window.location.href = "/";
            break;
        case "containers-de-estudo":
            window.location.href = "/container/index";
            break;
        case "bloco-de-notas":
            window.location.href = "/nota/index";
            break;
        case "ajuda":
            window.location.href = "/paginador/ajuda";
            break;
        case "perfil":
            window.location.href = "/perfil";
            break;
        case "configuracoes":
            window.location.href = "/paginador/config";
            break;
        case "ciclos-de-estudo":
            window.location.href = "/cicloDeEstudo/index";
            break;
        case "grupos-de-trabalho":
            window.location.href = "/trabalhoEmGrupo/index";
            break;
        case "linha-do-tempo":
            window.location.href = "/perfil/timeline";
            break;
        case "amigos":
            window.location.href = "/usuario/listarAmigos";
            break;
        case "calendario":
            window.location.href = "/";
            break;
        case "participacoes":
            window.location.href = "/";
            break;
        case "compartilhamentos":
            window.location.href = "/envio/compartilhamento";
            break;
        case "lixeira":
            window.location.href = "/lixeira/index";
            break;
    }
}