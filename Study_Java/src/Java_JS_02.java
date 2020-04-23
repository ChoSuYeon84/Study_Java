public class Java_JS_02 {
	public static void main(String[] args) {
		//변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다. 
		//삼항연산자를 두번 사용하여 작성하시오.
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num == 0 ? 0 : "음수"));
	}//main()
}//class
