package service;

import dao.UserdbDao;

//User의 요청을 처리할 메소드를 구현할 클래스
public class UserServiceImpl implements UserService {
	//Service에서 사용할 UserDao 변수
	private UserdbDao userdbDao;
	
	//싱글톤 패턴 구현 - DAO의 패턴 참조
	private UserServiceImpl() {}
	
	private static UserServiceImpl userService;

	public static UserServiceImpl sharedInstance() {
		if (userService == null) {
			userService = new UserServiceImpl();
		}
		return userService;
	}
	
}
