package com.xworkz.farmer.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/farmers", loadOnStartup = 5)
public class FarmerResource extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String acres = req.getParameter("acres");
		String cropType = req.getParameter("cropType");
		String soilType = req.getParameter("soilType");
		String fertilizer = req.getParameter("fertilizer");
		String seasons = req.getParameter("seasons");
		String investment = req.getParameter("investment");
		String profit = req.getParameter("profit");
		String RTCNo = req.getParameter("RTCNo");

		System.out.println(" name : " + name);
		System.out.println(" Acres : " + acres);
		System.out.println(" cropType : " + cropType);
		System.out.println(" soilType : " + soilType);
		System.out.println(" fertilizer : " + fertilizer);
		System.out.println(" seasons : " + seasons);
		System.out.println(" investment : " + investment);
		System.out.println(" profit : " + profit);
		System.out.println(" RTCNo : " + RTCNo);

		double convertedInvestment = Double.parseDouble(investment);
		float convertedProfit = Float.parseFloat(profit);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<!doctype html>\r\n" + "<html lang=\"en\">\r\n" + "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>X-workz</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n"
				+ "  </head>\r\n" + "  <body>\r\n"
				+ "  <nav class=\"navbar bg-dark border-bottom border-body\" data-bs-theme=\"dark\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n" + "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n" + "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
				+ "      <ul class=\"navbar-nav\">\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Home</a>\r\n"
				+ "        </li>\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link\" href=\"farmer.html\">Farmer</a>\r\n" + "        </li>\r\n"
				+ "      </ul>\r\n" + "    </div>\r\n" + "  </div>\r\n" + "</nav>\r\n"
				+ "<h1><strong>Farmer Details......</strong></h1>\r\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n" + "</html>");
		writer.print("</br> name : " + name);
		writer.print("</br> Acres : " + acres);
		writer.print("</br> cropType : " + cropType);
		writer.print("</br> soilType : " + soilType);
		writer.print("</br> fertilizer : " + fertilizer);
		writer.print("</br> seasons : " + seasons);
		writer.print("</br> investment : " + investment);
		writer.print("</br> profit : " + profit);
		writer.print("</br> RTCNo : " + RTCNo);

		if (convertedProfit > convertedInvestment) {
			writer.print("</br><span style ='color:green;'>It is good year...");
		} else {
			writer.print("</br><span style ='color:red;'>It is not a good year....");
		}
	}

}
