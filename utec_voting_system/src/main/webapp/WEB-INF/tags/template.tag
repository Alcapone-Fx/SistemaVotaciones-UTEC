<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<html>
<head>
	<title>Sistema de votaciones</title>
</head>
<body>
	<div id="pageheader">
		<jsp:invoke fragment="header" />
	</div>
	<div id="body">
		<jsp:doBody />
	</div>
	<div id="pagefooter">
		<p id="copyright">Copyright 2019, Grupo 11-Ing. en Sistemas y computación.</p>
	</div>
</body>
</html>