package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerCRUD;
import dto.Customer;

@WebServlet("/customerLogin")
public class InsertServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		int password=Integer.parseInt(req.getParameter("password"));
		long phone=Long.parseLong(req.getParameter("phone"));
		
	    Customer c = new Customer();
	    c.setId(id);
	    c.setName(name);
	    c.setEmail(email);
	    c.setPassword(password);
	    c.setPhone(phone);
	    
	    int res  = CustomerCRUD.insertCustomer(c);
	    RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
	    if(res==1) {
	    	
	        req.setAttribute("msg", "sucess");
	    	rd.forward(req, resp);
	    }else {
	    	
	        req.setAttribute("msg", "failed");
	    	rd.forward(req, resp);
	    }
	}
	
}
