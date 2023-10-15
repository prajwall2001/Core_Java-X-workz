package com.xworkz.shop;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/flipkart", loadOnStartup = 5)
public class ProductResource extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
	    String type = req.getParameter("type");
	    String price = req.getParameter("price");
	    String brand = req.getParameter("brand");
	    String quantity = req.getParameter("quantity");
	    String description = req.getParameter("description");


	    if (!price.isEmpty()) {
	        int convertedPrice = Integer.parseInt(price);
	        int convertedQuantity = Integer.parseInt(quantity);
	        int total = convertedPrice * convertedQuantity;

	        req.setAttribute("name", name);
	        req.setAttribute("type", type);
	        req.setAttribute("price", price);
	        req.setAttribute("brand", brand);
	        req.setAttribute("quantity", quantity);
	        req.setAttribute("description", description);
	        req.setAttribute("total", total);
	        System.out.println("Product details sent successfully");
	        RequestDispatcher dispatcher = req.getRequestDispatcher("productSuccess.jsp");
	        dispatcher.forward(req, resp);
	    } else {
	        req.setAttribute("errorMsg", "Price is mandatory");
	        System.out.println("Price is mandatory");
	        req.setAttribute("name", name);
            req.setAttribute("type", type);
            req.setAttribute("brand", brand);
            req.setAttribute("quantity", quantity);
            req.setAttribute("description", description);
	        RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
	        dispatcher.forward(req, resp);
	    }
	}
}