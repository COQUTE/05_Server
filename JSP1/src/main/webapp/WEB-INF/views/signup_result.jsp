<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 결과</title>
</head>
<body>
	<h1>회원 가입 결과 페이지입니다.</h1>

	<h3>입력되어 전달된 값들</h3>

	<ul>
		<li>ID : ${param.inputId}</li>
		<li>PW : ${param.inputPw}</li>
		<li>확인 : ${param.inputPwCheck}</li>
		<li>이름 : ${param.inputName}</li>
		<li>나이 : ${param.inputAge}</li>
	</ul>

	<%-- 비밀번호가 일치하는 경우 --%>
	<c:if test="${param.inputPw == param.inputPwCheck}">
		<h1 style="color: green;">가입 성공</h1>
	</c:if>
	
	<%-- 비밀번호가 불일치하는 경우 --%>
	<c:if test="${param.inputPw != param.inputPwCheck}">
		<h1 style="color: red;">비밀번호 불일치</h1>
	</c:if>	
	
</body>
</html>