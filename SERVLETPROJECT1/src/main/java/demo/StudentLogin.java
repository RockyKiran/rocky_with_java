package demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import resister.dao.UserCrud;
import resister.dto.User;

@WebServlet("/login")
public class StudentLogin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");

		UserCrud crud = new UserCrud();

//		try {
//			crud.loginUser(email, pwd);
//			RequestDispatcher rd=req.getRequestDispatcher("sucessfully.html");
//			rd.forward(req, res);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			RequestDispatcher rd=req.getRequestDispatcher("login.html");
//			rd.include(req, res);
//			
//
//		
//		}
		try {
			User user = crud.loginEmailUser(email);
			if (user.getPwd().equals(pwd)) {
				System.out.println("login succesfully");
				req.setAttribute("user", crud.userFetch());
				RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
				rd.forward(req, res);
					
			}
			else {
				System.out.println("password is wrong");
				req.setAttribute("msg", "wrong password");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.include(req, res);
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("email is wrong so write properly....");
			req.setAttribute("msg", "wrong email");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, res);

		}

	}

	

}
