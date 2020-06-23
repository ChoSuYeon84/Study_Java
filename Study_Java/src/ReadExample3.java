import java.io.FileInputStream;
import java.io.InputStream;

//바이트 입력 스트림 : InputStream
//read(byte[] b, int off, int len) 메소드 : 입력 스트림으로부터 len개의 바이트만큼 일고, 매개값으로 주어진 바이트 배열 b[off]부터 len개까지 저장
//읽은 바이트 수인 len개를 리턴 -> 실제로 읽은 바이트 수가 len개보다 작을 경우에는 읽은 수 만큼만 리턴
//1byte씩 읽기
public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:\\Study_Java\\Git_project\\Study_Java\\test3.db"); //데이터 출발지를 test3.db로 하는 바이트 기반 파일 입력 스트림을 생성
		
		byte[] buffer = new byte[5]; 	
		
		int readByteNum = is.read(buffer, 2, 3);	//입력 스트림으로부터 3byte를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장
		
		if(readByteNum != -1) {	//읽은 바이트가 있다면
			for(int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]); //배열 전체를 읽고 출력
			}
		}
		is.close();		//입력 스트림을 닫음
	}
}
