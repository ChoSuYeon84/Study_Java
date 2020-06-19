import java.io.FileOutputStream;
import java.io.OutputStream;

//바이트 출력 스트림 : OutputStream
//write(byte[] b) 메소드 : 매개변수로 주어진 배열의 모든 바이트를 출력 스트림으로 보냄
//배열 전체를 출력하기
public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:\\Study_Java\\Git_project\\Study_Java\\test2.db");	//데이터 도착지를 test2.db로 하는 바이트 기반 파일 출력 스트림을 생성
		
		byte[] array = { 10, 20, 30 };
		
		os.write(array);	//배열의 모든 바이트를 출력
		
		os.flush();	//출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();	//출력 버퍼를 닫음
	}//main()
}//class
