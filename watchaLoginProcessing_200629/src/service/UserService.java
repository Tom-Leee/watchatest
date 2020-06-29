package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//user에 대한 처리를 하기 위한 메소드 선언을 위한 인터페이스
//메뉴판과 유사한 역할을 수행한다.
public interface UserService {
	//userid 중복검사를 위한 메소드
	void useridCheck(HttpServletRequest request, HttpServletResponse response);
	//usernickname 중복검사를 위한 메소드
	void usernicknameCheck(HttpServletRequest request, HttpServletResponse response);
	//회원가입을 위한 메소드
	void joininsert(HttpServletRequest request, HttpServletResponse response);
	//로그인을 위한 메소드
	void logincheck(HttpServletRequest request, HttpServletResponse response);

}