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
        <div class="mdiv">
            <div class="modeloheader">
                <h6>Mural Academico</h6>
            </div>

            <div class="conteudo">
                <div class="col-md-12 text-center">
                    <h1>Cronômetro com Javascript</h1>
                </div>
                <div class="col-md-12 text-center center-block">
                    <div id="tempo" type="button" class="btn btn-warning tamanho text">00:00!</div>

                </div>
                <div class="marginTop col-md-12 text-center center-block">
                    <button id="btn" onclick="cronometro(1)" type="button" class="col-md-2 col-md-offset-5 btn btn-success">Iniciar</button>
                </div>
                <div class="marginTop col-md-12 text-center center-block">
                    <button id="btnPause" onclick="parar()" type="button" class="hide col-md-2 col-md-offset-5 btn btn-danger">Pause</button>
                </div>
                <div class="marginTop col-md-12 text-center center-block">
                    <button id="btnStop" onclick="stop()" type="button" class="hide col-md-2 col-md-offset-5 btn btn-primary">Stop</button>
                </div>
                <div class="marginTop col-md-12 text-center center-block">
                    <div class="col-md-4 col-md-offset-4">
                        <div class="input-group">
                            <span class="input-group-addon">Min</span>
                            <input id="minutos" type="number" min="0" max="59" class="form-control" placeholder="Minutos">
                        </div>
                        <div class="input-group">
                            <span class="input-group-addon">Seg</span>
                            <input id="segundos" type="number"  min="0" max="59" class="form-control" placeholder="Segundos">
                            <input id="pause" type="hidden" value="0"  class="form-control">
                        </div>
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
