package ch05;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());	
		response.setContentType("text/html; charset=UTF-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String user="조성민";

		String registeredId = "tjdals3625".trim();
		String registeredPw = "123456789!".trim();

		Map<String, String> map=new HashMap<String, String>();
		map.put(id, user);

		PrintWriter out = response.getWriter();

		if ((id != null && pw != null) && registeredId.equals(id.trim()) && registeredPw.equals(pw.trim())) {
//			request.setAttribute("userId", id);
//			response.sendRedirect("./login/successLogin.html");
			out.println("<script>");
			out.printf("alert(`환영합니다! "+map.get(id)+"님!`)");
			out.println("</script>");
			out.println("로그인 성공!!");
		} else {
			out.println("<script>");
			out.println("alert('아이디 또는 비밀번호가 일치하지 않습니다.')");
			out.println("location.href='./login/NewLogin.html';");
			out.println("</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
