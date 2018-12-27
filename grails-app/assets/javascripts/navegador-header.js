
window.onload = function(){
    ativarMarcacao();
    $('.conteudo').animate({height: 'toggle'});
}

function ativarMarcacao() {
    switch (window.location.href) {
        case "http://localhost:8080/":
            $('.active').removeClass('active');
            $('#mural-academico').addClass('active');
            break;
        case "http://localhost:8080/container":
        case "http://localhost:8080/container/":
        case "http://localhost:8080/container/index":
            $('.active').removeClass('active');
            $('#containers-de-estudo').addClass('active');
            break;
        case "http://localhost:8080/nota":
        case "http://localhost:8080/nota/":
        case "http://localhost:8080/nota/index":
            $('.active').removeClass('active');
            $('#bloco-de-notas').addClass('active');
            break;
        case "http://localhost:8080/paginador/ajuda":
        case "http://localhost:8080/paginador/ajuda/":
        case "http://localhost:8080/paginador/ajuda/index":
            $('.active').removeClass('active');
            $('#ajuda').addClass('active');
            break;
        case "http://localhost:8080/paginador/perfil":
        case "http://localhost:8080/paginador/perfil/":
        case "http://localhost:8080/paginador/perfil/index":
            $('.active').removeClass('active');
            $('#perfil').addClass('active');
            break;
        case "http://localhost:8080/paginador/config":
        case "http://localhost:8080/paginador/config/":
        case "http://localhost:8080/paginador/config/index":
            $('.active').removeClass('active');
            $('#config').addClass('active');
            break;
        case "http://localhost:8080/cicloDeEstudo":
        case "http://localhost:8080/cicloDeEstudo/":
        case "http://localhost:8080/cicloDeEstudo/index":
            $('.active').removeClass('active');
            $('#cicloDeEstudo').addClass('active');
            break;
        case "http://localhost:8080/trabalhoEmGrupo":
        case "http://localhost:8080/trabalhoEmGrupo/":
        case "http://localhost:8080/trabalhoEmGrupo/index":
            $('.active').removeClass('active');
            $('#trabalhoEmGrupo').addClass('active');
            break;
        case "http://localhost:8080/perfil":
        case "http://localhost:8080/perfil/":
        case "http://localhost:8080/perfil/index":
            $('.active').removeClass('active');
            $('#perfil').addClass('active');
            break;
        case "http://localhost:8080/lixeira":
        case "http://localhost:8080/lixeira/":
        case "http://localhost:8080/lixeira/index":
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
            window.location.href = "/container";
            break;
        case "bloco-de-notas":
            window.location.href = "/nota";
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
            window.location.href = "/cicloDeEstudo";
            break;
        case "grupos-de-trabalho":
            window.location.href = "/trabalhoEmGrupo";
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
            window.location.href = "/lixeira";
            break;
    }
}