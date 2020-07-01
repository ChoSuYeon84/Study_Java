import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//입출력관련 API - system.in 필드
//키보드로부터 라인 단위 문자열 얻기
public class GetLineStringFromKeyboard {
	public static void main(String[] args)  throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);	//InputStream을 Reader로 변환하고 다시 BufferedReader를 연결
		
		while(true) {
			System.out.print("입력하세요 : ");
			String lineStr = br.readLine();	//라인단위로 문자열을 읽음
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				break;
			}
			System.out.print("입력된 내용 : "+lineStr);
			System.out.println();
		}
		br.close();
	}
}
