package com.hanul.member3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;	//연결
	private PreparedStatement ps;	//전송
	private ResultSet rs;	//결과
	
	//MemberDAO 객체 생성될때 DB접속
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user ="hanul";
			String password = "0000";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB접속 Exception!!");
		}//try
	}//MemberDAO()
	
	//번호 검색 메소드
	public ResultSet checkNum(int num) {
		try {
			String sql = " select * from tblMember where num = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,  num);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("checkNum() Exception!!!");
		}//try
		return rs;
	}//checkNum()
	
	//회원정보 저장 
	public int memberInsert(MemberDTO dto) {
		int succ = 0;
		try {
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
		}//try
		return succ;
	}//memberInsert()
	
	//회원정보 삭제
	public int memberDelete(int num) {
		int succ = 0;
		try {
			String sql = "delete from tblMember where num = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			succ = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}//if
		return succ;
	}//memberDelete()
	
	//회원정보 수정
	public int memberUpdate(MemberDTO dto) {
		int succ = 0;
		try {
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
		}//try
		return succ;
	}//memberUpdate()
	
	//회원정보 검색
	public ArrayList<MemberDTO> memberSearchAll(ArrayList<MemberDTO> list) {
		try {
			String sql = "select * from tblMember"; //매개변수가 없다
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) { //next() : 결과객체를 가르키는 포인터가 있으면 true 그렇지 않으면 false
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
		}//try
		return list;
	}//memberSearchAll()

	//멤버이름 검색
	public ArrayList<MemberDTO> memberSearchName(ArrayList<MemberDTO> list, String searchName) {
		try {
			String sql = "select * from tblMember where name like ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + searchName + "%");
			rs = ps.executeQuery();

			//rs의 값을 MemberDTO 객체로 생성한 후 list에 저장
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				MemberDTO dto = new MemberDTO(num, name, age, addr, tel);
				list.add(dto);
			}// while
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		return list;
	}//memberSearchName()

	public ArrayList<MemberDTO> memberSearchAddr(ArrayList<MemberDTO> list, String searchAddr) {
		try {
			Statement st = conn.createStatement();
			String sql = "select * from tblMember where addr like '%" + searchAddr + "%'";
			rs = st.executeQuery(sql);

			//rs의 값을 MemberDTO 객체로 생성한 후 list에 저장
			while (rs.next()) {
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
		}//try
		return list;
	}//memberSearchAddr()
	
	public ArrayList<MemberDTO> memberSearchTel(ArrayList<MemberDTO> list, String searchTel) {
		try {
			Statement st = conn.createStatement();
			String sql = "select * from tblMember where tel like '%"+searchTel+"%'";
			rs = st.executeQuery(sql);
			
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
		}//try
		return list;
	}//memberSearchTel()
		
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
