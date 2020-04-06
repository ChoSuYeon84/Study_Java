import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(9999);
			System.out.println("서버가 구동중입니다.");
			while(true) {
				Socket socket= ss.accept();
				Thread pt= new MultiChatPersonThread(socket);
				pt.start();
			}//while
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		
	}//main()
}//class