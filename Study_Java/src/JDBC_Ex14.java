import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Ex14 {
	public static void main(String[] args) {
		//전체회원 목록을 출력하시오 : select ▶ executeQurery() ▶ ResultSet
		//단, 회원번호의 오름차순으로 출력하시오 : order by
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hanul";
			String password = "0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			
			String sql = "select * from tblMember order by num asc";	//매개변수가 없다
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
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
