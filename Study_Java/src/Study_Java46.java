public class Study_Java46 {
	public static void main(String[] args) {
		//가변길이(비정방형) 배열 : 행은 고정, 열이 가변길이
		int[][] arr = new int[2][];
		arr[0] = new int[2];	//1번째 행에 2개 만들어주세요.
		arr[1] = new int[3];	//2번째 행에 2개 만들어주세요.
		
		for (int i = 0; i < arr.length; i++) {			//arr.length : 2
			for (int j = 0; j < arr[i].length; j++) {	//arr[i].length : 2, 3
				arr[i][j] = 10;
				System.out.println("arr["+i+"]["+j+"]의 값 : "+arr[i][j]+"\t");
			}//for j
			System.out.println();
		}//for i
	}//main()
}//class
