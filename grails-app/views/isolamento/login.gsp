<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html>
<head>
	<title>Sverse Login</title>
   <!--Made with love by Mutiullah Samim -->

	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" href="${resource(dir: 'css', file: 'css_login.css')}" type="text/css">

</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3 style="margin-top: 10px;">Sverse Web</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div id="card-login" class="card-body">
				<form action='${request.contextPath}/login/authenticate' method='POST' id='frmLogar' name='frmLogar'>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" id="username" name="username" class="form-control" placeholder="Nome de Usuario">

					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" name="password" id="password" class="form-control" placeholder="Senha">
					</div>
					<div class="row align-items-center remember">
						<input id="lembrarChecked" name="remember-me" type="checkbox">Lembrar
					</div>
					<div class="form-group">
						<input type="submit" value="Logar" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			<div id="footer" class="card-footer">
				<div class="d-flex justify-content-center links">
					Ainda não tem uma conta?<a href="#" onclick="exibirFormulario()">Cadastre-se</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Esqueceu sua senha?</a>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Cadastrar</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div id="card-cadastro" class="card-body">
				<g:form name="FormCadastro" url="[controller:'isolamento', action:'save']">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" name="nome" id="Nome" class="form-control" placeholder="Digite seu nome">
					</div>
					<div class="input-group form-group">
						Masculino
						<input type="radio" value="Masculino" name="sexo" class="form-control">
						Feminino
						<input type="radio" value="Feminino" name="sexo" class="form-control">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" name="username" id="userNameCadastro" class="form-control" placeholder="Digite o seu nome de usuário">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" name="password" id="passwordCadastro" class="form-control" placeholder="Senha">
					</div>
					<div class="form-group">
						<input type="submit" value="Cadastrar" class="btn float-right login_btn"/>
					</div>
				</g:form>
			</div>
		</div>
	</div>
</div>

<script>
	function exibirFormulario(){
		var cardLogin = document.getElementById("card-login");
		var form = document.getElementById("frmLogar");
		form.style.display = "none";
		cardLogin.innerHTML = document.getElementById("card-cadastro").innerHTML;
		document.getElementById("footer").innerHTML = "<div style='text-align: center;'><a class='btn' style='color: whitesmoke; font-size: 11pt;'>Duvidas sobre os termos de uso?</a></div>"
	}
</script>
</body>
</html>