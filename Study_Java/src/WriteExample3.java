import java.io.FileOutputStream;
import java.io.OutputStream;

//바이트 출력 스트림 : OutputStream
//write(byte[] b, int off, int len) 메소드 : b[off]부터 len개의 바이트를 출력 스트림으로 보냄
//배열 일부를 출력하기
public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:\\Study_Java\\Git_project\\Study_Java\\test3.db");	//데이터 도착지를 test3.db로 하는 바이트 기반 파일 출력 스트림을 생성
		
		byte[] array = { 10, 20, 30, 40, 50 };
		
		os.write(array, 1, 3);	//배열의 1번 인덱스부터 3개를 출력
		
		os.flush();	//출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();	//출력 버퍼를 닫음
	}//main()
}//class
