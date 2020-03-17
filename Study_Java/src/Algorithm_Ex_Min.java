import java.util.Arrays;

public class Algorithm_Ex_Min {
	public static void main(String[] args) {
		//정수형 배열(arr[])의 원소값 중에서 최소값(min)을 구하여 출력
		int[] arr = {3,2,4,1,5};	//정수형 배열(arr[])을 선언하고 값을 할당: 초기화
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}//if
		}//for
		
		System.out.println("배열 arr[]의 원소값 : "+Arrays.toString(arr));
		System.out.println("배열 arr[]의 최소값 : "+min);
//=======================================================
		//참고 ▼
		Arrays.sort(arr);		//배열(arr[])을 오름차순으로 정렬
		System.out.println("배열의 원소값 : "+Arrays.toString(arr));
		System.out.println("원소의 최소값 : "+arr[0]);		
	}//main()
}//class
