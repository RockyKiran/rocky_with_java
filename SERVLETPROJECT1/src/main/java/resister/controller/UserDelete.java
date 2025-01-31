package resister.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import resister.dao.UserCrud;
@WebServlet("/delete")
public class UserDelete extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value=req.getParameter("id");
		UserCrud crud=new UserCrud();
		System.out.println(value);
		crud.deleteUser(Integer.parseInt(value));
		req.setAttribute("user", crud.userFetch());
		RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
		rd.include(req, res);
		
	}

}
