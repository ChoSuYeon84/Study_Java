import java.util.Arrays;

public class Test_String {
	//@를 기준으로 문자열을 분리하고 리턴하는 메소드(strSplit()) 호출
	//출력하는 메소드(display()) 호출
	//제품명의 내림차순으로 정렬하는 메소드(nameDescSort()) 호출
	//출력하는 메소드 (display()) 호출
		public static void main(String[] args) {
			String str = "복숭아@포도@귤@수박@오렌지";		
			String[] strs= strSplit(str);
			display(strs);
			nameDescSort(strs);
	}//main()
		
	//문자열을 분리하고 리턴하는 메소드 정의
	public static String[] strSplit(String str) {
		String[] strs = str.split("@");
		return strs;
	}//strSplit()
	
	//출력메소드 정의
	public static void display(String[] strs) {
		System.out.println(Arrays.toString(strs));
	}//display()
	
	//제품명의 내림차순 정렬하는 메소드 정의
	public static void nameDescSort(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			for (int j =i+1; j < strs.length; j++) {
				if(strs[i].compareTo(strs[j]) < 0) {
					String temp = strs[i];
					strs[i] = strs[j];
					strs[j] = temp;
				}//if
			}//for j
		}//for i
	}//nameDescSort()
}//class
