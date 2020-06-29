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
	
	public String getUsercode() {
		return usercode;
	}



	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getUserpw() {
		return userpw;
	}



	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}



	public String getUsernickname() {
		return usernickname;
	}



	public void setUsernickname(String usernickname) {
		this.usernickname = usernickname;
	}



	public String getUserprofileimage() {
		return userprofileimage;
	}



	public void setUserprofileimage(String userprofileimage) {
		this.userprofileimage = userprofileimage;
	}



	public String getWatchaplaymembership() {
		return watchaplaymembership;
	}



	public void setWatchaplaymembership(String watchaplaymembership) {
		this.watchaplaymembership = watchaplaymembership;
	}



	public Date getUserlastlogindate() {
		return userlastlogindate;
	}



	public void setUserlastlogindate(Date userlastlogindate) {
		this.userlastlogindate = userlastlogindate;
	}



	public String getIslogin() {
		return islogin;
	}



	public void setIslogin(String islogin) {
		this.islogin = islogin;
	}



	public String getIsremove() {
		return isremove;
	}



	public void setIsremove(String isremove) {
		this.isremove = isremove;
	}



	public int getIsemail() {
		return isemail;
	}



	public void setIsemail(int isemail) {
		this.isemail = isemail;
	}



	public boolean isUserwithdrawal() {
		return userwithdrawal;
	}



	public void setUserwithdrawal(boolean userwithdrawal) {
		this.userwithdrawal = userwithdrawal;
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
