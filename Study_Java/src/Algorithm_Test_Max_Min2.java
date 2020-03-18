import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_Test_Max_Min2 {
	//정수형 배열의 크기를 입력받은 후, 배열 생성(arr[]) ▶ Scanner, 배열 생성
	//arr[] 배열의 크기(길이)에 맞게 임의의 정수를 입력받아 배열에 할당 ▶ for
	//maxMachine() : 배열(arr[])의 최대값(max)을 구하여 출력
	//minMachine() : 배열(arr[])의 최소값(min)을 구하여 출력
	//arr[] 배열의 원소값, 최대값, 최소값 출력	
	public static void main(String[] args) {
		
		Algorithm_Test_Max_Min2 atmm2= new Algorithm_Test_Max_Min2();
		int arr[] = atmm2.input();
		System.out.println("최대값 : "+atmm2.maxMachine(arr));
		System.out.println("최소값 : "+atmm2.minMachine(arr));
		
	}//main()
	
	public int[] input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 수의 개수를 입력하세요 : ");
		int cnt = Integer.parseInt(scanner.nextLine());
		int [] arr = new int [cnt];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"번째 정수를 입력하세요 : ");
			arr[i] = Integer.parseInt(scanner.nextLine());
		}//for
		scanner.close();
		
		System.out.println("입력을 완료하였습니다.");
		System.out.println("입력하신 수 : "+Arrays.toString(arr));
		
		return arr;
	}//input()

	public int maxMachine(int[] arr) {
		int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr [i];
				}//if
			}//for
		return max;
	}//maxMachine()
	
	public int minMachine(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}//if
		}//for
		return min;
	}//minMachine()	
	
}//class
