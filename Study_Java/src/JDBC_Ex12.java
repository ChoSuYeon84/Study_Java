import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Ex12 {
	public static void main(String[] args) {
		//회원번호(num)가 5번인 회원(지선우)을 삭제
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hanul";
			String password = "0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			
			String sql = "delete from tblMember where num = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 5);
			
			int succ = ps.executeUpdate();
			if(succ > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}//if
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
