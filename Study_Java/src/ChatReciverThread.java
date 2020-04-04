import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

//받는 Thread : 메세지를 수신(입력) ▶ BufferedReader
public class ChatReciverThread extends Thread {
	private Socket socket;
	public ChatReciverThread(Socket socket) {
		this.socket = socket;
	}

	//Thread의 구현은 반드시 run() 메소드에서 재정의(Override)
	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			InetAddress addr = socket.getInetAddress();
			String name = addr.getHostName();
			
			while(true) {
				String msg = br.readLine();
				if(msg ==null) {
					break;
				}//if
				System.out.println(name+">수신 메세지 : "+msg);
			}//while
			br.close();
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println("ChatReciverThread Exception!!!");
			System.out.println("종료되었습니다.");
			System.exit(0);
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try2
		}//try1
	}//run()
}//class
