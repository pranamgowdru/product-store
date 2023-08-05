package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerCRUD;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		int pwd = Integer.parseInt(req.getParameter("password"));

		boolean res = CustomerCRUD.check(email, pwd);

		if (res ) {
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			req.setAttribute("MSG", "success");
			rd.forward(req, resp);
		} else {

			PrintWriter pw = resp.getWriter();
			pw.write("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n" + "<h1>error</h1>\r\n"
					+ "\r\n" + "</body>\r\n" + "</html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
		}

	}
}
