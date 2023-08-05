package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductCRUD;

@WebServlet("/delBrand")
public class DeleteByBrand extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String brand=req.getParameter("brandName");
		
		int res = ProductCRUD.deleteByBrand(brand);
		
		
		if(res>0) {
			RequestDispatcher rd = req.getRequestDispatcher("view");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "failed to delete by brand");
			rd.forward(req, resp);
		}
	}
}
