import java.util.Random;
import java.util.Scanner;

public class Study_Java39 {
	public static void main(String[] args) {
		/*사용자가 무조건 승리하는 주사위 게임
		-컴퓨터의 숫자를 파악한 후, 컴퓨터의 숫자보다 더 높은 수를 임의적으로 리턴한다.*/
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
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
			
			int comNumber = random.nextInt(6)+1;
			int userNumber; 
			
			//게임을 시작 : 컴퓨터의 숫자를 무작위로 할당
			System.out.println("주사위 게임을 시작합니다^^");
			System.out.println("컴퓨터가 주사위를 굴립니다.");
			System.out.print("Enter Key를 입력하세요!");
			scanner.nextLine();
			System.out.println("컴퓨터의 숫자는"+comNumber+"입니다.\n");
			
			//컴퓨터의 숫자를 받은뒤, 사용자의 숫자를 컴퓨터의 숫자보다 많은 수 중에서 랜덤하게 생성			
			if(comNumber == 1) {
				userNumber = random.nextInt(5)+2;
			}else if(comNumber == 2){
				userNumber = random.nextInt(4)+3;
			}else if(comNumber == 3) {
				userNumber = random.nextInt(3)+4;
			}else if (comNumber == 4) {
				userNumber = random.nextInt(2)+5;
			}else {
				userNumber = random.nextInt(1)+6;
			}//if
			
			//사용자의 숫자를 무작위로 할당
			System.out.println("사용자가 주사위를 굴립니다.");
			System.out.print("Enter Key를 입력하세요!");
			scanner.nextLine();
			System.out.println("사용자의 숫자는"+userNumber+"입니다.\n");
						
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