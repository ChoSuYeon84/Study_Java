import java.io.FileInputStream;
import java.io.InputStream;

//바이트 입력 스트림 : InputStream
//read(byte[] b) 메소드 : 입력 스트림으로부터 매개값으로 주어진 배열의 길이만큼 바이트를 읽고 해당 배열에 저장함. 그리고 읽은 바이트 수를 리턴.
//실제로 읽은 바이트 수가 배열의 길이보다 적을 경우, 읽은 수 만큼만 리턴
//1byte씩 읽기
public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:\\Study_Java\\Git_project\\Study_Java\\test2.db"); //데이터 출발지를 test2.db로 하는 바이트 기반 파일 입력 스트림을 생성
		
		byte[] buffer = new byte[100]; 	//길이 100인 배열 생성
		while(true) {
			int readByteNum = is.read(buffer);	//배열 길이만큼 읽기
			if(readByteNum == -1) {
				break;							//파일 끝에 도달했을 경우
			}
			for (int i = 0; i <readByteNum; i++) {
				System.out.println(buffer[i]);	//읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력
			}
		}
		is.close();		//입력 스트림을 닫음
	}
}
