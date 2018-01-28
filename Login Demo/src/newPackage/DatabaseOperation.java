package newPackage;
import newPackage.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;

public class DatabaseOperation 
{
	static Connection con;
	static Statement stmt;
	static ResultSet res;
	static User user;
	static Subject subject;
	static PreparedStatement pset,pget;
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException
	 * 
	{
		databaseConnection();
	} */
	
	public static void databaseConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		stmt=con.createStatement();  
		if(con.isClosed()==false)
			System.out.println("Database connection successful");
		else
			System.out.println("Database connection Failed");
	}
	
	public static boolean CheckForLogin(String uname,String pwd) throws SQLException
	{
		//System.out.println("Inside CheckForLogin method");
		String query="select uname, pwd from userinfo where uname='"+uname+"' and pwd='"+pwd+"';";
		System.out.println("After query");
		res=stmt.executeQuery(query);
		while(res.next())
		{
				return true;
		}
		return false;
	}
	
	public static boolean Signup(String uname, String pwd,String fname, String lname, String mob, String emailid, String address) throws SQLException
	{
		System.out.println("Inside db Signup method");
		String query="insert into userinfo values('"+uname+"','"+pwd+"','"+fname+"','"+lname+"','"+mob+"','"+emailid+"','"+address+"');";
		int r=stmt.executeUpdate(query);
		System.out.println(r);
		if(r!=0)
			return true;
		return false;
	}
	
	public static boolean checkUsername(String uname) throws SQLException
	{
		String query="select uname from userinfo where uname='"+uname+"';";
		res=stmt.executeQuery(query);
		if(res.next())
			return false;
		return true;
	}
	
	public static User setUserDetails(String uname) throws SQLException
	{
		//System.out.println("inside GetUserDetails");
		String query="select * from userinfo where uname='"+uname+"';";
		res=stmt.executeQuery(query);
		//System.out.println("after query");
		int i=1;
		while(res.next())
			{
			user=new User(res.getString(1),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
			//System.out.println(res.getString(1)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5)+" "+res.getString(6)+" "+res.getString(7));;
			}
		//System.out.println("db user fname "+user.getFname());
		//System.out.println("done userdetails");
		return user;
	}
	
	public static Subject getGrade(String uname) throws SQLException
	{
		String query="select * from gradeDetails where uname='"+uname+"';";
		res=stmt.executeQuery(query);
		while(res.next())
 			subject=new Subject(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8));
			
		return subject;
	}
	
	
	
	
	
	public static void CloseConnection() throws SQLException
	{
		con.close();
		System.out.println("Database close successfully");
	}
	public static void storeImage() throws SQLException, IOException
	{
		pset=(PreparedStatement) con.prepareStatement("insert into pic values(?)");  
		FileInputStream fin=new FileInputStream("d:\\sports.jpg");  
		pset.setBinaryStream(1,fin,fin.available());  
		int i=pset.executeUpdate(); 
		System.out.println(i);
	}
	public static void getImage() throws SQLException, IOException
	{
		pget=(PreparedStatement) con.prepareStatement("select * from pic");  
		ResultSet rs=pget.executeQuery();  
		if(rs.next())
		{
			//now on 1st row           
		Blob b=(Blob) rs.getBlob(1);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image        
		FileOutputStream fout=new FileOutputStream("d:\\a.jpg");  
		fout.write(barr);  
		}
	}
	
}

