import java.util.LinkedList;
import java.util.Queue;

//Queue를 이용한 메시지 큐
//Queue 인터페이스 : FIFO(First In First Out: 먼저 넣은 객체가 먼저 빠져나가는 자료구조)에서 사용
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		//메세지 저장
		messageQueue.offer(new  Message("sendMail", "고길동"));
		messageQueue.offer(new  Message("sendSMS", "홍길동"));
		messageQueue.offer(new  Message("sendKakaotalk", "홍두깨"));
		
		while(!messageQueue.isEmpty()) {	//메시지 큐가 비어있지 않다면
			Message message = messageQueue.poll();	//메시지큐에서 1개의 메시지 꺼냄
			
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			}
		}
	}
}
