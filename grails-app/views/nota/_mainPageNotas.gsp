<asset:javascript src="jquery-ui-1.10.1.custom.min.js"/>

<!-- Style das class de buttons -->
<style>
.addButton {
    padding: 0;
    text-align: center;
    align-items: center;
    position: fixed;
    right: 16px;
    bottom: 16px;
    width: 36px;
    height: 36px;
    border-radius: 50%;
    background-color: #39c94b;
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

.backButton {
    display: none;
    padding: 0;
    text-align: center;
    align-items: center;
    position: fixed;
    left: 16px;
    top: 16px;
    width: 36px;
    height: 36px;
    border-radius: 50%;
    background-color: #FFFFFF;
    transition: 500ms all;

}

.backButton:hover {
    background-color: #39c94b;
}

.backIcon {
    transition: 500ms all;
    width: 100%;
    height: 100%;
    text-align: center;
    font-size: 22pt;
    color: #39c94b;
    transition: 500ms all;
}

.backIcon:hover {
    color: #fff;
}
</style>

<!-- Style proprio da pagina -->

<style>
textarea {
    background: url(/assets/textareaBG.jpg) center center no-repeat; /* This ruins default border */
    border: 2px solid #2a9a39;
    width: 340px;
    height: 200px;
    padding: 24px;
    outline: none;
    resize: none;
    color: #475d24;
    font-weight: bold;
    border-radius: 10px;
    text-align: center;
    overflow: auto;
}

 .rotate{
     animation: rotation 3s;
 }

@keyframes  rotation {
    from {transform: rotate(0deg)}
    to {transform: rotate(359deg)}
}

.wrapper {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    grid-row-gap: 10px;
    grid-column-gap: 10px;
    grid-auto-rows: 200px;
}
</style>

<script>
    window.onload = function (ev) {
        $('textarea')
            .focus(function () {
                $(this).css("background", "none")
            })
            .blur(function () {
                if ($(this)[0].value == '') {
                    $(this).css("background", "url(/assets/textareaBG.jpg) center center no-repeat")
                }
            });

        function elementSupportsAttribute(element, attribute) {
            var test = document.createElement(element);
            if (!elementSupportsAttribute('textarea', 'placeholder')) {
                // Fallback for browsers that don't support HTML5 placeholder attribute
                $("#example-three")
                    .data("originalText", $("#example-three").text())
                    .css("color", "#6c997e")
                    .focus(function () {
                        var $el = $(this);
                        if (this.value == $el.data("originalText")) {
                            this.value = "";
                        }
                    })
                    .blur(function () {
                        if (this.value == "") {
                            this.value = $(this).data("originalText");
                        }
                    });
            } else {
                // Browser does support HTML5 placeholder attribute, so use it.
                $("#example-three")
                    .attr("placeholder", $("#example-three").text())
                    .text("");
            }
        };
        $("textarea").resizable();
        $('textarea').autoResize();

    }

    function openFormCreate() {
        var bAdd = document.getElementById("bAdd")
        var spanAdd = document.getElementById("spanAdd")
        var divForm = document.getElementById("divForm")
        var blocoDeNotas = document.getElementById("divBlocoDeNotas")
        if(divForm.style.display == "none"){
            blocoDeNotas.style.display = "none";
            spanAdd.innerHTML = "<"
            bAdd.classList.remove("rotate")
            bAdd.classList.add("rotate");
            divForm.style.display = "block";
        }else {
            blocoDeNotas.style.display = "block";
            spanAdd.innerHTML = "+"
            bAdd.classList.remove("rotate")
            bAdd.classList.add("rotate");
            divForm.style.display = "none";
        }
    }
</script>

<section class="main-page content user-normal">
    <article class="post main-post user-profile-page">
        <div class="conteudo" style="min-height: 60vh;">

            <div id="divForm"
                 style="display:none; position: absolute; min-height: 90%; width: 100%; align-items: center; padding: 10%;">
                <g:textArea class="textarea" placeholder="No que você estava pensando..." cols="30" rows="5"
                            name="texto" form="frmCreateNota"></g:textArea>
                <g:form action='newNota' method='POST' id='frmCreateNota' name='frmCreateNota'>
                    <input type="submit" value="Criar" style="color: white; " class="btn float-right login_btn">
                </g:form>
            </div>

            <button id="bAdd" class="addButton rotate" onclick="openFormCreate()">
                <span id="spanAdd" class="addIcon">+</span>
            </button>

            <div id="divBlocoDeNotas">
                <g:render template="blocodenotas" model="notas:notas"></g:render>
            </div>
        </div>
    </article>
</section>