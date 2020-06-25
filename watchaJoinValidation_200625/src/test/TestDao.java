package test;

import dao.UserdbDao;

public class TestDao {

	@Test
	public void useridCheck() {
		UserdbDao dao = UserdbDao.sharedInstance();
		System.out.println(dao.useridCheck("dark89612@hanmail.net"));
	}
}
