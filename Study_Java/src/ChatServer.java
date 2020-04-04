import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		
		try {
			ss = new ServerSocket(9999);
			System.out.println("서버가 구동중입니다.");
			socket = ss.accept();
			
			//전송한 메세지를 받는 작업 (수신, 입력) ▶ ChatReciverThread
			Thread rt = new ChatReciverThread(socket);
			rt.start();
			
			//메세지를 입력받아 보내는 작업(송신, 출력) ▶ ChatSenderThread
			Thread st = new ChatSenderThread(socket);
			st.start();
		} catch (Exception e) {
			e.printStackTrace();	//위의 Try1 구문에서 오류가 발생했을때 익셉션
			System.out.println("Chat Server Exception!!!");
		} finally {
			try {
				ss.close();
			} catch (Exception e) {
				e.printStackTrace();	//종료시 문제가 발생했을때의 익셉션
			}//try2
		}//try1
	}//main()
}//class
