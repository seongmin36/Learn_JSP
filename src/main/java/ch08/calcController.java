package ch08;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcController")
public class calcController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public calcController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1=Integer.parseInt(request.getParameter("num1").trim());
		int num2=Integer.parseInt(request.getParameter("num2").trim());
		String op=request.getParameter("op");
		
		long result=0;
		
		if(op.equals("+")) {
			result=num1+num2;
		} else if(op.equals("-")) {
			result=num1-num2;
		} else if(op.equals("*")) {
			result=num1*num2;
		} else if(op.equals("/")) {
			result=num1/num2;
		}
				
		response.setContentType("text/html; charset=UTF-8");
		request.setAttribute("result", result);
		getServletContext().getRequestDispatcher("/WebServer_Report2/8_1/calcResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
