<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>
</head>
<body>
	<h3>학생정보</h3>
	<hr>
	<a href="">새로고침</a>
	<table border="1">
		<tr>
			<th>id</th>
			<th>이름</th>
			<th>대학</th>
			<th>생일</th>
			<th>이메일</th>
		</tr>
		<c:forEach items="${students}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.username}</td>
				<td>${s.univ}</td>
				<td>${s.birth}</td>
				<td>${s.email}</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<h3>학생추가</h3>
	<hr>
	<form method="post" action="/jwbook/scontrol?action=insert">
		<label>이름</label>
		<input type='text' name="username">
		<label>대학</label>
		<input type='text' name="univ">
		<label>생일</label >
		<input type='text' name="birth">
		<label>이메일</label>
		<input type='text' name="email">
		<button type="submit">등록</button>
	</form>
</body>
</html>