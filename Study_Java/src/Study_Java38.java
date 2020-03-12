import java.util.Random;
import java.util.Scanner;

public class Study_Java38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	//입력을 받기 위한 객체 생성
		Random random = new Random();				//무작위로 숫자를 할당하기 위한 객체생성
		
		while(true) {
			System.out.print("게임시작 : 1, 게임종료 : -1을 입력하세요 ▶");
			int userlnput = Integer.parseInt(scanner.nextLine()) ;
			
			//1, -1 이외의 숫자가 입력되면 오류메세지를 출력하고 재입력
			if(userlnput!=1 && userlnput!=-1) {
				System.out.println("숫자를 잘못 입력하셨습니다!");
				continue;
			}//if
			
			//-1이 입력되면 게임을 종료(while 문을 탈출)
			if(userlnput == -1) {
				System.out.println("게임을 종료합니다!");
				break;
			}//if
			
			//게임을 시작 : 사용자의 숫자를 무작위로 할당
			System.out.println("주사위 게임을 시작합니다^^");
			System.out.println("사용자가 주사위를 굴립니다.");
			System.out.print("Enter Key를 입력하세요!");
			scanner.nextLine();//블럭킹 메소드 : 사용자로부터 입력을 대기하고, 입력이 되면 입력값을 처리
			int userNumber = random.nextInt(6)+1; //6을 입력하면 숫자는 0부터 시작하기때문에 0~5까지 나옴 ▶ 따라서 0이나왔을때 1을 더해주면 1이되니까! 값에 7을 안넣는 이유임 만약 7을 넣으면 0~6까지 나온다. 주사위는 0이 나올수 없음.
			System.out.println("사용자의 숫자는"+userNumber+"입니다.\n");
			
			//컴퓨터의 숫자를 무작위로 할당
			System.out.println("컴퓨터가 주사위를 굴립니다.");
			System.out.print("Enter Key를 입력하세요!");
			scanner.nextLine();
			int comNumber = random.nextInt(6)+1;
			System.out.println("컴퓨터의 숫자는"+comNumber+"입니다.\n");
			
			//사용자의 숫자(userNumber)와 컴퓨터의 숫자(comNumber)를 비교해서 결과를 출력
			if(userNumber > comNumber) {
				System.out.println("Result : You Win!!!");
			}else if(userNumber < comNumber) {	
				System.out.println("Result : You Lose!!!");
			}else {
				System.out.println("Result : Draw!!");
			}//if
		}//while
		scanner.close();
	}//main
}//class