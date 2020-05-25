//문자열길이(length())
//문자열의 길이(문자의 수)를 리턴함.(공백포함)
public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "5406241230123";
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}//if
	}//main()
}//class
