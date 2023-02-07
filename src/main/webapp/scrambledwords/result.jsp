<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Result</title>
		<link rel="stylesheet" href="styles/css/scrambledwords/results.css">
	</head>
	
	<body>
		<div id="outermost-result-shell">
			<div id="result-box">
				<h2>Your guess: <strong>${words.getScrambledWord()}</strong></h2>

				<div class="flex-newline"></div>

				<h2>The actual word: <strong>${words.getWord()}</strong></h2>

				<div class="flex-newline"></div>

				<p>
					<a href="goToScrambleServlet">Guess another word</a>
					<br>
					<br>
					<a href="index.jsp">Home</a>
				</p>
			</div>
		</div>
	</body>
</html>