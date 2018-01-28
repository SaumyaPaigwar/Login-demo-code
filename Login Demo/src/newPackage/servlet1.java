package newPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DatabaseOperation db=new DatabaseOperation();
	static User user;
	static Subject subject;
	PrintWriter writer; 
	static String uname;
	HttpSession session;
    public servlet1() throws ClassNotFoundException, SQLException 
    {
        super();
        System.out.println("In servlet 1");
        db.databaseConnection();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	{
		 try {
			writer =response.getWriter();
			response.getWriter().append("Served at: ").append(request.getContextPath());
			if (request.getParameter("signup") != null) 
				{
				signup(request,response);
				response.getWriter().append("signup complete ");
				}
			
			
			if (request.getParameter("login") != null) 
	            {

				String uname=(String) request.getParameter("uname");
				String pwd=(String) request.getParameter("pwd");
				if(!(uname.equals("") || uname.equals(null)))
					login(request,response);
				else
					response.sendRedirect("web-pages/login.jsp");
				response.getWriter().append("login complete ");
	            }
			
			if(request.getParameter("viewGrade")!=null)
				viewGrade(request,response);
			
			
			if(request.getParameter("Close")!=null)
				Close(request,response);
			
	        
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
	}
	
	private void viewGrade(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		// TODO Auto-generated method stub
		session=request.getSession(); 
		subject=db.getGrade(uname);
		session.setAttribute("subject", subject);
		response.sendRedirect("web-pages/result.jsp");
		
	}

	public void login(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		System.out.println("Inside Login method");
		boolean flag=false;
		uname=(String) request.getParameter("uname");
		String pwd=(String) request.getParameter("pwd");
		session=request.getSession(); 
		flag=db.CheckForLogin(uname, pwd);
		if(flag)
		{
			session.setAttribute("uname", uname);
			System.out.println("Login Successful !!");
			user = db.setUserDetails(uname);
			session.setAttribute("user", user);
			//System.out.println(user.getFname());
			System.out.println("Redirecting to welcome jsp");
			response.sendRedirect("web-pages/Welcome.jsp");
		}
		else
			response.sendRedirect("web-pages/login.jsp");
		
		System.out.println("login method end");
	}
	
	public void signup(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException
	{
		System.out.println("Inside Signup method");
		boolean flag=true;
		writer =response.getWriter();
		String uname=(String) request.getParameter("uname");
		/*if(!db.checkUsername(uname))
			{
			writer.println("Username Already Exists");
			flag=false;
			}	*/
			
		String pwd=(String) request.getParameter("pwd1");
		String repwd=(String) request.getParameter("pwd2");
		/*if(!pwd.equals(repwd))
			{
			writer.println("Entered Password does not match");
			flag=false;
			}
	*/
		String fname=(String) request.getParameter("fname");
		String lname=(String) request.getParameter("lname");
		String mob=(String) request.getParameter("mob");
		
		/*Pattern p=Pattern.compile("[7-9][0-9]+10");
		Matcher m=p.matcher(mob);
		if(!m.matches())
			{
			writer.println("Enter valid Mobile Number");
			flag=false;
			}
		*/
		String emailid=(String) request.getParameter("emailid");
		/*p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9]*@[a-z]*.[a-z]*");
		m=p.matcher(emailid);
		if(!m.matches())
			{
			writer.println("Enter valid Email-Id");
			flag=false;
			}
		*/
		String address=(String) request.getParameter("address");
		
		boolean result=false;
		if(flag)
			{
			result=db.Signup(uname,pwd,fname,lname,mob,emailid,address);
			System.out.println("Entry successful");
			}
		
		if(result)
			response.sendRedirect("web-pages/login.jsp");
		else
			response.sendRedirect("web-pages/signup.jsp");			
			
		
		System.out.println("signup complete");
	}
	
	
	private void Close(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		// TODO Auto-generated method stub

		response.sendRedirect("web-pages/login.jsp");
		//System.exit(0);
		
	}

}
