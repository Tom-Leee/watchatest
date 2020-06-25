package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//user에 대한 처리를 하기 위한 메소드 선언을 위한 인터페이스
//메뉴판과 유사한 역할을 수행한다.
public interface UserService {

	void useridCheck(HttpServletRequest request, HttpServletResponse response);
	void usernicknameCheck(HttpServletRequest request, HttpServletResponse response);


}