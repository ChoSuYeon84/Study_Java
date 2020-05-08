import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		//특정 문자열의 위치를 찾는 indexOf(), lastIndexOf()
		//indexOf(): 찾고자 하는 문자열이 맨 처음 나오는 위치를 돌려준다.
		//lastIndexOf(): 찾고자 하는 문자열이 여러개 나올 경우 마지막에 나오는 위치를 알려준다.
		//만약 찾고자 하는 문자열이 없으면 -1을 반환한다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		scanner.close();
		
		//java공부는 어렵지만, java는 재미있어요. 문자열 입력시
		System.out.println("java 가 나오는 첫번째 위치 : "+str.indexOf("java"));			 //java 가 나오는 첫번째 위치 : 0
		System.out.println("java 가 나오는 마지막 위치 : "+str.lastIndexOf("java"));		//java 가 나오는 마지막 위치 : 14
		
	}//main()
}//class
