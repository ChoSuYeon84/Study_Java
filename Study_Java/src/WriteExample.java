import java.io.FileOutputStream;
import java.io.OutputStream;

//바이트 출력 스트림 : OutputStream
//write(int b) 메소드 : 매개변수로 주어지는 int(4byte)에서 끝 1byte만 출력스트림으로 보냄
//1byte씩 출력하기
public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:\\Study_Java\\Git_project\\Study_Java\\test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		//1byte씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();	//출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); //출력 스트림을 닫음
	}
}
