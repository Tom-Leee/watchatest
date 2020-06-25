package domain;

import java.sql.Date;

public class Userdb {
	private String usercode;
	private String userid;
	private String userpw;					 
	private String usernickname;  	    	 
	private String userprofileimage; 
	private String watchaplaymembership;	 
	private Date userlastlogindate;	
	private String islogin;		
	private String isremove;	
	private int isemail;		
	private boolean userwithdrawal;	
	
	public Userdb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Userdb(String usercode, String userid, String userpw, String usernickname, String userprofileimage,
			String watchaplaymembership, Date userlastlogindate, String islogin, String isremove, int isemail,
			boolean userwithdrawal) {
		super();
		this.usercode = usercode;
		this.userid = userid;
		this.userpw = userpw;
		this.usernickname = usernickname;
		this.userprofileimage = userprofileimage;
		this.watchaplaymembership = watchaplaymembership;
		this.userlastlogindate = userlastlogindate;
		this.islogin = islogin;
		this.isremove = isremove;
		this.isemail = isemail;
		this.userwithdrawal = userwithdrawal;
	}


	@Override
	public String toString() {
		return "Userdb [usercode=" + usercode + ", userid=" + userid + ", userpw=" + userpw + ", usernickname="
				+ usernickname + ", userprofileimage=" + userprofileimage + ", watchaplaymembership="
				+ watchaplaymembership + ", userlastlogindate=" + userlastlogindate + ", islogin=" + islogin
				+ ", isremove=" + isremove + ", isemail=" + isemail + ", userwithdrawal=" + userwithdrawal + "]";
	}
	
	
}
