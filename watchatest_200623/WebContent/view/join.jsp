<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<link rel='stylesheet' href="css/join.css">
</head>
<fieldset>
<body align="center">
	<h1>WATCHA</h1>
		<h2>회원가입</h2>
	<form action="process.jsp" method="post" id="joinform">
	<!-- 보안을 위해 post, function을 위해 id를 생성 -->
		<input type="text" id="usernickname" name="usernickname" placeholder="이름" 
			minlength="2" required /><br />
			<block id="usernicknamemsg"></block>
		<!-- required는 필수 조건을 생성 -->
		<!-- email 유효성 검사 메시지에 사용할 영역 -->
		<input type="email" id="userid" name="userid" placeholder="이메일" 
			required /><br />
			<block id="useridmsg"></block>
		<!-- maxlength는 15자 이하 조건을 생성 -->
		<input type="password" id="userpassword" name="userpassword"
			placeholder="비밀번호"	maxlength="15" /><br />
			<block align="right" id="userpasswordmsg"></block>
		<input type="submit" id="join" value="회원가입" /><br />
			<block id="joinsubmitmsg"></block>
	</form>
	<div>
		이미 가입하셨나요?<button id="loginbutton"
		onclick="location.href='login.jsp'"> 로그인</button>
	</div>
	or <hr class='css-000'></hr>
	<div>
		<button id="loginfacebook">Facebook 으로 로그인</button>
	</div>
</body>
</fieldset>
<script src="js/join.js"></script>
</html>