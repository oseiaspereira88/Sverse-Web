<!DOCTYPE html>
<html>
<head>
    <g:set var="entityName" value="${message(code: 'cicloDeEstudo.label', default: 'CicloDeEstudo')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>

    <link rel="stylesheet" href="//wa1.narvii.com/static/dist/css/desktop-style.css?v=266bb8a6f649">
    <link rel="stylesheet" href="//wa1.narvii.com/static/dist/css/misc-desktop-style.css?v=84527a92ab6d">
    <asset:link rel="icon" href="faviconSverse.ico" type="image/x-ico"/>
</head>

<body>

<asset:javascript src="jquery-ui-1.10.1.custom.min.js"/>
<link rel="stylesheet" href="${resource(dir: 'css', file: 'mForm.css')}" type="text/css">

<!-- Style das class de buttons -->
<style>
.addButton {
    padding: 0;
    text-align: center;
    align-items: center;
    position: fixed;
    right: 32px;
    bottom: 20px;
    width: 36px;
    height: 36px;
    border-radius: 50%;
    background-color: #39c94b;
    z-index: 3;
    transition: 500ms all;
}

.addButton:hover {
    background-color: #FFFFFF;
}

.addIcon {
    width: 100%;
    height: 100%;
    text-align: center;
    font-size: 24pt;
    color: #FFFFFF;
    transition: 500ms all;
}

.addIcon:hover {
    color: #39c94b;
}

</style>

<style>

.rotateInfinite {
    animation: rotation 3s infinite;
}
.rotate {
    animation: rotation 1s;
}

@keyframes rotation {
    from {
        transform: rotate(0deg)
    }
    to {
        transform: rotate(359deg)
    }
}
</style>

<script>
    function openFormCreate() {
        var bAdd = document.getElementById("bAdd")
        var spanAdd = document.getElementById("spanAdd")
        var divForm = document.getElementById("divForm")
        var divContainers = document.getElementById("divContainers")
        if (divForm.style.display == "none") {
            spanAdd.innerHTML = "<"
            divForm.style.display = "block";
        } else {
            spanAdd.innerHTML = "+"
            divForm.style.display = "none";
        }
    }
</script>

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
            <div style="text-align: center; margin-right: 0;">
                <g:render template="cycle"/>
            </div>
        </div>
    </div>
</div>
</body>
</html>