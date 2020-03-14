public class Study_Java41 {
	public static void main(String[] args) {
		//정수를 저장할 배열(arr)을 선언하고
		//저장할 배열의 크기(길이)를 3으로 생성하고
		//모든 요소에 10을 할당하고 출력하시오.
		
		int[] arr;				//정수형 배열 arr을 선언 : int arr[]도 사용함
		arr = new int[3];		//배열의 생성
		//int[] arr= new int[3]	//배열의 선언 및 생성
		
		arr[0] = 10;			//배열(arr)의 0번지(index)에 10을 할당
		arr[1] = 20;			//배열(arr)의 1번지(index)에 10을 할당
		arr[2] = 30;			//배열(arr)의 2번지(index)에 10을 할당
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr);	//배열(arr)이 참조하는 메모리의 해쉬코드 값을 출력(16진법) 이렇게 arr을 바로찍으면 안됌!
		
	}//main()
}//class
