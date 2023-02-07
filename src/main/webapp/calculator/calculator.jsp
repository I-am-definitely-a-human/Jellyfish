<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculator</title>
		<link rel="stylesheet" href="../styles/css/calculator/calculator.css"/>
	</head>
	
	<body>
		<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>

		<div id="outer-container">
			<div id="calculator-container">
				<h1 id="calc-select-operation-header">Select your operation:</h1>

				<div class="flex-newline"></div>

				<select name="operationSelect" id="operation-select">
					<option value="addition">Addition</option>
					<option value="subtraction">Subtraction</option>
					<option value="multiplication">Multiplication</option>
					<option value="division">Division</option>
				</select>

				<div class="flex-newline"></div>

				<div class="op-container" id="addition">
					<form action="../calculatorServlet" class="op-form" method="post">
						<input type="text" name="opType" class="op-type" value="addition">
						<input type="text" name="addFirst" id="add-first">
						<p>+</p>
						<input type="text" name="addSecond" id="add-second">
						<div class="flex-newline"></div>
						<input type="submit" class="submit">
					</form>
				</div>
				<div class="flex-newline"></div>
				<div class="op-container" id="subtraction">
					<form action="../calculatorServlet" class="op-form" method="post">
						<input type="text" name="opType" class="op-type" value="subtraction">
						<input type="text" name="subtractFirst" id="subtract-first">
						<p>-</p>
						<input type="text" name="subtractSecond" id="subtract-second">
						<div class="flex-newline"></div>
						<input type="submit" class="submit">
					</form>
				</div>
				<div class="flex-newline"></div>
				<div class="op-container" id="multiplication">
					<form action="../calculatorServlet" class="op-form" method="post">
						<input type="text" name="opType" class="op-type" value="multiplication">
						<input type="text" name="multiplyFirst" id="multiply-first">
						<p>*</p>
						<input type="text" name="multiplySecond" id="multiply-second">
						<div class="flex-newline"></div>
						<input type="submit" class="submit">
					</form>
				</div>
				<div class="flex-newline"></div>
				<div class="op-container" id="division">
					<form action="../calculatorServlet" class="op-form" method="post">
						<input type="text" name="opType" class="op-type" value="division">
						<input type="text" name="divideFirst" id="divide-first">
						<p>/</p>
						<input type="text" name="divideSecond" id="divide-second">
						<div class="flex-newline"></div>
						<input type="submit" class="submit">
					</form>
				</div>
			</div>

		</div>

		<script src="scripts/menu.js"></script>
	</body>
</html>