import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Ex08 {
	public static void main(String[] args) {
		//이름(name)이 지선우인 회원을 삭제
		//delete from tblMember where name = '지선우';
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user="hanul";
			String password="0000";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("접속성공");
			
			Statement st = conn.createStatement();
			
			String name = "지선우";
			
			//String sql = "delete from tblMember where name = '지선우'";
			//String sql = "delete from tblMember where name = 'name'";▶ 에러남
			String sql = "delete from tblMember where name = '"+name+"'";
			
			int succ = st.executeUpdate(sql);
			System.out.println("succ : "+succ);
			if(succ > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main()
}//class
