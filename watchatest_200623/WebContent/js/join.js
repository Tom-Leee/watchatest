window.addEventListener("load", function(event){
	
	var usernickname = document.getElementById("usernickname");
	var usernicknamemsg = document.getElementById("usernicknamemsg");
	var userid = document.getElementById("userid");
	var useridmsg = document.getElementById("useridmsg");
	var userpassword = document.getElementById("userpassword");
	var userpasswordmsg = document.getElementById("userpasswordmsg");
	var joinform = document.getElementById("joinform");
	var joinsubmitmsg = document.getElementById("joinsubmitmsg");
	
	var flag = true;
	
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
	
	userid.addEventListener("focusout", function(event){
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
		//원래는 ajax를 이용해서 서버에 요청을 해야 한다.
		if(useridreg.value === 'dark8961@hanmail.net'){
			useridmsg.innerHTML = "이미 가입된 이메일입니다. <br />";
			useridmsg.style.color = "red";
			flag = false;
		}else{
			useridmsg.innerHTML = "";
			flag = true;
		}
	});
	
	//키보드를 눌렀을때_입력도중
	userpassword.addEventListener("keydown", function(event){
		console.log(userpassword.value);
		//글자수가 8자 미만이면 약함
		if(userpassword.value.length < 7){
			userpasswordmsg.innerHTML = "약함 <br />";
			userpasswordmsg.style.background = "yellow";
			flag = false;
		}else{
			userpasswordmsg.innerHTML = "강함 <br />";
			userpasswordmsg.style.background = "green";
			flag = true;
		}
	});
	
	//폼 객체 전송할 때.
	joinform.addEventListener("submit", function(event){
		//flag가 false면 전송하지 않는다.
		if(flag == false){
			joinsubmitmsg.innerHTML = "전송 실패";
			event.preventDefault();
		};
		//폼의 데이터를 전송하지 않게 하는 것은 event.preventDefault()	
		
		/*
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
		} */

	});
});