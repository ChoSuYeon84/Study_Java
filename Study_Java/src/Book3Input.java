import java.sql.ResultSet;
//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Book3Input {
	private Scanner scanner;
	public Book3Input(Scanner scanner) {
		this.scanner = scanner;
	}//Book3Input()
	
	//도서 정보 등록 서브화면
	public void bookInsertInput() {
		System.out.println("\n도서정보 등록화면 입니다.");
		System.out.print("등록할 도서의 번호를 입력하세요 ▶ ");
		int num = Integer.parseInt(scanner.nextLine());
		Book3DAO dao = new Book3DAO();
		ResultSet rs = dao.checkNum(num);
		
		try {
			if(rs.next() == true) { //검색결과가 있다.
				System.out.println(num+"번 도서는 이미 등록되어 있습니다!");
				System.out.println("다른 번호를 입력해 주시기 바랍니다.");
			} else {	//검색결과가 없다 : 사용가능 → 추가정보 입력받는다.
				System.out.print("제목을 입력하세요 ▶ ");
				String title = scanner.nextLine();
				System.out.print("출판사를 입력하세요 ▶ ");
				String company = scanner.nextLine();
				System.out.print("저자를 입력하세요 ▶ ");
				String name = scanner.nextLine();
				System.out.print("단가를 입력하세요 ▶ ");
				int cost = Integer.parseInt(scanner.nextLine());
				//System.out.println(num+"\t"+title+"\t"+company+"\t"+name+"\t"+cost);
				
				Book3DTO dto = new Book3DTO(num, title, company, name, cost);
				int succ = dao.insertBook(dto);
				if(succ > 0) {
					System.out.println(num+"번 도서정보가 등록되었습니다.");
				} else {
					System.out.println(num+"번 도서정보가 등록 실패되었습니다.");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookInsertInput() Exception!!!");
		}
	}//bookInsertInput()
	
	//도서목록보기
	public void bookSearchAllInput() {
		System.out.println("\n도서 목록 보기 화면 입니다.");
		ArrayList<Book3DTO> list = new ArrayList<>();
		Book3DAO dao = new Book3DAO();
		list = dao.selectBookAll(list);
		dao.display(list);
	}//bookSearchAllInput()
	
	//도서제목검색
	public void bookSearchTitleInput() {
		System.out.println("\n도서 제목 검색 화면 입니다.");
		System.out.print("검색할 도서의 제목을 입력하세요 ▶ ");
		String searchTitle = scanner.nextLine();
		ArrayList<Book3DTO> list = new ArrayList<>();
		Book3DAO dao = new Book3DAO();
		list = dao.selectBookTitle(list, searchTitle);
		dao.display(list);
	}//bookSearchTitleInput()
	
	
	//도서정보 삭제
	public void bookDeleteInput() {
		System.out.println("\n도서 정보 삭제 화면 입니다.");
		System.out.print("삭제할 도서의 번호를 입력하세요 ▶ ");	
		int num = Integer.parseInt(scanner.nextLine());
		Book3DAO dao = new Book3DAO();
		ResultSet rs = dao.checkNum(num);
		
		try {
			if(rs.next() != true) {
				System.out.println(num+"번 도서는 등록되어 있지 않습니다.");
			} else {
				int succ = dao.deleteBook(num);
				if(succ > 0) {
					System.out.println(num+"번 도서 정보가 삭제 되었습니다.");
				}else {
					System.out.println(num+"번 도서 정보가 삭제실패 되었습니다.");
				}//if
			}//if
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookDeleteInput() Exception!!!");
		}
	}//bookDeleteInput()
	
	//도서정보 수정
	public void bookUpdateInput() {
		System.out.println("\n도서 정보 수정 화면 입니다.");
		System.out.print("수정할 도서의 번호를 입력하세요 ▶ ");	
		int num = Integer.parseInt(scanner.nextLine());
		Book3DAO dao = new Book3DAO();
		ResultSet rs = dao.checkNum(num);
		
		try {
			if(rs.next() != true) {
				System.out.println(num+"번 도서는 등록되어 있지 않습니다.");
			}else {
				System.out.print("수정할 도서의 제목을 입력하세요 ▶ ");
				String title = scanner.nextLine();
				System.out.print("수정할 도서의 출판사를 입력하세요 ▶ ");
				String company = scanner.nextLine();
				System.out.print("수정할 도서의 저자를 입력하세요 ▶ ");
				String name = scanner.nextLine();
				System.out.print("수정할 도서의 단가를 입력하세요 ▶ ");
				int cost = Integer.parseInt(scanner.nextLine());
				
				Book3DTO dto = new Book3DTO(num, title, company, name, cost);
				int succ = dao.updateBook(dto);
				
				if(succ > 0) {
					System.out.println(num+"번 도서정보가 수정되었습니다.");
				} else {
					System.out.println(num+"번 도서정보가 수정 실패되었습니다.");
				}//if
			}//if
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookUpdateInput() Exception!!!");	
		}
	}//bookUpdateInput()
	
	//도서주문
	public void bookOrderInput() {
		System.out.println("\n도서 주문 화면 입니다.");
		System.out.print("주문할 도서의 번호를 입력하세요 ▶ ");	
		int num = Integer.parseInt(scanner.nextLine());
		Book3DAO dao = new Book3DAO();
		ResultSet rs = dao.checkNum(num);
		
		try {
			if(rs.next() != true) {
				System.out.println("입력하신 "+num+"번 도서는 등록되어 있지 않습니다.");
			} else {
				System.out.print("주문할 수량을 입력하세요 ▶ ");
				int cnt = Integer.parseInt(scanner.nextLine());
				
				dao.orderBook(rs, cnt);
				
				/*String title = rs.getString("title");
				int cost = rs.getInt("cost");
				int price = cnt * cost;
				
				DecimalFormat df = new DecimalFormat("￦#,##0");
				String msg = "\n주문하신 도서명은 "+ title + "이고, 단가는 "+df.format(cost)+"원 이며, 주문 수량은 "+cnt+"권 입니다.";
				msg+="\n총 주문금액은 "+df.format(price) +"원 입니다.";
				
				System.out.println(msg);*/
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookOrderInput() Exception!!!");
		}
	}//bookOrderInput()
	
	
}//class