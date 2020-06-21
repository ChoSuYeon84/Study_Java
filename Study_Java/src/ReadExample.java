import java.io.FileInputStream;
import java.io.InputStream;

//바이트 입력 스트림 : InputStream
//read() 메소드 : 입력 스트림으로부터 1byte를 읽고 int(4byte) 타입으로 리턴함 (리턴된 4byte 중 끝 1byte에만 데이터가 들어가 있음)
//1byte씩 읽기
public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:\\Study_Java\\Git_project\\Study_Java\\test1.db"); //데이터 출발지를 test1.db로 하는 바이트 기반 파일 입력 스트림을 생성
		
		while(true) {
			int data = is.read();	//1byte씩 읽기
			if(data == -1) {	//파일 끝에 도달했을 경우
				break;
			}
			System.out.println(data);
		}
		is.close();		//입력 스트림을 닫음
	}
}
