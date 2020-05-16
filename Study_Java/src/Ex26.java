import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] scores = new int [3];
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i+1+"번째 점수를 입력하세요 ▶ ");
			scores[i] = scanner.nextInt();
		}//for
		scanner.close();
		
		System.out.println("첫번째 점수 :"+scores[0]+", 두번째 점수 :"+scores[1]+", 세번째 점수 :"+scores[2]);
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = (double) sum / 3;
		
		int max = 0;
		for (int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}//if
		}//for
		
		int min = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(min >= scores[i]) {
				min = scores[i];
			}//if
		}//for
		
		System.out.println("총 점수 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최고값 : "+max);
		System.out.println("최소값 : "+min);
	}//main()
}//class
