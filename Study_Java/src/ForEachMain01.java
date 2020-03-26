public class ForEachMain01 {
	public static void main(String[] args) {
		int[] score = {95, 80, 83, 72, 91};
		
		//배열의 총합 : for(단순 for문) ▶ 배열(Array) 적용
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}//for
		System.out.println("배열의 총합 : "+sum);
		
		//배열의 총합 : forEach(향상된 for문) ▶ 무한배열(ArrayList) 적용
		sum = 0;
		for (int i : score) {
			sum += i;
		}//forEach
		System.out.println("배열의 총합 : "+sum);
	}//main()
}//class
