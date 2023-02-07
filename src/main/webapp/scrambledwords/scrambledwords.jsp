<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Scrambled Words</title>

		<link rel="stylesheet" href="styles/css/scrambledwords/scrambledwords.css"/>
	</head>
	
	<body>
		<div class="word-form-container">
			<form action="getActualWordServlet" method="post" id="word-form">
				<h2>Scrambled word:</h2>

				<div class="flex-newline"></div>
				
				<input type="text" name="originalWord" id="original-word" value=${scrambler.getWord()}>
				
				<h2>${scrambler.getScrambledWord()}</h2>

				<div class="flex-newline"></div>

				<p id="word-guesser">Guess the word:</p>

				<div class="flex-newline"></div>

				<input type="text" name="leGuess" id="guess-enter">

				<div class="flex-newline"></div>

				<input type="submit" name="submit" id="submit">
			</form>
		</div>
	</body>
</html>