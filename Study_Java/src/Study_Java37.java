import java.util.Scanner;

public class Study_Java37 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kor = 0, eng = 0, mat = 0;
		
		while(true) {
			System.out.print("국어점수를 입력하세요 : ");
			kor = Integer.parseInt(scanner.nextLine());
			if(kor < 0 || kor > 100) {
				System.out.println("국어 점수를 잘못 입력하셨습니다.");
				continue;
			}break;
		}//while
		
		while(true) {
			System.out.print("영어점수를 입력하세요 : ");
			eng = Integer.parseInt(scanner.nextLine());
			if(eng < 0 || eng > 100) {
				System.out.println("영어 점수를 잘못 입력하셨습니다.");
				continue;
			}break;
		}//while
		
		while(true) {
			System.out.print("수학점수를 입력하세요 : ");
			mat = Integer.parseInt(scanner.nextLine());
			if(mat < 0 || mat > 100) {
				System.out.println("수학 점수를 잘못 입력하셨습니다.");
				continue;
			}break;
		}//while
		scanner.close();
		
		int sum = kor + eng + mat;
		double evg = sum / 3.0;
		char grade =0;
		
		 if(evg >= 90) {
			 grade='A';
		 }else if(evg >= 80) {
			 grade='B';
		 }else if(evg >= 70) {
			 grade='C';
		 }else if(evg >= 60) {
			 grade='D';
		 }else {
			 grade='F';
		 }//if
		 
		 System.out.println("총점 : "+sum);
		 System.out.println("평균 : "+evg);
		 System.out.println("학점 : "+grade + "학점");
		 
	}//main
}//class
