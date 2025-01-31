package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import resister.dao.UserCrud;
import resister.dto.User;

@WebServlet("/resi")
public class StudentRes extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String age = req.getParameter("age");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		String gender = req.getParameter("gender");
		String pwd = req.getParameter("pwd");
		
		UserCrud crud=new UserCrud();
		
		PrintWriter pw=res.getWriter();
		pw.println("succesfully...............");
		

		try {
			crud.userSave(new User(fname, lname, email, gender, Long.parseLong(phno), pwd, Integer.parseInt(age)));
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);

			
		} catch (Exception e) {
			// TODO: handle exception
			RequestDispatcher rd=req.getRequestDispatcher("resister.html");
			rd.include(req, res);
		}
		
	}
	

}
