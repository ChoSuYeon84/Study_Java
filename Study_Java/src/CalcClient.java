import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import com.hanul.calc.CalcDTO;

public class CalcClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			//② Socket 생성
			socket = new Socket("192.168.0.22", 9999);
			
			//③ num1, num2, opcode를 입력받는다.
			Scanner scanner = new Scanner(System.in);
			System.out.println("첫번째 정수를 입력하세요 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.println("두번째 정수를 입력하세요 : ");
			int num2 = Integer.parseInt(scanner.nextLine());
			System.out.println("연산자(+,-,*,/,%)를 입력하세요 : ");
			String opcode = scanner.nextLine();
			scanner.close();
			
			//④ CaclDTO 객체를 생성하고 서버로 송신(출력)
			//OutputStream  ▶ [OutputStreamWriter→ BufferedWriter] ▶PrintWriter(x)
			//OutputStream  ▶ [ObjectOutputStream : 객체출력
			CalcDTO dto = new CalcDTO(num1, num2, opcode);
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(dto);
			
			//⑨ 서버에서 전달된 결과값을 수신(입력) 받아 출력
			//InputStream→ InputStreamReader→ BufferedReader
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			int result = Integer.parseInt(br.readLine());
			System.out.println("첫 번째 정수 : "+num1);
			System.out.println("두 번째 정수 : "+num2);
			System.out.println("연산자 : "+opcode);
			System.out.println("결과 : "+result);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try2
		}//try1
	}//main()
}//class