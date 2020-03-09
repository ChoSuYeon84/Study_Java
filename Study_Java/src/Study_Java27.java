public class Study_Java27 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {		//for i : 1부터 5까지 반복
			for(int j = 1; j <= i; j++) {	//for j : 1부터 j까지 반복
				System.out.println("i값 : "+i+", j값 : "+j);
			}//for j
		}//for i		
				
		/* 별찍기
		 ★
		 ★★
		 ★★★
		 ★★★★
		 ★★★★★
		*/
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("★");
			}//for j
			System.out.println();
		}//for i
	}//main()
}//class
