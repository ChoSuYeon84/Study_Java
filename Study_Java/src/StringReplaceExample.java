//문자열 대치(replace())
//첫번째 매개값인 문자열을 찾아 두 번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴
public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
