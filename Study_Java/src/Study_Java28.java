public class Study_Java28 {
	public static void main(String[] args) {
		/*별찍기2
		 ★★★★★
		 ★★★★
		 ★★★
		 ★★
		 ★
		*/
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}//for j
			System.out.println();
		}//for i
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("★");
			}//for j
			System.out.println();
		}//for i	
	}//main()
}//class
