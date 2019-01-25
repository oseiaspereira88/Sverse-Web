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
        <div class="mdiv"style="background-color: rgba(0, 0, 0, 0.4);">
            <div class="modeloheader">
                <h6>Dicas do Momento!</h6>
            </div>

            <div class="modeloheader"
             style="background-position: center center; background: white; margin-top: 40px; margin-left: 80px; margin-right: 80px;">
            <h6 style="padding-left: 8px; text-align: left; font-size: 10pt; color: darkslategray;"></h6>
        </div>
        <div class="col-md-9 text-center center-block"
             style="border: white 2px; border-style: solid; height: 270px; margin-left: 80px; margin-right: 80px;
             border-bottom-right-radius: 12px; border-bottom-left-radius: 12px;
             padding-top: 12px; background: url(http://blog.portalpravaler.com.br/wp-content/uploads/2017/07/trabalho_e_estudo.png);
             background-size: 100%; background-position: center center;">
            <h6 style="text-shadow: lightgray 1px 1px 3px; padding-left: 490px; padding-right: 40px; font-size: 18pt; color: lavender">Seja Bem Vindo.</h6>
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
