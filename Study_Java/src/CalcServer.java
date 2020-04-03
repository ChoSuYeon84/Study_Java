import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.hanul.calc.CalcDAO;
import com.hanul.calc.CalcDTO;

public class CalcServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			//① ServerSocket 생성 : Port 번호 할당
			ss = new ServerSocket(9999);
			System.out.println("서버가 구동중입니다.");
			
			//① Socket 생성 
			socket = ss.accept();
			
			//⑤ 클라이언트가 보낸 객체(DTO)를 수신받기 위한 준비단계
			//InputStream→ InputStreamReader→ BufferedReader (x)
			//InputStream ▶ ObjectInputStream : 객체입력
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			CalcDTO dto = (CalcDTO) ois.readObject();	//객체의 역직렬화
			
			//⑥ 수신받은 DTO 객체의 멤버변수를 이용하여 사칙연산 수행하는 메소드 호출
			CalcDAO dao = new CalcDAO();
			 int result = dao.getResult(dto);
			 
			 //⑦ 결과를 서버측 화면에 출력
			 System.out.println("첫 번째 정수 : "+dto.getNum1());
			 System.out.println("두 번째 정수 : "+dto.getNum2());
			 System.out.println("연산자 : "+dto.getOpcode());
			 System.out.println("결과 : "+result);
			 
			 //⑧ 결과값을 클라이언트에게 송신(출력)
			//OutputStream ▶PrintWriter
			 OutputStream os = socket.getOutputStream();
			 PrintWriter pw = new PrintWriter(os);
			 pw.println(result);
			 pw.flush();
			 pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try2
		}//try 1
	}//main()
}//class