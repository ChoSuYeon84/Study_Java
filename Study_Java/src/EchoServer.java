import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//EchoServer : 정보를 응답 (Response, 제공)
//TCP: 오류 검사 수행, 속도는 느리지만 신뢰성이 높다.
public class EchoServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		
		try {
			//ServerSocket 생성 : Port 번호 할당
			ss = new ServerSocket(9999);
			System.out.println("서버가 구동중입니다.");
			
			//Socket 생성 : 클라이언트의 정보가 들어있는 Socket
			//socket = new Socket(); ▶ Client 용 Socket
			socket = ss.accept();
			
			//클라이언트가 보낸 메세지를 수신(입력)받기 위한 준비단계
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//클라이언트의 접속정보(IP주소)를 가져오자
			InetAddress addr = socket.getInetAddress();
			String ip = addr.getHostAddress();
			
			//클라이언트가 보낸 메세지를 수신받아 화면에 출력하자
			String msg = br.readLine();
			System.out.println(ip+">클라이언트로 부터 받은 메세지 : "+msg);
			
			//다시 클라이언트에게 받은 메세지를 송신(출력)하자
			OutputStream os = socket.getOutputStream();
			//OutputStreamWriter osw = new OutputStreamWriter(os);
			//BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(os);
			
			pw.println(msg);
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
			}
		}//try1
	}//main()
}//class

/*
 ○ IP Address : 네트워크에 연결되어 있는 터미널(단말기)을 구분하기 위한 고유의 주소
	-CMD > ipconfig
	-IPv4 : 32bit 구성
	-IPv6 : 128bit 구성
	
○ Port Number : 네트워크에 연결되어 있는 터미널의 데이터가 전송되는 통로
	-CMD > netstat /an
	-0~65535 할당
	-0~1023 : 예약된 포트로서 사용할 수 없다.
	
○ Socket : IP Address + Port Number
	- Server Socket : Response(응답) ▶ ServerSocket, Socket
	- Client Socket : Request(요청) ▶ Socket
	- Socket 간의 통신은 JAVA의 IO를 이용해서 통신(IO의 연장선)
 */
 

