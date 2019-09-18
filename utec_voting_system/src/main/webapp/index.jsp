<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<title>Login</title>
<link href="css/form.css" rel="stylesheet" type="text/css" />
<script src="js/jquery_v3.1.1.js" type="text/javascript"></script>
<script src="js/jquery.validate.min.js"></script>

<script src="js/sweetalert.min.js" type="text/javascript"></script>
<link href="css/sweetalert.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/Estilos.css">
<link rel="stylesheet" href="css/styleVotante.css">

<link rel="shortcut icon" href="img/icono.ico">
<link rel="shortcut icon" href="img/icono.ico">
</head>
<body onkeydown="return showKeyCode(event)">
	<header class="container-fluid">
		<div id="bar" class="row">
			<div id="contenedor" class="cold-xs-8"></div>
			<div id="contenedor" class="cold-xs-4">
				<form action="Login" method="POST" id="FRM_Login">
					<table style="float: right;">
						<tr>
							<td><input type="text" name="usuario" id="usuario"
								maxlength="30" size="25" autofocus autocomplete="off"
								class="form-control" placeholder="Usuario"></td>
							<td>&nbsp;</td>
							<td><input type="password" name="pass" id="pass" size="25"
								class="form-control" placeholder="Password"></td>
							<td><input type="submit" id="BTN_Login"
								value="Iniciar sesión" class="button button2"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</header>
	<nav></nav>
	<div class="container-fluid">
		<section class="row">
			<div class="col-md-8 col-lg-7">
				<div id="p1">
					<ul>
						<li><img src="img/img_1.jpg" alt="" /></li>
						<li><img src="img/img_2.jpg" alt="" /></li>
						<li><img src="img/img_3.jpg" alt="" /></li>
						<li><img src="img/img_4.jpg" alt="" /></li>
					</ul>
					<style type="text/css">
#p1 {
	width: 90%;
	margin: auto;
	margin-top: 60px;
	background-color: transparent;
	max-width: 1000px;
	overflow: hidden;
}

#cn {
	width: 400px;
	height: 110px;
}

#p1 ul {
	display: flex;
	padding: 0;
	width: 400%;
	animation: cambio 20s infinite;
	animation-direction: alternate;
	animation-timing-function: ease-in;
}

@
keyframes cambio { 0%{
	margin-left: 0%;
}

20%{
margin-left
:
0%;
}
25%{
margin-left
:
-100%;
}
45%{
margin-left
:
-100%;
}
50%{
margin-left
:
-200%;
}
70%{
margin-left
:
-200%;
}
75%{
margin-left
:
-300%;
}
100%{
margin-left
:
-300%;
}
}
#p1 li {
	width: 100%;
	list-style: none;
}

#p1 img {
	width: 100%;
}
</style>
				</div>
			</div>
			<div class="col-md-3 col-lg-4"
				style="background: #eee; border-radius: 1.5em; height: 345px; margin-top: 5%; padding: 42px; margin-right: 1%">
				<div class="col-md-6 col-lg-6">
					<figure>
						<a href="https://www.facebook.com/tse.gob.sv"><img
							src="img/fb.png" class="img-circle"
							style="height: 120px; width: 120px;"></a>
					</figure>
					<br>
					<figure>
						<a href="https://twitter.com/tse_elsalvador"><img
							src="img/tw.png" class="img-circle"
							style="height: 120px; width: 120px;"></a>
					</figure>
					<br>
				</div>
				<div class="col-md-6 col-lg-6">
					<figure>
						<a
							href="http://www.youtube.com/user/tsecomunicaciones?feature=grec_index#p/a"><img
							src="img/yt.png" class="img-circle"
							style="height: 120px; width: 120px;"></a>
					</figure>
					<br>
					<figure>
						<a href="http://tsesv.blogspot.com/"><img src="img/bg.png"
							class="img-circle" style="height: 120px; width: 120px;"></a>
					</figure>
				</div>
			</div>
			<div class="col-md-1 col-md-1"></div>
	</div>
	</section>
	</div>
	<aside></aside>
	<footer></footer>
	<script src="js/main.js"></script>
</body>
</html>