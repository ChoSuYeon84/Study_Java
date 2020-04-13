import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Ex04 {
	public static void main(String[] args) {
		//번호(num)가 1번인 회원(홍길동)의 나이(age)를 31로 변경,
		//전화번호(tel)를 010-9876-1234로 변경
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url= "jdbc:oracle:thin:@192.168.0.22:1521:XE";
			String user = "hanul";
			String password = "0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			
			Statement st = conn.createStatement();
			
			String sql = "update tblMember set age = 31, tel = '010-9876-1234' ";
					sql += " where num = 1";	//두줄로 쓸 때는 where앞 띄어쓰기 주의
			
			int succ = st.executeUpdate(sql);
			
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
