public class ArraySum {
	public static void main(String[] args) {
		//주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 정방형 배열을 생성해서
		//배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 완성하시오

		int[][] score = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120}, {130, 140, 150}};

		int sum1[] = new int [5];
		int sum2[] = new int [3];
		int sum3 = 0;

			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					sum1[i] += score[i][j];
				}//for j
				sum3 += sum1[i];
			}//for i

			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					sum2[j] += score[i][j];
				}//for j
			}//for i

			for (int i = 0; i < sum2.length; i++) {	
				sum3 += sum2[i];
			}//for i

			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
					if (j == score[i].length - 1) {
						System.out.print(sum1[i]);
					}//if
				}//for j
				System.out.println();

				if (i == (score.length - 1)) {
					for (int j = 0; j < sum2.length; j++) {
						System.out.print(sum2[j]+"\t");
						if (j == (sum2.length - 1)) {
							System.out.print(sum3);
						}//if
					}//for j
				}//if
			}//for i
			
	}//main()
}//class