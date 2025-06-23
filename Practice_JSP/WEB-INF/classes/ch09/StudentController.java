package ch09;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.*;

@WebServlet("/scontrol")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	studentDAO dao;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		dao = new studentDAO();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		String view="";
		
		if(action == null) {
			getServletContext().getRequestDispatcher("/scontrol?action=list")
			.forward(request, response);
		} else {
			switch (action) {
			case "list" : view = list(request, response); break;
			case "insert" : view = insert(request, response); break;
			}
		}
	}

	private String list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("students", dao.getAll());
		return "studentInfo.jsp";
	}
	
	private String insert(HttpServletRequest request, HttpServletResponse response) {
		student s = new student();
		try {
			BeanUtils.populate(s, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// db데이터에 새로운 데이터 insert
		dao.insert(s);
		// list메서드를 호출
		return list(request, response);
	}

}
