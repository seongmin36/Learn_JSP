package ch05;

import java.io.*;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/NewPractice")
public class NewPractice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewPractice() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String registered_name="조성민";
		String registered_email="tjdals3625@skuniv.ac.kr";
		
		String u_name=request.getParameter("user_name");
		String u_email=request.getParameter("user_email");
		
		PrintWriter out = response.getWriter();
		
		LocalDateTime now = LocalDateTime.now();
		ArrayList<T> Time=new ArrayList<T>();
		Time.add(now.getYear());
		
		if((u_name == null || u_name.trim().isEmpty()) || (u_email == null || u_email.trim().isEmpty())) {
			out.append("<html><body>");
			out.append("<h3>오류가 발생했습니다. 이전 페이지로 돌아가시겠습니까?</h3>");
			out.append("<button onclick=\"goBack()\">돌아가기</button>");
			out.append("<script> function goBack() {");
			out.append("history.back()");
			out.append("} </script>");
			out.append("</body></html>");
		}
		else if(u_name.equals(registered_name) && (u_email.equals(registered_email)) ){
			out.append("<html><body>");
			out.append("<h3>"+u_name+"님 환영합니다!</h3>");
			out.append("<h3>뉴스레터를 "+u_email+"로 보내드렸습니다.</h3>");
			out.append("<h3>보낸 시각 : "+now.getYear()+"년 "++"</h3>");
			out.append("</body></html>");
		}
		else {
			out.append("<html><script>");
			out.append("alert(`"+u_name+"님은 등록되지 않은 사용자입니다.`);");
			out.append("history.back();");
			out.append("</script></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
