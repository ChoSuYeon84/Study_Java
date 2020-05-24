//문자열 찾기(indexOf())
//매개값으로 주어진 문자열이 시작되는 인덱스를 리턴.
//만약 주어진 문자열이 포함되어 있지 않으면 -1을 리턴한다.
public class StringIndexOfExample {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		int location = str.indexOf("프로그래밍");
		System.out.println(location);	//"자바 프로그래밍" 에서 "프로그래밍" 문자열의 인덱스 위치를 찾아라
		
		if(str.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}//ic
	}//main()
}//class
