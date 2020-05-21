//문자추출(charAt())
//매개값으로 주어진 인덱스의 문자를 리턴
//주민등록번호에서 남자와 여자를 구분하는 방법
public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}//main()
}//class
