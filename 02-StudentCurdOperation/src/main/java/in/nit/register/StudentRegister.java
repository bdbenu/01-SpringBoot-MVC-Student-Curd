package in.nit.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class StudentRegister extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		String stdName=req.getParameter("stdName");
		String stdGender=req.getParameter("stdGender");
		String stdEmail=req.getParameter("stdEmail");
		String stdMobile=req.getParameter("stdMobile");
		String stdUsername=req.getParameter("stdUsername");
		String stdPassword=req.getParameter("stdPassword");
		pw.println(stdName);
		pw.println(stdGender);
		pw.println(stdEmail);
		pw.println(stdMobile);
		pw.println(stdUsername);
		pw.println(stdPassword);
		pw.close();
	}
}
