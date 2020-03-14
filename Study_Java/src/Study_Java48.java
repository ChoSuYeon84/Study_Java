public class Study_Java48 {
	public static void main(String[] args) {
		/*
		 ○ 비정방형(가변길이) 배열을 이용한 별찍기
		 	★★★★★
		 	★★★★
		 	★★★
		 	★★
		 	★
		 */
		
		int[][] star = new int [5][];
		
		for (int i = 0; i < star.length; i++) {
			star[i] = new int [star.length -i];
		}//for
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				star [i][j] = '★';
				System.out.print((char)star[i][j]);
			}//for j
			System.out.println();
		}//for i
		
	}//main()
}//class
