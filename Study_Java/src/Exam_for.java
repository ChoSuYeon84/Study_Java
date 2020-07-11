public class Exam_for {
	public static void main(String[] args) {
		//다음 배열의 3번째 항목부터 7번째 항목까지의 값을 모두 더해서 출력하는 프로그램 작성
		int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int sum = 0;
		for (int i = 2; i < 7; i++) {
			sum += arr[i];
		}//for
		System.out.println(sum);
	}//main()
}//for
