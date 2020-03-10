import java.util.Scanner;

public class Study_Java34 {
	public static void main(String[] args) {
		//입력창에서 점수(score)를 입력받은 후, 학점을 출력하는 프로그램 ▶ Scanner(입력), if(학점)
		//Scanner 객체 생성 : new Scanner(); → 키보드로부터 입력 : System.in
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력하세요: ");		//블럭킹상태 : 키보드로부터 입력을 대기하는 상태
			int score = scanner.nextInt();
			System.out.println("입력하신 점수는 "+score+"점 입니다.");
			
			if(score >= 0 && score <= 100) {
				if(score >= 90) {
					System.out.println("당신의 학점은 A학점 입니다.");
				}else if(score >= 80) {
					System.out.println("당신의 학점은 B학점 입니다.");
				}else if(score >= 70) {
					System.out.println("당신의 학점은 C학점 입니다.");
				}else if(score >= 60) {
					System.out.println("당신의 학점은 D학점 입니다.");
				}else {
					System.out.println("당신의 학점은 F학점 입니다.");
				}//if
				break;
			}else {
				System.out.println("점수를 잘못 입력하셨습니다.");
				continue;
			}//if
		}//while
		scanner.close();
	}//main()
}//class
