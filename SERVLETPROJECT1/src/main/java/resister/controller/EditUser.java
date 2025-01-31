package resister.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import resister.dao.UserCrud;
import resister.dto.User;

@WebServlet("/edit")
public class EditUser extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String id = req.getParameter("id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String age = req.getParameter("age");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		String gender = req.getParameter("gender");
		String pwd = req.getParameter("pwd");
		
		
			UserCrud crud =new UserCrud();
			User user=new User(fname, lname, email, gender, Long.parseLong(phno), pwd, Integer.parseInt(age));
			user.setId(Integer.parseInt(id));
			crud.userUpdate(user);
			
			req.setAttribute("user", crud.userFetch());
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			rd.include(req, res);

			
		
	}

}
