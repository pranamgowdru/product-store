package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductCRUD;
import dto.Product;


@WebServlet("/update")
public class UpdateStage2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String brand=req.getParameter("brand");
		double price = Double.parseDouble(req.getParameter("price"));
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		
	    Product p = new Product(id,name,brand,price,quantity);
	    
	    int res = ProductCRUD.updateProduct(id, p);
	    
	    if(res>0) {
			RequestDispatcher rd = req.getRequestDispatcher("view");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "failed to update product");
			rd.forward(req, resp);
		}
	}
}
