public class Study_Java49 {
	public static void main(String[] args) {
		//swap(교환) : 기본 데이터 타입(PDT), 배열(Array)
		int a = 10;
		int b = 20;
		System.out.println("교환전 : a = " + a + ", b = " + b);
		
		//a와 b의 값을 교환하여 출력하시오.
		//System.out.println("교환후 : a = " + b + ", b = " + a);
		
		int temp = a;		//기존의 a 값을 저장할 임시변수를 선언하고 a 값을 할당
		a = b;				//변수 a에 변수 b의 값을 재할당
		b = temp;			//변수 b에 변수 temp의 값을 재할당
		System.out.println("교환후 : a = " + a + ", b = " + b);
	}//main()
}//class
