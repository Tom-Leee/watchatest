<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<link rel='stylesheet' href="${pageContext.request.contextPath}/resources/css/join.css">
</head>
<fieldset align="center">
<body>
	<body>
	<h1>WATCHA</h1>
		<h2>회원가입</h2>
		<!-- ajax로 요청하는 경우에는 method가 필요 없다.
		id만 설정 - 웹만 할 때는 method를 post로 설정
		입력하는 폼에 파일이 존재하는 경우는 enctype을 설정해야 한다.
		설정을 하지 않으면 파일 업로드가 안된다. -->
	<form id="joinform" enctype="multipart/form-data">
		<input type="text" id="usernickname" name="usernickname" placeholder="이름" 
			minlength="2" required /><br />
			<block id="usernicknamemsg"></block>
		<!-- required는 필수 조건을 생성 -->
		<!-- email 유효성 검사 메시지에 사용할 영역 -->
		<input type="email" id="userid" name="userid" placeholder="이메일" 
			required /><br />
			<div id="useridmsg"></div>
		<!-- maxlength는 15자 이하 조건을 생성 -->
		<input type="password" id="userpw" name="userpw"
			placeholder="비밀번호"	maxlength="" /><br />
			<div align="right" id="userpwmsg"></div>
		프로필 이미지<input type="file" id="userprofileimage" name="userprofileimage" /><br />
		<!-- 웹만 한다면 type은 submit-->
		<input type="button" id="joinbutton" value="회원가입" /><br />
			<block id="joinbuttonmsg"></block>
		<input type="button" id="mainbutton" value="메인으로" /><br />
	</form>
	<div>
		이미 가입하셨나요?<button id="loginbutton">로그인</button>
	</div>
	or <hr class='css-000'></hr>
	<div>
		<button id="loginwithfacebook">Facebook 으로 로그인</button>
	</div>
</body>
</fieldset>
<!-- js/join.js 파일의 링크를 설정 절대경로로 설정-->
<script src="${pageContext.request.contextPath}/resources/js/join.js"></script>
</html>