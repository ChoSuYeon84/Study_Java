import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//① JDBC Driver 정적로딩 : ojdbc6.jar
//② JDBC API import → 자동생성

public class JDBC_Ex02 {
	public static void main(String[] args) {
		try {
			//③ JDBC Driver Loading(동적로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//④ Connection 객체(연결객체)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hanul";
			String password = "0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			
			//⑤ Statement 전송객체
			Statement st = conn.createStatement();
			
			//⑥ SQL 문장 작성
			String sql ="insert into tblMember values(5, '지선우' , 40, '서울시 강남구 청담동', '010-5555-5555')";
			
			//⑦ Statement 객체에 SQL 문장을 전송
			int succ = st.executeUpdate(sql);
			if(succ > 0) {
				System.out.println("삽입성공");
			} else {
				System.out.println("삽입실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
