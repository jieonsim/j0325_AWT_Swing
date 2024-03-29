package t8_insa;

import java.sql.*;

// DB 연결이 주 목적인 DAO, 다른 DAO와 연결해 이용
public class DBConn {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;

	public String sql = "";

	public DBConn() {
		String url = "jdbc:mysql://localhost:3306/javaclass";
		String user = "root";
		String password = "1234";
		// 프로젝트 할 때 user는 root, password는 1234로 할 것!
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연동 실패");
		}
	}

	// connClose();
	public void connClose() {
		try {
			conn.close();
		} catch (SQLException e) {
		}
	}

	// pstmtClose();
	public void pstmtClose() {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
		}
	}

	// rsClose()
	public void rsClose() {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
		}
	}
}
