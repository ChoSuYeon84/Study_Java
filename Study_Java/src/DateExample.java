import java.text.SimpleDateFormat;
import java.util.Date;
//날짜를 표현하는 Date 클래스
//Date 객체의 toString() 메소드는 영문으로 된 날짜를 리턴하기 때문에 원하는 날짜 형식의 문자열을 얻고 싶다면 SimpleDateFormat 클래스와 함께 사용하는 것이 좋다.
public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1); //Sat May 30 19:52:33 KST 2020
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);	//2020년 05월 30일 07시 52분 33초
	}
}
