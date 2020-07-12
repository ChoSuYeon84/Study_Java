import java.util.Arrays;

public class Exam {
	public static void main(String[] args) {
		//int형 변수를 원소로 갖는 배열 arr1에는 [1, 2, 3, 4]를 저장하고, arr2에는 [8, 7, 6, 5]를 순서대로 저장한뒤,
		//두 배열의 각 자리의 합을 원소로 갖는 길이가 4인 배열 arr3을 생성해보시오.
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {4, 5, 6, 7};			
		int[] arr3 = new int[4];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}//for
		System.out.println("arr3 = " + Arrays.toString(arr3));
	}//main()
}//class
