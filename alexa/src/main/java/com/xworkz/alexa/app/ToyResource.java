package com.xworkz.alexa.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/toy",loadOnStartup = 2)
	public class ToyResource extends HttpServlet{
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("toyName");
			String quantity=req.getParameter("quantity");
			String minAge=req.getParameter("minAge");
			String idealFor=req.getParameter("idealFor");
			String color=req.getParameter("color");
			
			System.out.println("Toy Name : "+name);
			System.out.println("Ideal For : "+idealFor);
			System.out.println("Min Age : "+minAge);
			System.out.println("Quantity : "+quantity);
			System.out.println("Color : "+color);
			
			
		}

	}

