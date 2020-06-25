<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<link rel='stylesheet' href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<fieldset align="center">
<body>
	<h1>WATCHA</h1>
		<h2>로그인</h2>
	<form id="loginform">
	<!-- 보안을 위해 post, function을 위해 id를 생성 -->
		<!-- email 유효성 검사 메시지에 사용할 영역 -->
		<input type="email" id="userid" name="userid" placeholder="이메일" 
			required /><br />
			<block id="useridmsg"></block>
		<!-- maxlength는 15자 이하 조건을 생성 -->
		<input type="password" id="userpw" name="userpw"
			placeholder="비밀번호" maxlength="15"/><br />
			<block align="right" id="userpwmsg"></block>
		<!-- 웹만 한다면 type은 submit-->
		<input type="button" id="loginbutton" value="로그인" /><br />
			<block id="loginbuttonmsg"></block>
		<input type="button" id="mainbutton" value="메인으로" /><br />
	</form>
	<div>
		<button id="finduserpw">비밀번호를 잊어버리셨나요?</button>
	</div>
	<div>
		계정이 없으신가요?<button id="joinbutton">회원가입</button>
	</div>
	<hr class='css-000'></hr>
	<button id="loginwithfacebook">Facebook 으로 로그인</button>
</body>
</fieldset>
<!-- js/join.js 파일의 링크를 설정 절대경로로 설정-->
<script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
</html>