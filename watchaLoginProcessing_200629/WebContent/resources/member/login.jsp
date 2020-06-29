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
		<!--  action: 처리할 서버의 url
		      method: 전송장식(get, post)
		      entype = file이 존재하는 경우만 mutipar/form-data
		 	   최근에는 조회를 제외하고는 action을 설정하지 않고 method는 post로 설정해서 get과 post로 구분 -->
	<form id="loginform" method="post">
	<!-- 보안을 위해 post, function을 위해 id를 생성 -->
		<!-- email 유효성 검사 메시지에 사용할 영역 -->
		<input type="email" id="userid" name="userid" placeholder="이메일" 
			required /><br />
			<div id="useridmsg"></div>
		<!-- maxlength는 15자 이하 조건을 생성 -->
		<input type="password" id="userpw" name="userpw"
			placeholder="비밀번호" maxlength="15"/><br />
			<div align="right" id="userpwmsg"></div>
		<!-- 웹만 한다면 type은 submit
			  하나의 서버로 여러 디바이스의 요청을 처리하는 REST API 서버를 이용하는 경우에는 submit 대신에
			 button을 만들어서 버튼을 누르면 ajax로 요청을 처리
			 bootstrap 같은 자바스크립트 라이브러리를 이용하게 되면
			 button을 만들면 자동으로 submit을 만드는 경우가 있다.
			  그런 경우에는 버튼을 form 외부에 생성-->
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