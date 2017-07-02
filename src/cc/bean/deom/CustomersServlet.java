package cc.bean.deom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomersServlet
 */
@WebServlet("/customersServlet")
public class CustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customers> customers = new ArrayList<Customers>();
		customers.add(new Customers("张三","25","hz","135"));
		customers.add(new Customers("李四","26","sh","136"));
		customers.add(new Customers("王五","24","bj","137"));
		customers.add(new Customers("赵六","27","tj","138"));
		request.setAttribute("customers", customers);
		//转发到一个tagdemo.jsp
		request.getRequestDispatcher("/tagdemo.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
