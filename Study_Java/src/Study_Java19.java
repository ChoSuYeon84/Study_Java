public class Study_Java19 {
	public static void main(String[] args) {
		//1부터 10까지의 누적합(sum)을 구하시오. : for
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("i값 :"+i+", sum값 :"+sum);
		}//for
		System.out.println("누적합: "+sum);
	}//main()
}//class
