import java.io.FileReader;
import java.io.Reader;

//문자 입력 스트림 : Reader
//read() 메소드 : 입력 스트림으로부터 1개의 문자(2byte)를 읽고 int(4byte)타입으로 리턴 (리턴된 4byte 중 끝에 있는 2byte에 문자 데이터가 들어있음)
//한 문자씩 읽기
public class ReadExam {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("D:\\Study_Java\\Git_project\\Study_Java\\test7.txt");
		while(true) {
			int data = reader.read();	//한 문자씩 읽기
			if(data == -1) {			//파일 끝에 도달했을 경우
				break;
			}
			System.out.println((char)data);
		}
		reader.close();		//입력 스트림을 닫음
	}
}
