<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Krong Todo App</title>
<script src='workbook.js' defer></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class='container bg-warning shadow mx-auto mt-5 p-5 w-75'>
		<h1>My Todo App</h1>
		<hr />
		<form>
			<input id='input' type='text' class='w-75 p-1' placeholder='할 일을 입력하세요' required
				autofocus>
			<button type='submit' class='btn btn-primary'>할일 추가</button>
			<ul>
				<li></li>
			</ul>
		</form>
		<hr />
	</div>
</body>
</html>