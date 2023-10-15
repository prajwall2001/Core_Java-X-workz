package com.xworkz.station.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/prajwal", loadOnStartup = 5)
public class PoliceStationResource extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String headConstable = req.getParameter("headConstable");
		String location = req.getParameter("location");
		String assistantCommissioner = req.getParameter("assistantCommissioner");
		String inspectorName = req.getParameter("inspectorName");
		String numberOfCells = req.getParameter("numberOfCells");
		String SIName = req.getParameter("SIName");
		String noOfCasesPending = req.getParameter("noOfCasesPending");
		String painted = req.getParameter("painted");

		System.out.println(" Name : " + name);
		System.out.println(" HeadConstable : " + headConstable);
		System.out.println(" Location : " + location);
		System.out.println(" AssistantCommissioner : " + assistantCommissioner);
		System.out.println(" InspectorName : " + inspectorName);
		System.out.println(" NumberOfCells : " + numberOfCells);
		System.out.println(" SIName : " + SIName);
		System.out.println(" NoOfCasesPending : " + noOfCasesPending);
		System.out.println(" Painted : " + painted);

		int convertedNumberOfCells = Integer.parseInt(numberOfCells);
		int convertedNoOfCasesPending = Integer.parseInt(noOfCasesPending);
		boolean convertedPainted = Boolean.parseBoolean(painted);

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
				+ "          <a class=\"nav-link\" href=\"station.html\">Police Station</a>\r\n" + "        </li>\r\n"
				+ "      </ul>\r\n" + "    </div>\r\n" + "  </div>\r\n" + "</nav>\r\n"
				+ "<h1><strong>karnataka State Police</strong> </h1><br>\r\n" + "<h4>Government of Karnataka</h4>\r\n"
				+"<h1>Police Station  Details......</h1>\r\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n" + "</html>\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
				+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
				+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "");

		writer.print(" <br>Name : " + name);
		writer.print(" <br>HeadConstable : " + headConstable);
		writer.print("<br> Location : " + location);
		writer.print("<br> AssistantCommissioner : " + assistantCommissioner);
		writer.print(" <br>InspectorName : " + inspectorName);
		writer.print("<br> NumberOfCells : " + numberOfCells);
		writer.print("<br> SIName : " + SIName);
		writer.print(" <br>NoOfCasesPending : " + noOfCasesPending);
		writer.print("<br> Painted : " + painted);

		if (convertedNoOfCasesPending > 100) {
			writer.print("</br><span style ='color:red;'>Many cases are pending...");
		} else {
			writer.print("</br><span style ='color:green;'>Less cases are pending....");
		}
		if (convertedNumberOfCells > 10) {
			writer.print("</br><span style ='color:green;'>It is a Big Station...");
		} else {
			writer.print("</br><span style ='color:red;'>It is not a Big Station....");
		}
		if (convertedPainted == true  ) {
			writer.print("</br><span style ='color:green;'>It is Clean...");
		} else {
			writer.print("</br><span style ='color:red;'>It is Dirty....");
		}

	}
}