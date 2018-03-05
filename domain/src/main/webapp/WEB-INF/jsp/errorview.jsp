<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    
    <title>Domain Controller | Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    
</head>
<body>
<form action="/domain" method="get">
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<div class="navbar-collapse collapse" align="center" style="margin-top: 10px; font-size:20px;">
				Domain Referral Calculator
			</div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div align="center">
		Please Enter Valid URL for processing the domain referral. To go back to previous screen please click the below button.
	</div>
	<br>
	<div align="center">
		<input type="submit" value="Back" class="btn btn-primary"/>
	</div>
	<br>	
</form>
	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>