<!doctype html>
<html>
<head>
    <meta name="layout" content="layout-secundario"/>
    <title>Sverse Web</title>

    <link href=${resource(dir: 'css', file: 'cycle-cronometer.css')} rel="stylesheet">
    <asset:javascript src="script-cycle-cronometer.js"/>
    <link href=${resource(dir: 'css', file: 'sidebar.css')} rel="stylesheet">
    <link href=${resource(dir: 'css', file: 'pagina-modelo.css')} rel="stylesheet">

</head>

<body>
<div class="columns">
    <div class="col-3" style="border-style: solid; border: 1px">
        <g:render template="/_templates/sidebar"/>
    </div>

    <div class="col-9">
        <div class="modeloheader"
             style="background-position: center center; background: white; margin-top: 40px; margin-left: 80px; margin-right: 220px;">
            <h6 style="padding-left: 8px; text-align: left; font-size: 10pt; color: darkslategray;">Dica do Momento</h6>
        </div>
        <div class="col-md-9 text-center center-block"
             style="border: white 2px; border-style: solid; height: 120px; margin-left: 80px; margin-right: 220px;
             border-bottom-right-radius: 12px; border-bottom-left-radius: 12px;
             padding-top: 12px; background: url(https://zllsnw.sn.files.1drv.com/y4ptRa5luc10AdCkSERcfgGybOjPS7mDAzajScJpPySj0JvLiiasqozJK-SS6mQARi_p8mAOYqeTBqhOj6N2JLf3ONdYMy8IfmesCocQuedFxRt2Ec_-wH6EmlP23if1lGA4oGvm5TQZNqTMYnOYHjXCbJvctbNfsivz7-PabmH9gIdON8H6B8iq-wOkiDyshO01xf242vh4_XpiRTvCYObUQ/bg5.jpg);
             background-size: 100%; background-position: center center;">
            <h6 style="text-shadow: lightgray 1px 1px 3px; padding-left: 490px; padding-right: 40px; font-size: 18pt; color: lavender">Use a ferramenta de estudo em ciclo.</h6>
        </div>
        <div class="mdiv" style="background-color: rgba(0, 0, 0, 0); margin-top: 20px; padding-right: 60px">
            <div class="conteudo">
                <div class="col-md-9 text-center center-block"
                     style="border: white 2px; border-style: solid; margin-top: 20px;
                     border-top-right-radius: 12px; border-top-left-radius: 12px; border-bottom-right-radius: 12px; border-bottom-left-radius: 12px;
                     margin-right: 200px; margin-left: 200px; background: url(https://irp-cdn.multiscreensite.com/376e8bb8/dms3rep/multi/desktop/aron-visuals-322314-unsplash.jpg); background-size: 100%; background-position: center center;">

                    <div class="modeloheader"
                         style="background-position: center center; background: white;">
                        <h6 style=" padding-left: 8px; text-align: left; font-size: 10pt; color: darkslategray;">Tarefa Atual</h6>
                    </div>

                    <asset:image style="border: white 2px; border-style: solid; height: 120px; width: 120px; margin-top: 20px"
                                 class="avatar avatar-xl" src="perfil_sverse.png"></asset:image>
                    <h6 style="font-size: 18pt; color: lavender">Organize seu Ciclo de Estudo</h6>

                    <h6 id="tempo" style="font-size: 48pt; color: lavender">00:00</h6>

                    <div class="marginTop col-md-12 text-center center-block" style="padding-bottom: 30px;">
                        <button id="btn" onclick="cronometro(1)" type="button"
                                class="col-md-2 col-md-offset-5 btn btn-success">Iniciar</button>
                        <button id="btnPause" onclick="parar()" type="button"
                                class="hide col-md-2 col-md-offset-5 btn btn-danger">Pause</button>
                        <button id="btnStop" onclick="stop()" type="button"
                                class="hide col-md-2 col-md-offset-5 btn btn-primary">Stop</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="scripts/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="scripts/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="scripts/datatables/jquery.dataTables.js" type="text/javascript"></script>

<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
<script src="scripts/profile-model.js"></script>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="scripts/grid-profile.js"></script>
</body>
</html>
