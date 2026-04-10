package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FoodDao;
import model.OrderDao;

/**
 * Servlet implementation class OrderAddServe
 */
@WebServlet("/OrderAddServe")
public class OrderAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String fid=request.getParameter("fid");
		int qty=Integer.parseInt(request.getParameter("qty"));
		String uname=request.getParameter("uname");
		OrderDao odao=new OrderDao();
		odao.insertData(fid, qty, uname);
		response.sendRedirect("Billing.jsp");
		
	}

}
