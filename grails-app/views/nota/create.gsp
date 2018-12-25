<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="layout-secundario" />
        <g:set var="entityName" value="${message(code: 'nota.label', default: 'Nota')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>

        <link href=${resource(dir: 'css', file: 'sidebar.css')} rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="columns">
                <div class="col-6" style="border-style: solid; border: 1px">
                    <g:render template="../templates/_sidebar"/>
                </div>
                <div class="col-6" style="border-style: solid; border: 1px">
                    <a href="#create-nota" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
                    <div id="create-nota" class="content scaffold-create" role="main">
                        <h1><g:message code="default.create.label" args="[entityName]" /></h1>
                        <g:if test="${flash.message}">
                            <div class="message" role="status">${flash.message}</div>
                        </g:if>
                        <g:hasErrors bean="${this.nota}">
                            <ul class="errors" role="alert">
                                <g:eachError bean="${this.nota}" var="error">
                                    <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                                </g:eachError>
                            </ul>
                        </g:hasErrors>
                        <g:form resource="${this.nota}" method="POST">
                            <fieldset class="form">
                                <f:all bean="nota"/>
                            </fieldset>
                            <fieldset class="buttons">
                                <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                            </fieldset>
                        </g:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
