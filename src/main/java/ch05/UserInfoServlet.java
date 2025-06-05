package ch05;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserInfoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; Charset=UTF-8");
		
		String u_name=request.getParameter("user_name");
		String u_email=request.getParameter("user_email");
		
		PrintWriter out = response.getWriter();
		
		if((u_name == null || u_name.trim().isEmpty()) || (u_email == null || u_email.trim().isEmpty())) {
			out.append("<html><body>");
			out.append("<h3>오류가 발생했습니다. 돌아가시겠습니까?</h3>");
			out.append("<button onclick=\"goBack()\">뒤로가기</button>");
			out.append("<script>");
			out.append("function goBack() {");
			out.append("history.back()");
			out.append("} </script>");
			out.append("</html></body>");
		}
		else {
		out.append("<html><body>");
		out.append("<h3>"+u_name+"님 구독 감사합니다.</h3>");
		out.append("<h3>뉴스레터를"+u_email+"로 보내드렸습니다.</h3>");
		out.append("</body></html>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
