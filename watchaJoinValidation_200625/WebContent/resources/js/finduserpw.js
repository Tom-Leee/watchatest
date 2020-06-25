//스크립트 링크가 body 위에 있다면 window의 load 이벤트 안에 작성
window.addEventListener("load", function(event){
	
	var userid = document.getElementById("userid");
	var useridmsg = document.getElementById("useridmsg");
	
	var backtologin = document.getElementById("backtologin");
	
	var flag = true;
	
	//backtologin을 클릭하면 메인화면으로 이동
	backtologin.addEventListener("click", function(evnet){
		location.href ="login";
	});
	
	//userid 중복검사 통과 여부를 저장할 변수
	var useridcheck = false;
	
	userid.addEventListener("focusout", function(event){
		if(userid.value.trim().length == 0){
			useridmsg.innerHTML = "";
			//useridmsg.style.color = "green";
			//검사하지 않도록 리턴
			return;
		}
		var useridreg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		//정규식의 test 메소드에 문자열을 대입하면
		//정규식이 존재하면 true, 그렇지 않으면 false 리턴
		if(!useridreg.test(userid.value.trim())){
			useridmsg.innerHTML = "형식에 맞지 않음<br />";
			useridmsg.style.color = "red";
			//userid.focus();
			useridcheck = false
			//event.preventDefault();
			return;
		}else{
			useridmsg.innerHTML = "";
			
		}
		//ajax 요청 객체를 생성
		var request = new XMLHttpRequest();
		//요청 생성
		request.open('get', 'useridcheck' + '?' + "userid=" + userid.value, true);
		//요청을 전송
		request.send('');
		//결과를 받기 위한 부분 생성
		request.addEventListener('load', function(event){
			//useridmsg.innerHTML = "이미 가입된 이메일입니다. <br />";
			//useridmsg.style.color = "red";
			//결과를 파싱
			var data = JSON.parse(event.target.responseText);
			if(data.result == true){
				useridmsg.innerHTML = "없는 이메일입니다.";
				useridmsg.style.color = "red";
				//userid 중복 검사를 통과했다고 표시
				useridcheck = true;
				return;
			}else{
				useridmsg.innerHTML = "";
				//useridmsg.style.color = "red";
				//userid 중복 검사를 통과못했다고 표시
				useridcheck = false;
			}
		})
	});
});