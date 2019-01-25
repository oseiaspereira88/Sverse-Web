<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="layout-secundario"/>
    <g:set var="entityName" value="${message(code: 'nota.label', default: 'Nota')}"/>
    <title><g:message code="default.edit.label" args="[entityName]"/></title>

    <link href=${resource(dir: 'css', file: 'sidebar.css')} rel="stylesheet">
    <link href=${resource(dir: 'css', file: 'pagina-modelo.css')} rel="stylesheet">
    <link href=${resource(dir: 'css', file: 'create-nota.css')} rel="stylesheet">
</head>

<body>
<div class="container">
    <div class="columns">
        <div class="col-3" style="border-style: solid; border: 1px">
            <g:render template="../templates/_sidebar"/>
        </div>

        <div class="col-9" style="border-style: solid; border: 1px">

            <div class="mdiv">
                <div class="modeloheader">
                    <h6>Edite sua nota!</h6>
                </div>

                <div class="conteudos">

                    <div id="edit-nota" class="content scaffold-edit" role="main">
                        <g:if test="${flash.message}">
                            <div class="message" role="status">${flash.message}</div>
                        </g:if>
                        <g:hasErrors bean="${this.nota}">
                            <ul class="errors" role="alert">
                                <g:eachError bean="${this.nota}" var="error">
                                    <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
                                            error="${error}"/></li>
                                </g:eachError>
                            </ul>
                        </g:hasErrors>
                        <g:form resource="${this.nota}" method="PUT">
                            <g:hiddenField name="version" value="${this.nota?.version}"/>
                            <fieldset class="form">
                                <f:all bean="nota"/>
                            </fieldset>
                            <fieldset class="buttons">
                                <input class="save" type="submit"
                                       value="${message(code: 'default.button.update.label', default: 'Update')}"/>
                                <input class="delete" type="submit" value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                                       onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/>
                            </fieldset>
                        </g:form>
                        <g:form resource="${this.nota}" method="DELETE">
                            <fieldset class="buttons">
                                <input class="delete" type="submit"
                                       value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                                       onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/>
                            </fieldset>
                        </g:form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
