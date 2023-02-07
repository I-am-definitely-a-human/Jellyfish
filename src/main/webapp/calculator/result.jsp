<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Result</title>
		<link rel="stylesheet" href="styles/css/calculator/results.css"/>
	</head>
	
	<body>
		<div id="outer-result-shell">
			<div id="result-box">
				<h2>Result:</h2>
				<div class="flex-newline"></div>
				<h2>${result.getResult()}</h2>
				<div class="flex-newline"></div>
				<p>
					<a href="calculator/calculator.jsp">Calculate some more</a>
					<br>
					<br>
					<a href="index.jsp">Home</a>
				</p>
			</div>
		</div>
	</body>
</html>