import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.26", 9999);
			
			//메세지를 입력받아 보내는 작업(송신, 출력) ▶ ChatSenderThread
			Thread st = new ChatSenderThread(socket);
			st.start();
			
			//전송한 메세지를 받는 작업 (수신, 입력) ▶ ChatReciverThread
			Thread rt = new ChatReciverThread(socket);
			rt.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Chat Client Exception!!!");
		}//try
	}//main()
}//class
