public class Ex14 {
	public static void main(String[] args) {
		//구구단의 결과를 2차원 배열에 저장한 다음 출력하는 프로그램 작성
		int[][] gugudan = new int [9][9];
		
		for (int i = 0; i < gugudan.length-1; i++) {
			for (int j = 0; j < gugudan.length; j++) {
				gugudan[i][j] = (i+2) * (j+1);
				if(gugudan[i][j] < 10) {
					System.out.print((i+2)+"X"+(j+1)+"="+"0"+gugudan[i][j]+"\t");
				} else {
					System.out.print((i+2)+"X"+(j+1)+"="+gugudan[i][j]+"\t");
				}//if
			}//for j
			System.out.println();
		}//for i
		
		System.out.println("=======================================================================");
		
		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan.length-1; j++) {
				gugudan[i][j] = (j+2) * (i+1);
				if(gugudan[i][j] < 10) {
					System.out.print((j+2)+"X"+(i+1)+"="+"0"+gugudan[i][j]+"\t");
				} else {
					System.out.print((j+2)+"X"+(i+1)+"="+gugudan[i][j]+"\t");
				}//if
			}//for j
			System.out.println();
		}//for i
	}//main()
}//class
