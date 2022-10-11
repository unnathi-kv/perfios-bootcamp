package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/BookCourier")
public class BookCourier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher;
		
		Calendar calendar = Calendar.getInstance();
		
		CustomerDetails customerDetails = new CustomerDetails();	
		CustomerDao customerDao = new CustomerDao();
		
		
		String cust_name = (String)request.getParameter("cust_name");
		String cust_city = (String)request.getParameter("cust_city");
		String mobileno = (String)request.getParameter("mobileno");
		String delivery_area = (String)request.getParameter("delivery_area");
		String weight = (String)request.getParameter("weight");
		
		double courier_weight = Double.parseDouble(weight);
		
		double weightamt = CustomerDao.weightcal(courier_weight);
		
		customerDetails.setCust_name(cust_name);
		customerDetails.setCust_city(cust_city);
		customerDetails.setMobileno(mobileno);
		customerDetails.setDelivery_area(delivery_area);
		customerDetails.setCourier_weight(courier_weight);
		customerDetails.setShipment_date(java.time.LocalDate.now());
		
		if (cust_city.equals("Mumbai") && delivery_area.equals("Mumbai")){
			  customerDetails.setAmount(weightamt+200);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(1));
			  
			  
		}
		
		else if (cust_city.equals("Mumbai") && delivery_area.equals("Bangalore")){
			 customerDetails.setAmount(weightamt+500);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(2));

		}
		
		else if (cust_city.equals("Mumbai") && delivery_area.equals("Chennai")){
			 customerDetails.setAmount(weightamt+1000);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(3));

		}
		
		
		else if (cust_city.equals("Bangalore") && delivery_area.equals("Bangalore")){
			 customerDetails.setAmount(weightamt+200);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(1));

		}	
		else if (cust_city.equals("Bangalore") && delivery_area.equals("Mumbai")){
			 customerDetails.setAmount(weightamt+500);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(2));

		}
		
		else if (cust_city.equals("Bangalore") && delivery_area.equals("Chennai")){
			 customerDetails.setAmount(weightamt+300);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(3));

		}
		
		
		else if (cust_city.equals("Chennai") && delivery_area.equals("Chennai")){
			 customerDetails.setAmount(weightamt+200);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(1));

		}
		
		else if (cust_city.equals("Chennai") && delivery_area.equals("Bangalore")){
			 customerDetails.setAmount(weightamt+300);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(3));

		}
		
		else if (cust_city.equals("Chennai") && delivery_area.equals("Mumbai")){
			 customerDetails.setAmount(weightamt+1000);
			  customerDetails.setDelivery_date(customerDetails.getShipment_date().plusDays(3));

		}
		try {
		int x = customerDao.bookCourier(customerDetails);
		if(x>0)
		{
			 session.setAttribute("cust_name", customerDetails.getCust_name());
			 session.setAttribute("cust_city", customerDetails.getCust_city());
			 session.setAttribute("delivery_area", customerDetails.getDelivery_area());
			 session.setAttribute("weight", customerDetails.getCourier_weight());
			 session.setAttribute("amount", customerDetails.getAmount());
			 session.setAttribute("mobileno", customerDetails.getMobileno());
			 dispatcher=request.getRequestDispatcher("invoice.jsp");
			 dispatcher.forward(request, response);
		}
		}
		catch(Exception e)
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			out.println("<br><br><center><font color = 'red'; weight = bolder;>Oops Error!!</font></center>");
			e.printStackTrace();
		}
		
	}
}

