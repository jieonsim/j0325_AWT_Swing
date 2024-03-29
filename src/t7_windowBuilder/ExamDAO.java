package t7_windowBuilder;

import java.sql.*;
import java.util.*;

import t8_insa.*;

public class ExamDAO extends DBConn {

	public ArrayList<ImageInforVO> getImageInforList() {
		ArrayList<ImageInforVO> vos = new ArrayList<ImageInforVO>();
		try {
			sql = "select * from imageInfor order by name";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ImageInforVO vo = new ImageInforVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setImg(rs.getString("img"));
				
				vos.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return vos;
	}
  
}
