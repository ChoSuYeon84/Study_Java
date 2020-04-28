import java.util.Scanner;

public class Book3Main {
	public static void menuPrint() {
		System.out.println("\n======도서관리======");
		System.out.println("도서정보등록 : I");
		System.out.println("도서목록보기 : A");
		System.out.println("도서제목검색 : S");
		System.out.println("도서정보삭제 : D");
		System.out.println("도서정보수정 : U");
		System.out.println("도서주문하기 : O");
		System.out.println("도서관리종료 : E");
		System.out.println("====================\n");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			menuPrint();
			System.out.print("메뉴를 입력하세요 ▶ ");
			String menu = scanner.nextLine();
			Book3Input input = new Book3Input(scanner);
			
			if(menu.equalsIgnoreCase("i")) {
				input.bookInsertInput();
			}else if (menu.equalsIgnoreCase("a")) {
				input.bookSearchAllInput();
			}else if (menu.equalsIgnoreCase("s")) {
				input.bookSearchTitleInput();
			}else if (menu.equalsIgnoreCase("d")) {
				input.bookDeleteInput();
			}else if (menu.equalsIgnoreCase("u")) {
				input.bookUpdateInput();
			}else if (menu.equalsIgnoreCase("o")) {
				input.bookOrderInput();
			}else if(menu.equalsIgnoreCase("e")) {
				System.err.print("정말 종료하시겠습니까(y/n)? ▶ ");
				String isExit = scanner.nextLine();
				if(isExit.equalsIgnoreCase("y")) {
					System.out.println("도서관리 프로그램을 종료합니다.");
					Book3DAO dao = new Book3DAO();
					dao.dbClose();
					System.exit(0);
					break;
				} else if(isExit.equalsIgnoreCase("n")) {
					System.out.println("취소하셨습니다.");
					continue;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}//if
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}//while()
		scanner.close();
	}//main()
	
}//class