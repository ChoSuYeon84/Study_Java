import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatSenderThread extends Thread {
	private Socket socket;
	private String name;
	public MultiChatSenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.println(name);
			pw.flush();
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String msg = scanner.nextLine();
				if(msg.equalsIgnoreCase("bye")) {
					System.out.println("종료되었습니다.");
					pw.close();
					scanner.close();
					System.exit(0);
					break;
				}//if
				pw.println(msg);
				pw.flush();
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try2
		}//try1
	}//run()

}//class