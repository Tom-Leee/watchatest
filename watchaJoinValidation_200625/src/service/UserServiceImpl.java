package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.UserdbDao;

//User의 요청을 처리할 메소드를 구현할 클래스
public class UserServiceImpl implements UserService {
	//Service에서 사용할 UserDao 변수
	private UserdbDao userdbDao;
	
	//싱글톤 패턴 구현 - DAO의 패턴 참조
	private UserServiceImpl() {
		userdbDao = UserdbDao.sharedInstance();
	}
	
	private static UserService userService;

	public static UserService sharedInstance() {
		if (userService == null) {
			userService = new UserServiceImpl();
		}
		return userService;
	}
	//userid(이메일) 중복체크
	@Override
	public void useridCheck(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("서비스까지 요청 도달");
		// 1. 파라미터 읽기
		try {
			request.setCharacterEncoding("utf-8");
		}catch(Exception e) {
			System.out.println("Service:" + e.getMessage());
			e.printStackTrace();
		}
		String userid = request.getParameter("userid");
		
		
		// 2. 별도의 작업을 수행해야 하면 처리
		//암호화, 파일 업로드, 파라미터를 다른 자료형으로 변환
		//업무처리에 필요한 알고리즘
		
		// 3. DAO 작업이 필요하면 호출할 DAO 메소드와 매개변수를 생성
		
		// 4. DAO의 메소드를 호출해서 결과를 변수에 저장
		boolean result = userdbDao.useridCheck(userid);
		
		// 5. 단순 웹 페이지를 위한 서버의 경우는 결과들을 request나 session에 저장
		//REST API 서버의 경우는 JSONObject 클래스의 객체를 만들어서 저장한 후 request에 저장한다.
		//웹 페이지를 위한 로그인의 경우만 session에 저장하던지
		//데이터베이스에 로그인 여부를 저장해 놓는다.
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		//request에 저장
		request.setAttribute("result", obj);
	}
	//usernickname 중복체크
	@Override
	public void usernicknameCheck(HttpServletRequest request, HttpServletResponse response) {
		// 1. 파라미터 읽기
		try {
			request.setCharacterEncoding("utf-8");
		}catch(Exception e) {
			System.out.println("Service:" + e.getMessage());
			e.printStackTrace();
		}
		String usernickname = request.getParameter("usernickname");
				
				
		// 2. 별도의 작업을 수행해야 하면 처리
		//암호화, 파일 업로드, 파라미터를 다른 자료형으로 변환
		//업무처리에 필요한 알고리즘
				
		// 3. DAO 작업이 필요하면 호출할 DAO 메소드와 매개변수를 생성
				
		// 4. DAO의 메소드를 호출해서 결과를 변수에 저장
			boolean result = userdbDao.usernicknameCheck(usernickname);
				
		// 5. 단순 웹 페이지를 위한 서버의 경우는 결과들을 request나 session에 저장
		//REST API 서버의 경우는 JSONObject 클래스의 객체를 만들어서 저장한 후 request에 저장한다.
		//웹 페이지를 위한 로그인의 경우만 session에 저장하던지
		//데이터베이스에 로그인 여부를 저장해 놓는다.
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		//request에 저장
		request.setAttribute("result", obj);
		
		//기억해야 할 것은 파라미터 이름(nickname)
		//결과를 저장할 때 사용한 속성이름과 데이터
		//request나 session에 저장한 이름
		
	}
	
}
