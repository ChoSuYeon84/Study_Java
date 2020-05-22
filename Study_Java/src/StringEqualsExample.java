//문자열 비교(equals())
//String 객체의 문자열만을 비교하고 싶다면 == 연산자 대신에 equals() 메소드를 사용해야 한다.
public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = new String("수달이");
		String str2 = "수달이";
		
		if(str1 == str2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}//if
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}//if
	}//main()
}//class
