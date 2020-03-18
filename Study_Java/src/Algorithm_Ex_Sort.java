import java.util.Arrays;

public class Algorithm_Ex_Sort {
	//정수형 배열(arr[])의 원소값을 오름차순으로 정렬하여 출력 : ascSort()
	//정수형 배열(arr[])의 원소값을 내림차순으로 정렬하여 출력 : descSort()
	public static void main(String[] args) {
		int[] arr = {3,2,4,1,5};	//정수형 배열(arr[])을 선언하고 값을 할당 : 초기화
		System.out.println("배열의 원소값 : "+Arrays.toString(arr));
		Algorithm_Ex_Sort aes = new Algorithm_Ex_Sort();
		System.out.println("오름차순정렬 : "+ Arrays.toString(aes.ascSort(arr)));
		System.out.println("내림차순정렬 : "+ Arrays.toString(aes.descSort(arr)));
	}//main()
	
	//오름차순으로 정렬하는 메소드
	public int[] ascSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {	//i+1 을 기억할것
				if(arr[i] > arr[j]) {	//오름차순 ※부등호 방향 중요!!
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for j		
		}//for i
		return arr;
	}//ascSort()
	
	//내림차순으로 정렬하는 메소드
	public int[] descSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {		//i+1 을 기억할것
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {	//내림차순 ※부등호 방향 중요!!
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for j
		}//for i
		return arr;
	}//descSort()
}//class
