<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<h2 class='container-fluid bg-info border-secondary text-center p-4'>회원
		가입</h2>
	<hr>
	<section class='d-flex justify-content-center'>
		<div class='bg-warning p-3 border rounded p-3' style='width: 400px;'>
			<h5>이름</h5>
			<form>
				<input class='p-1' type='text' required>
				<hr>
			</form>
			<h5>이메일</h5>
			<form>
				<input class='p-1' type='email' required>
				<button class='btn btn-dark' type='button' onclick="alert('정말로 가입 하시겠습니까?')">가입</button>
			</form>
		</div>
	</section>
</body>
</html>