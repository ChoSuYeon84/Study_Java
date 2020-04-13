import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Ex05 {
	public static void main(String[] args) {
		//전체 회원의 목록을 검색 : Select → executeQuery() → ResultSet(결과객체)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user="hanul";
			String password="0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			Statement st = conn.createStatement();
			String sql = "select * from tblMember";
			
			//Statement 객체에 SQL 문장을 전송 ▶ ResultSet 객체
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {	//next() : 결과객체를 가르키는  포인터가 있으면 true 그렇지 않으면 false
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num+"\t"+name+"\t"+age+"\t"+addr+"\t"+tel);
			}//while
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
