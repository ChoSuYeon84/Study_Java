import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Book3DAO {
	private Connection conn = SingleConn.getConn();
	private PreparedStatement ps;
	private ResultSet rs;
	
	//도서번호 조회
	public ResultSet checkNum(int num) {
		conn = SingleConn.getConn();
		String sql = "select * from tblBook where num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("checkNum() Exception!!!");
		}
		return rs;
	}//checkNum()
	
	//도서정보 등록
	public int insertBook(Book3DTO dto) {
		int succ = 0;
		String sql = "insert into tblBook values(?, ?, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getCompany());
			ps.setString(4, dto.getName());
			ps.setInt(5, dto.getCost());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insertBook(0 Exception!!!");
		}
		return succ;
	}//insertBook()
	
	//전체목록보기
	public ArrayList<Book3DTO> selectBookAll(ArrayList<Book3DTO> list) {
		String sql = "select * from tblBook order by num asc";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String company = rs.getString("company");
				String name = rs.getString("name");
				int cost = rs.getInt("cost");
				
				Book3DTO dto = new Book3DTO(num, title, company, name, cost);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("selectBookAll() Exception!!!");
		}
		return list;
	}//selectBookAll()
	
	//출력메소드
	public void display(ArrayList<Book3DTO> list) {
		if(list.size() == 0) {
			System.out.println("검색된 결과가 없습니다.");
		}else {
			for (Book3DTO dto : list) {
				System.out.print(dto.getNum() + "\t");
				System.out.print(dto.getTitle() + "\t");
				System.out.print(dto.getCompany() + "\t");
				System.out.print(dto.getName() + "\t");
				System.out.print(dto.getCost() + "\n");
			}//for
		}//if
	}//display()
	
	//제목검색메소드
	public ArrayList<Book3DTO> selectBookTitle(ArrayList<Book3DTO> list, String searchTitle) {
		String sql = "select * from tblBook where upper(title) like upper(?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + searchTitle + "%");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String company = rs.getString("company");
				String name = rs.getString("name");
				int cost = rs.getInt("cost");
				
				Book3DTO dto = new Book3DTO(num, title, company, name, cost);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("selectBookTitle() Exception!!!");
		}
		return list;
	}//selectBookTitle()
	
	//도서정보 삭제
	public int deleteBook(int num) {
		int succ = 0;
		String sql = "delete from tblBook where num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			succ = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("deleteBook() Exception!!!");
		}
		return succ;
	}//deleteBook()
	
	//도서정보 수정
	public int updateBook(Book3DTO dto) {
		int succ = 0;
		String sql = "update tblBook set title = ?, company = ?, name = ?, cost = ? where num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getCompany());
			ps.setString(3, dto.getName());
			ps.setInt(4, dto.getCost());
			ps.setInt(5, dto.getNum());
			succ = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("updateBook() Exception!!!");
		}
		return succ;
	}//updateBook()
	
	//도서주문
	public void orderBook(ResultSet rs, int cnt) {
		try {
			
			String title = rs.getString("title");
			int cost = rs.getInt("cost");
			int price = cnt * cost;
			
			DecimalFormat df = new DecimalFormat("￦#,##0");
			String msg = "\n주문하신 도서명은 "+ title + "이고, 단가는 "+df.format(cost)+"원 이며, 주문 수량은 "+cnt+"권 입니다.";
			msg+="\n총 주문금액은 "+df.format(price) +"원 입니다.";
			
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("orderBook() Exception!!!");
		}
	}//orderBook()
	
	//DB Close
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("dbClose() Exception!!!");
		}//try
	}//dbClose()
}//class
