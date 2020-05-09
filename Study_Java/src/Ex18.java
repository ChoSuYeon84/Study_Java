import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		//문자열을 바꿔주는 replace(), 일부 문자열을 추출하는 substring(), 문자열을 분리하는 split()
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		scanner.close();
		
		System.out.println("입력 문자열 : "+str);
		
		//입력 문자열의 공백을 $로 바꾼다.
		String strRep = str.replace(" ","$");
		System.out.println("바꾼 문자열 : "+strRep);
		
		//입력 문자열의 세번째부터 여덟번째 문자를 추출한다.
		String strSub = str.substring(3,8);
		System.out.println("일부 문자열 : "+strSub);
		
		//입력 문자열을 공백으로 분리한다.
		String[] strAry = str.split(" ");
		for (int i = 0; i < strAry.length; i++) {
			System.out.println("분리한 문자열"+i+" : "+strAry[i]);
		}//for
	}//main()
}//class
