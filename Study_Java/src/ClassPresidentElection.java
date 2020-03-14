import java.util.Random;
import java.util.Scanner;

public class ClassPresidentElection {
	public static void main(String[] args) {
		/*학생 목록이 저장될 배열 생성 : String[] student = new String[16];
		  1번~ 16번 학생의 이름을 입력받아 배열에 저장 : Scanner
		  #1번 학생의 이름을 입력 : OOO
		  #2번 학생의 이름을 입력 : OOO
		  #3번 학생의 이름을 입력 : OOO
		  입력이 완료되면 입력한 학생의 목록을 출력한다.
		  #입력을 완료하셨습니다!
		  #1번 : OOO
		  #2번 : OOO
		  #16번 : OOO
		  
		  반장선출을 위해 Enter Key를 입력받아, 무작위로 할당된 정수값을 기준으로 해당번호에 해당되는 학생을 반장으로 선출한다.
		  #반장을 선출합니다. Enter Key를 입력하세요!
		  #X번 학생 OOO님이 선출되었습니다.
		  축하합니다!*/
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
					
		String[] student = new String[16];
		for (int i = 0; i < student.length; i++) {
			System.out.print((i+1)+"번 학생의 이름을 입력하세요 :");
			student[i] = scanner.nextLine();
			}//for
		
		System.out.println("입력을 완료하셨습니다!");
		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i+1)+"번 :"+student[i]);
		}//for
		
		System.out.println("반장을 선출합니다. Enter Key를 입력하세요!");
		scanner.nextLine();
		int studentNumber = random.nextInt(15)+1;
		System.out.println(studentNumber+"번 학생 "+student[studentNumber-1]+" 님이 반장으로 선출되었습니다.");
		System.out.println("축하합니다!");
		scanner.close();
	}//main()
}//class
