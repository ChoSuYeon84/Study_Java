//1부터 100까지 구하는데 4의배수를 구하지 않고 합계를 구하시오.
public class Exam3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if(i % 4 == 0) {
				sum = sum;
			}else {
				sum += i;
			}//if
		}//for
		System.out.println("4의 배수를 제외한 1부터 100까지의 합계수 : "+sum);
	}//main
}//class
