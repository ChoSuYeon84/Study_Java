import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//보내는 Thread : 메세지를 송신(출력) ▶ PrintWriter
public class ChatSenderThread extends Thread {	//Thread Class 상속
	private Socket socket;
	public ChatSenderThread(Socket socket) {
		this.socket = socket;
	}	

	//Thread의 구현은 반드시 run() 메소드에서 재정의(Override)
	@Override
		public void run() {
		try {
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			
			Scanner scanner = new Scanner(System.in);
			 while(true) {
					System.out.print("전송할 메세지를 입력하세요 : ");
					String msg = scanner.nextLine();
					if(msg.equalsIgnoreCase("bye")) {
						System.out.println("종료되었습니다.");
						System.exit(0);
						break;
					}//if
					pw.println(msg);
					pw.flush();
			 }//while
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ChatSenderThread Execption!!");
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try2
		}//try1
	}//run()
}//class
