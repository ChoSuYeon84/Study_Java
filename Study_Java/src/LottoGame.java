import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	public static void main(String[] args) {
		//1부터 45의 정수중 무작위로 6개의 번호를 뽑는다.
		Random random = new Random();	//랜덤객체 생성
		int[] lotto = new int[6];		//번호가 저장될 배열 생성
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;	//1~45 범위내의 번호를 할당
			for (int j = 0; j < i; j++) {		//번호 중복검사
				if(lotto[i] == lotto[j]) {
					i = i - 1; //i -= 1;
					break;
				}//if
			}//for j
		}//for i
		
		Arrays.sort(lotto);
		//System.out.println(Arrays.toString(lotto));
		for (int i = 0; i < lotto.length; i++) {
			if(lotto[i] < 10) {
				System.out.print("0"+lotto[i]+"\t");
			}else {
				System.out.print(lotto[i]+"\t");
			}
		}
	}//main()
}//class