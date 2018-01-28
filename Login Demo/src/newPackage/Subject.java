package newPackage;

public class Subject 
{
	String Ooad,Dm,Os,Prob,Cn,uname,RollNo,image;
	public Subject(String uname,String RollNo,String Ooad,String Dm,String Os,String Prob,String Cn,String image)
	{
		setImage(image);
		setOoad(Ooad);
		setCn(Cn);
		setDm(Dm);
		setOs(Os);
		setProb(Prob);
		setUname(uname);
		setRollNo(RollNo);
	}
	

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getRollNo() {
		return RollNo;
	}


	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}


	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getOoad() {
		return Ooad;
	}

	public String getDm() {
		return Dm;
	}

	public String getOs() {
		return Os;
	}

	public String getProb() {
		return Prob;
	}

	public String getCn() {
		return Cn;
	}

	public void setOoad(String ooad) {
		Ooad = ooad;
	}

	public void setDm(String dm) {
		Dm = dm;
	}

	public void setOs(String os) {
		Os = os;
	}

	public void setProb(String prob) {
		Prob = prob;
	}

	public void setCn(String cn) {
		Cn = cn;
	}
	

}
