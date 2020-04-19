import java.util.Scanner;

public class HonGonJa6 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("===========================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("===========================================");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			
			if(selectNo == 1) {
				System.out.print("학생수를 입력하세요 > ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int [studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i+1+"번 학생의 점수 > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}//for
			} else if (selectNo == 3) {
			for (int i = 0; i < scores.length; i++) {
				System.out.println(i+1+"번 학생의 점수 > "+scores[i]);
				}//for
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				for (int j = 0; j < scores.length; j++) {
					if(scores[j] > max ) {
						max = scores[j];
					}//if
				}//for
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					}//for
				double avg = (double)sum/studentNum;
				System.out.println("최고점수 : "+max);
				System.out.println("평균점수  : "+avg);
				
			} else if (selectNo == 5) {
				run = false;
			}//if
		}//while
		scanner.close();
		System.out.println("프로그램 종료");
	}//main()
}//class
