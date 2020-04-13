import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Ex03 {
	public static void main(String[] args) {
		//번호(num)가 5번인 회원(지선우)을 삭제하시오 : delete
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user ="hanul";
			String password ="0000";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			
			Statement st = conn.createStatement();
			
			String sql ="delete from tblMember where num = 5";
			
			int succ = st.executeUpdate(sql);
			System.out.println("succ : "+succ);
			
			if(succ > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}//if
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main()
}//class
