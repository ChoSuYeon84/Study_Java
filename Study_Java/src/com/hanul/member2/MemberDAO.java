package com.hanul.member2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;	// 연결객체
	private PreparedStatement ps;	//전송객체
	private ResultSet rs;		//결과객체
	
	//DB 접속 메소드
	public Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hanul";
			String password= "0000";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		return conn;
	}//getConnect()
	
	//회원정보 저장
	public int memberInsert(MemberDTO dto) {
		int succ = 0;
		try {
			conn = getConnect();
			String sql = "insert into tblMember values(?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}//try
		return succ;
	}//memberInsert()
	
	//회원정보 삭제
	public int memberDelete(int num) {
		int succ = 0;
		try {
			conn = getConnect();
			String sql = "delete from tblMember where num = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			succ = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}//if
		return succ;
	}//memberDelete()
	
	//회원정보 수정
	public int memberUpdate(MemberDTO dto) {
		int succ = 0;
		try {
			conn = getConnect();
			String sql = "update tblMember set name = ?, age = ?, addr = ?, tel =? where num = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getTel());
			ps.setInt(5, dto.getNum());
			
			succ = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return succ;
	}//memberUpdate()
	
	//전체회원목록 검색 1
	public void memberSerchAll() {
		try {
			conn = getConnect();
			String sql = "select * from tblMember order by num asc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			//rs의 값을 바로 출력
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num+"\t"+name+"\t"+age+"\t"+addr+"\t"+tel);
			}//while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
	}//memberSerchAll()
	
	//전체회원 목록을 검색2
	public void memberSerchAll(ArrayList<MemberDTO> list) {
		try {
			conn = getConnect();
			String sql = "select * from tblMember order by num asc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			//rs의 값을 MemberDTO 객체로 생성한 후 list에 저장
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}//while
			
			//list의 내용을 출력
			if(list.size() == 0) {
				System.out.println("검색된 결과가 없습니다.");
			} else {
				for (MemberDTO dto : list) {
					System.out.print(dto.getNum()+"\t");
					System.out.print(dto.getName()+"\t");
					System.out.print(dto.getAge()+"\t");
					System.out.print(dto.getAddr()+"\t");
					System.out.print(dto.getTel()+"\n");
				}//for
			}//if
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}//try
	}//memberSerchAll()
	
	//전체회원 목록을 검색 3
	public ArrayList<MemberDTO> memberSerchAll3(ArrayList<MemberDTO> list) {
		try {
			conn = getConnect();
			String sql = "select * from tblMember order by num asc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			//rs의 값을 MemberDTO 객체로 생성한 후 list에 저장
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}//try
		return list;
	}//memberSerchAll3();
	
	//조건검색(이름)
	public void memberSerchName(String searchName) {
		try {
			conn = getConnect();
			String sql = "select * from tblMember where name like ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchName+"%");
			rs = ps.executeQuery();
			
			//rs의 값을 바로 출력
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(num+"\t"+name+"\t"+age+"\t"+addr+"\t"+tel);
			}//while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
	}//memberSerchName()
	
	//조건검색2(이름)
	public void memberSearchName(ArrayList<MemberDTO> list, String searchName) {
		try {
			conn = getConnect();
			String sql = "select * from tblMember where name like ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchName+"%");
			rs = ps.executeQuery();
			
			//rs의 값을 MemberDTO 객체로 생성한 후 list에 저장
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}//while
			
			//list의 내용을 출력
			if(list.size() == 0) {
				System.out.println("검색된 결과가 없습니다.");
			} else {
				for (MemberDTO dto : list) {
					System.out.print(dto.getNum()+"\t");
					System.out.print(dto.getName()+"\t");
					System.out.print(dto.getAge()+"\t");
					System.out.print(dto.getAddr()+"\t");
					System.out.print(dto.getTel()+"\n");
				}//for
			}//if
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//memberSearchName()
	
	//조건검색3(이름)
	public ArrayList<MemberDTO> memberSearchName3(ArrayList<MemberDTO> list, String searchName) {
		try {
			conn = getConnect();
			String sql = "select * from tblMember where name like ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchName+"%");
			rs = ps.executeQuery();
			
			//rs의 값을 MemberDTO 객체로 생성한 후 list에 저장
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return list;
	}//memberSearchName3()
	
	//DB Close
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//dbClose()
}//class
