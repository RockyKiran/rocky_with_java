import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AdditionBro extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value1 = req.getParameter("num1");
		String value2 = req.getParameter("num2");
		
		int num1=Integer.parseInt(value1);
		int num2=Integer.parseInt(value2);
		
		System.out.println("num1 "+"+ "+ " num2 " +"= "+(num1+num2));
		
	}
	

}
