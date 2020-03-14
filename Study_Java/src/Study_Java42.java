public class Study_Java42 {
	public static void main(String[] args) {
		/*
		★ 배열(Array):객체(Object)로 취급 ▶ 참조형(Reference)자료구조
			-동일한 기억공간을 메모리에 연속적으로 생성하는 구조 : 리스트(선형)구조
		 	-같은 타입을 갖는 변수들의 집합
		 	-배열을 선언하고 생성한 후, 나중에 내용물(원소값)을 채우는 방식→ Array01
		 	-배열을 선언하는 동시에 배열안의 내용물(원소값)을 같이 채우는 방식 → Array02 (배열의 초기화)
		 	-배열의 접근은 반드시 요소번호(index)로 접근하며, index는 0부터 시작
		 	-배열의 크기(길이): 배열명.length
		 	-배열의 마지막 원소의 index 값 : 배열의 크기 -1 ▶ arr.length -1
		 */
	
		//정수 3개를 저장할 배열(arr)을 선언하고
		//동시에 모든 요소에 10을 할당하시오 ▶ 초기화
		
		int[] arr = {10, 10, 10};		//정수형 배열 arr을 선언하고 바로 값을 할당

		//배열(arr)의 모든 요소의 총합(sum)을 구하여 출력하시오.
		//int sum = arr[0] + arr[1] + arr[2];
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];				//sum= sum+arr[i];
		}//if
		
		System.out.println("배열 arr의 총합 : "+sum);
		System.out.println("배열 arr의 크기(길이): "+arr.length);
		
	}//main()
}//class
