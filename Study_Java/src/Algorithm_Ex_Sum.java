import java.util.Arrays;

public class Algorithm_Ex_Sum {
	public static void main(String[] args) {
		//정수형 배열(arr[])원소값의 누적합(sum)을 구하여 출력
		
		int[] arr = {3,2,4,1,5};	//정수형 배열(arr[])을 선언하고 값을 할당: 초기화
		int sum = 0;				//누적합이 저장될 정수형 변수(sum)를 선언하고 값을 할당 : 초기화
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr [i];
		}//for
		System.out.println("배열 arr[] 의 원소값 : "+Arrays.toString(arr));
		System.out.println("배열 arr[] 의 누적값 : "+sum);
	}//main()
}//class
