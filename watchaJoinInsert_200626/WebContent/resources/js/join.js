//스크립트 링크가 body 위에 있다면 window의 load 이벤트 안에 작성
window.addEventListener("load", function(event){
	//id를 가지고 필요한 객체들을 찾아오기
	var usernickname = document.getElementById("usernickname");
	var usernicknamemsg = document.getElementById("usernicknamemsg");
	
	var userid = document.getElementById("userid");
	var useridmsg = document.getElementById("useridmsg");
	
	var userpw = document.getElementById("userpw");
	var userpw1 = document.getElementById("userpw1");
	var userpwmsg = document.getElementById("userpwmsg");
	
	var joinform = document.getElementById("joinform");
	
	var image = document.getElementById("image");
	var mainbutton = document.getElementById("mainbutton");
	var joinbutton = document.getElementById("joinbutton");
	var joinbuttonmsg = document.getElementById("joinbuttonmsg");
	var loginbutton = document.getElementById("loginbutton");
	var loginfacebook = document.getElementById("loginfacebook");
	
	
	var flag = true;
	
	//mainbutton을 클릭하면 메인화면으로 이동
	mainbutton.addEventListener("click", function(evnet){
		location.href ="../";
	});
	
	//loginbutton을 클릭하면 메인화면으로 이동
	loginbutton.addEventListener("click", function(evnet){
		location.href ="login";
	});

	
	usernickname.addEventListener("focusout", function(event){
		//원래는 ajax를 이용해서 서버에 요청을 해야 한다.
		if(usernickname.value.length === 1) {
			usernicknamemsg.innerHTML = "이름은 2글자 이상이어야합니다. <br />";
			usernicknamemsg.style.color = "red";
			flag = false;
		}else{
			usernicknamemsg.innerHTML = "";
			flag = true;
		}
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
				useridmsg.innerHTML = "사용 가능한 이메일";
				useridmsg.style.color = "green";
				//userid 중복 검사를 통과했다고 표시
				useridcheck = true;
			}else{
				useridmsg.innerHTML = "이미 가입된 이메일입니다";
				useridmsg.style.color = "red";
				//userid 중복 검사를 통과못했다고 표시
				useridcheck = false;
				return;
			}
		})
	});
	//usernickname 중복검사 통과 여부를 저장할 변수
	var usernicknamecheck = false;
	
	usernickname.addEventListener("focusout", function(event){
		//입력한 내용이 없을 때는 검사하지 않는다.
		if(userid.value.trim().length < 1){
			/*useridmsg.innerHTML = "사용 가능한 이메일. <br />";
			useridmsg.style.color = "green";*/
			//검사하지 않도록 리턴
			return;
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
				useridmsg.innerHTML = "사용 가능한 이메일";
				useridmsg.style.color = "green";
				//userid 중복 검사를 통과했다고 표시
				useridcheck = true;
			}else{
				useridmsg.innerHTML = "이미 가입된 이메일입니다";
				useridmsg.style.color = "red";
				//userid 중복 검사를 통과못했다고 표시
				useridcheck = false;
			}
		})
	});
	
	//키보드를 눌렀을때_입력도중
	userpw.addEventListener("keydown", function(event){
		console.log(userpw.value);
		//글자수가 8자 미만이면 약함
		if(userpw.value.length < 7){
			userpwmsg.innerHTML = "약함 <br />";
			userpwmsg.style.background = "yellow";
			flag = false;
			return;
		}else{
			userpwmsg.innerHTML = "강함 <br />";
			userpwmsg.style.background = "green";
			flag = true;
		}
	});
	/*
	//폼 객체 전송할 때.
	joinform.addEventListener("submit", function(event){
		//flag가 false면 전송하지 않는다.
		if(flag == false){
			joinsubmitmsg.innerHTML = "전송 실패";
			event.preventDefault();
		};
		//폼의 데이터를 전송하지 않게 하는 것은 event.preventDefault()	
		
		
		//userid(이메일)이 형식에 맞지 않으면 전송을 하지 않도록 한다.
		//형식에 관한 유효성 검사는 정규식을 이용한다.
		
		//이메일 정규식 만들기
		var useridreg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		//정규식의 test 메소드에 문자열을 대입하면
		//정규식이 존재하면 true, 그렇지 않으면 false 리턴
		if(!useridreg.test(userid.value.trim())){
			useridmsg.innerHTML = "형식에 맞지 않음<br />";
			useridmsg.style.color = "red";
			userid.focus();
			event.preventDefault();
		}
	

	}); */
	//회원가입 버튼을 누르면
	joinbutton.addEventListener('click', function(event){
		//폼의 데이터를 전송할 때는 유효성 검사를 해주어야 한다.
		if(usernickname.value.trim().length < 1 && userid.value.trim().length < 1){
			usernicknamemsg.innerHTML = "닉네임을 입력해주세요.";
			usernicknamemsg.style.color = "red";
			useridmsg.innerHTML = "이메일을 입력해주세요.";
			useridmsg.style.color = "red";
			return;
		}
		//ajax 요청
		var request = new XMLHttpRequest();
		request.open('POST', 'join', true);
		//폼 데이터 생성
		var formData = new FormData(joinform);
		//폼의 데이터를 전송
		request.send(formData);
		//데이터를 전송하고 결과를 받아왔을 때
		request.addEventListener('load', function(event){
			//alert(event.target.responseText);
			
			//JSON 파싱 - 결과를 사용하기 위해서
			var data = JSON.parse(event.target.responseText);
			if(data.result == true){
				location.href = "login";
			}
		});
		
	});
});