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
<form action="/validate" method="get">
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
	<div class="bold-font-display">
		Please Enter URL :	<input type="text" name="userURL" class="url-text-area"><br>
	</div>
	<br>
	<div align="center">
		<input type="submit" value="Save" class="btn btn-primary"/>
	</div>
	<br>
	<br>
	<div class="bold-font-display">
		Top Three Domain Referrals:
	</div>
	<br>	
	<div class="table-responsive">
	<table class="table table-striped table-bordered text-left">
		<thead>
			<tr>
				<th>Domain</th>
				<th>Referral Count</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="domain" items="${domainReferral}">
				<tr>
					<td>${domain.domainName}</td>
					<td>${domain.referralCount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</form>
	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>