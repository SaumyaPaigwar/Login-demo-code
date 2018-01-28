package newPackage;

public class User 
{
	static  String uname="",fname="",lname="",mob="",emailid="",address="";
	
	public User(String uname,String fname, String lname, String mob, String email, String address) 
	{
		setUname(uname);
		setFname(fname);
		setLname(lname);
		setMob(mob);
		setEmailid(email);
		setAddress(address);
	}

	public  static String getUname() {
		return uname;
	}

	public static String getFname() {
		System.out.println("fname is "+fname);
		return fname;
	}

	public static String getLname() {
		return lname;
	}

	public static String getMob() {
		return mob;
	}

	public  static String getEmailid() {
		return emailid;
	}

	public static String getAddress() {
		return address;
	}

	public  void setUname(String uname) {
		this.uname = uname;
	}

	public  void setFname(String fname) {
		System.out.println("set fname "+fname);
		this.fname = fname;
	}

	public  void setLname(String lname) {
		this.lname = lname;
	}

	public  void setMob(String mob) {
		this.mob = mob;
	}

	public   void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public  void setAddress(String address) {
		this.address = address;
	}
	

}
