package ch09;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class studentDAO {
	// DB 통신 
	Connection conn = null;
	PreparedStatement pstmt;

	// h2 Driver
	final String JDBC_DRIVER = "org.h2.Driver";
	// SQL localhost 주소
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/jwbookdb";

	// db 열기
	public void open() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, "jwbook", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// db 닫기
	public void close() {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// student클래스에서 학생 정보 전부 가져오기
	public List<student> getAll() {
		// db 열기
		open();
		List<student> students = new ArrayList<>();

		try {
			// prepareStatement("") ""에 들어갈 내용은 DB에 전달될 명령어
			pstmt = conn.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				student s = new student();
				s.setId(s.getId());
				s.setUsername(s.getUsername());
				s.setUniv(s.getUniv());
				s.setBirth(s.getBirth());
				s.setEmail(s.getEmail());

				students.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return students;
	}

	public void insert(student s) {
		open();
		String sql = "INSERT INTO student(username, univ, birth, email) values(?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getUsername());
			pstmt.setString(2, s.getUniv());
			pstmt.setDate(3, s.getBirth());
			pstmt.setString(4, s.getEmail());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
