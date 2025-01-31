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
@WebServlet("/update")
public class UserUpdate extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value=req.getParameter("id");
		UserCrud crud=new UserCrud();
		User db = crud.UserFetch(Integer.parseInt(value));
		if(db!=null) {
		req.setAttribute("user",db );
		RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
		rd.forward(req, res);
		}
		
	}
	

}
