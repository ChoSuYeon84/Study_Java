import java.util.List;
//현수의 컴퓨터가 바이러스에 걸려 영어단어가 뛰어쓰기와 대소문자가 혼합되어 표현된다. 
//예를 들면 아름다운 이란 뜻을 가지고 있는 beautiful 단어가 “bE au T I fu L” 과 같이 컴퓨터에 표시되고 있다. 
//위와 같이 에러로 표시되는 영어단어를 원래의 표현대로 공백을 제거하고 소문자화 시켜 출력하는 프로그램을 작성하세요.
public class Exam2 {
	public static void main(String[] args) {
		String str = "bE au T I fu L";
		String str2 = str.replaceAll(" ", "");
		System.out.println(str2.toLowerCase());
	}//main()
}//class
