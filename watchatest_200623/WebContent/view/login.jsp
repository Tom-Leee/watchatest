<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<link rel='stylesheet' href="css/login.css">
</head>
<fieldset>
<body align="center">
	<h1>WATCHA</h1>
		<h2>로그인</h2>
	<form action=process.jsp method="post" id="loginform">
	<!-- 보안을 위해 post, function을 위해 id를 생성 -->
		<!-- email 유효성 검사 메시지에 사용할 영역 -->
		<input type="email" id="userid" name="userid" placeholder="이메일" 
			required /><br />
			<block id="useridmsg"></block>
		<!-- maxlength는 15자 이하 조건을 생성 -->
		<input type="password" id="userpassword" name="userpassword"
			placeholder="비밀번호" maxlength="15"/><br />
			<block align="right" id="userpasswordmsg"></block>
		<input type="submit" id="login" value="로그인" /><br />
			<block id="loginmitmsg"></block>
	</form>
	<div>
		<button id="finduserpassword">비밀번호를 잊어버리셨나요?</button>
	</div>
	<div>
		계정이 없으신가요?<button id="join"
		onclick="location.href='join.jsp'"> 회원가입</button>
	</div>
	<hr class='css-000'></hr>
	<button id="loginwithfacebook">Facebook 으로 로그인</button>
</body>
</fieldset>
<script src="js/login.js"></script>
</html>