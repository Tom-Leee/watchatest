<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href="${pageContext.request.contextPath}/resources/css/finduserpw.css">
</head>
<fieldset align="center">
<p align="left"><input type="button" id="backtologin" value="X" /><br /></p>
<body>
	<h1 align="left">비밀번호 재설정</h1>
	<hr class='css-000'></hr>
		<h2 align="left">비밀번호를 잊으셨나요?</h2>
			<h3 align="left">가입했던 이메일을 적어주세요.<br/>
			입력하신 이메일 주소로 비밀번호 변경 메일을 보낼게요</h3><br/>
			<form id="finduserpw">
				<input type="email" id="userid" name="userid" width="300px" 
					placeholder="이메일(example@gmail.com)" required /><br />
				<block id="useridmsg"></block>
				<!-- 웹만 한다면 type은 submit-->
				<input type="button" id="findpwbutton" value="비밀번호 변경 이메일 보내기" /><br />
					<block id="findpwbuttonmsg"></block>
			</form>
</body>
</fieldset>
<!-- js/join.js 파일의 링크를 설정 절대경로로 설정-->
<script src="${pageContext.request.contextPath}/resources/js/finduserpw.js"></script>
</html>