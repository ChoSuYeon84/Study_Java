import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Ex13 {
	public static void main(String[] args) {
		//번호(num)가 1번인 회원(홍길동)의 나이(age)를 31로 변경,
		//전화번호(tel)를 010-9876-1234로 변경
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hanul";
			String password = "0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			
			String sql = "update tblMember set age = ?, tel = ? where num = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 31);
			ps.setString(2, "010-9876-1234");
			ps.setInt(3, 1);
			
			int succ = ps.executeUpdate();
			if(succ > 0) {
				System.out.println("갱신성공");
			} else {
				System.out.println("갱신실패");
			}//if
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		
	}//main()
}//class
