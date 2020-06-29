<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 외부 데이터 ajax</title>
</head>
<body>

</body>
<script>
//ajax 요청
//1. ajax 객체 생성
var request = new XMLHttpRequest();

//2. ajax 요청 생성
request.open('get', 'http://www.weather.go.kr/weather/forecast/mid-term-xml.jsp?stnld=109', true);

//3. ajax 파라미터 설정
//GET 방식이면 open의 URL 뒤에 붙이고
//POST 방식이면 FormData 객체를 생성하고 send
//폼 데이터 생성

//요청을 전송
request.send("");

//4. ajax 응답이 온 경우 처리할 콜백함수 등록
//요청을 전송하고 응답이 오면 호출될 콜백 메소드 생성
request.addEventListener('load', function(event){
	//결과만 확인
	alert(event.target.responseXML);
	});
</script>
</html>