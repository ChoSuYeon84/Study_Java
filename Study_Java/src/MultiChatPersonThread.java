import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
/*
- 접속된 다수의 클라이언트에서 동작되는 쓰레드
- 접속된 모든 클라이언트의 접속정보를 저장하고, 
  접속된 클라이언트에게 메세지를 전송(송신,출력)할 수 있도록 
  클라이언트의 목록을 저장할 무한배열을 생성하여 동작
 - MultiChatServer Class의 main() 메소드와 같이 동작 : static
 */
public class MultiChatPersonThread extends Thread{
	static ArrayList<PrintWriter> list = new ArrayList<>();
	private Socket socket;
	private PrintWriter pw;
	public MultiChatPersonThread(Socket socket) {
		this.socket = socket;
		try {
			OutputStream os = socket.getOutputStream();
			pw = new PrintWriter(os);
			list.add(pw);
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//MultiChatPersonThread()
	
	@Override
	public void run() {
		String name = null;
		InetAddress addr= socket.getInetAddress();
		String comName = addr.getHostName();
		try {
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//클라이언트에서 가장 먼저 입력된 메세지(대화명)를 출력
			//접속된 다른 클라이언트 화면에 출력 : sendAll()
			name = br.readLine();
			sendAll("#"+name +"("+comName+ ")님이 입장하셨습니다!");
			//#홍길동(302-xx)님이 입장하셨습니다.
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					break;
				}//if
				sendAll(name +"("+comName+ ") : "+msg);
				//홍길동(302-xx) : 안녕
			}//while
		} catch (Exception e) {
			//e.printStackTrace();
		} finally {
			try {
				list.remove(pw);
				sendAll("#"+name +"("+comName+ ")님이 퇴장하셨습니다!");
				//#홍길동(302-xx)님이 퇴장하셨습니다.
			} catch (Exception e) {
				e.printStackTrace();
			}//try2
		}//try1
	}//run()
	
	public void sendAll(String msg) {
		for (PrintWriter pw : list) {
			pw.println(msg);
			pw.flush();
		}//for
	}//sendAll;
	
}//class