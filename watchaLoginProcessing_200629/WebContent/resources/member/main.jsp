<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
 uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body align="center">
	<!-- jsp 파일에서 서버에 요청하는 경우는 상대 경로를 이용하지 않는 것이 좋다.
		css나 js의 링크 그리고 이미자나 동영상 및 사운드의 링크도 동일한 방법으로 설정 -->
	<%-- <a href="${pageContext.request.contextPath}/user/join">회원가입</a><br/> --%>
		<h3>왓챠 메인 페이지</h3>
	<c:choose>
		<c:when test="${result == null}">
			<button id="login" name="login"><a href="${pageContext.request.contextPath}/user/login">로그인</a>
			</button>
			<button id="join" name="join"><a href="${pageContext.request.contextPath}/user/join">회원가입</a>
			</button><br/>
		</c:when>
		<c:when test="${result != null}">
			<button id="rating" name="rating">
				<a href="${pageContext.request.contextPath}/user/rating">평가</a></button>
			<button id="userprofile" name="userprofile">
				<a href="${pageContext.request.contextPath}/user/users">유저 페이지</a></button><br/>
		</c:when>
		<c:otherwise>
			오류
		</c:otherwise>
	</c:choose>
	<input type="search" id="search_bar_in_home" name="search"
		placeholder="작품 제목, 배우, 감독을 검색해보세요." size=50%/>
	<p>영화, TV, 도서를 검색하고 5억개의 평점과 리뷰를 만나보세요.</p>
	<p>지금 왓챠 앱을 다운로드하고, 내 취향에 딱 맞는 영화 드라마 도서 추천을 받아보세요.</p>
	<a href="https://play.google.com/store/apps/details?id=com.frograms.watcha"
		target="_blank"	rel="noopener noreferrer">구글플레이 아이콘
	<span src="data:image/svg+xml;base64,P…yNSIvPgogICAgPC9nPgo8L3N2Zz4K"
		class="css-yc4323-UIImg-AppDownloadImage ebeya3l16"></span></a>
	<a href="https://itunes.apple.com/app/id644185507" target="_blank" rel="noopener noreferrer">앱스토어 아이콘
	<span src="data:image/svg+xml;base64,P…8L2c+CiAgICA8L2c+Cjwvc3ZnPgo="
		class="css-mh3267-UIImg-AppDownloadImage ebeya3l16"></span></a>
</body>
<script src="js/index.js"></script>
</html>