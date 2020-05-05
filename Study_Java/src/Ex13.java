import java.util.Scanner;
//0~9 중에서 입력한 숫자만큼 별포를 출력하는 프로그램을 작성해보자
//예를들어 5914를 입력하면 각줄에 별을 5개, 9개, 1개, 4개 출력한다.
public class Ex13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 여러개 입력하세요 : ");
		String str= scanner.nextLine();
		scanner.close();
		
		int i = 0;
		char ch=str.charAt(i);
		while(true) {
			int star = (int)ch-48;
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			if(++i > str.length()-1) {
				break;
			}
			ch = str.charAt(i);
			System.out.println();
		}
		
	}//main()
}//class
