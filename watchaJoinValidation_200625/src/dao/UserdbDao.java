package dao;

public class UserdbDao extends AbstractDao {
	//Singleton 패턴을 적용하기 위한 코드
	//인스턴스를 하나만 생성하는 디자인 패턴
	//모든 곳에서 공유할 데이터를 갖는 클래스나
	//Entry Point(출입구)에 해당하는 클래스 또는
	//서버에서 클라이언트의 요청을 처리하는 클래스는
	//인스턴스가 1개이면 된다.
	private UserdbDao() {}
	
	private static UserdbDao userdbDao;

	public static UserdbDao sharedInstance() {
		if (userdbDao == null) {
			userdbDao = new UserdbDao();
		}
		return userdbDao;
	}
	//userid(email) 중복 검사를 위한 메소드
	public boolean useridCheck(String userid) {
		System.out.println(userid);
		boolean result = false;
		connect();
		
		try {
			//SQL 생성
			//userid(email)을 대문자로 변경해서 비교
			pstmt = con.prepareStatement("select userid from userdb where upper(userid) = ?");
			//데이터 바인딩
			pstmt.setString(1, userid.toUpperCase());
			//SQL 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = false;
			}else{
				result = true;
			}

		}catch(Exception e) {
			System.out.println("DAO:" + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(result);
		close();
		return result;
	}
	
	//usernickname 중복 검사를 위한 메소드
		public boolean usernicknameCheck(String usernickname) {
			System.out.println(usernickname);
			boolean result = false;
			connect();
			
			try {
				//SQL 생성
				pstmt = con.prepareStatement("select usernickname from userdb where upper(usernickname) = ?");
				//데이터 바인딩
				pstmt.setString(1, usernickname.toUpperCase());
				//SQL 실행
				rs = pstmt.executeQuery();
				if(rs.next()) {
					result = false;
				}else{
					result = true;
				}
	
			}catch(Exception e) {
				System.out.println("DAO:" + e.getMessage());
				e.printStackTrace();
			}
			
			close();
			return result;
		}
}
