import java.io.FileWriter;
import java.io.Writer;

//문자 출력 스트림 : Writer
//write(char[] cbuf) 메소드 : 매개값으로 주어진 char[] 배열의 모든 문자를 출력 스트림으로 보냄
//배열 전체를 출력하기
public class WriteExam2 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\Study_Java\\Git_project\\Study_Java\\test8.txt");	//데이터 도착지를 test8.txt로 하는 문자기반 파일 출력 스트림을 생성
		
		char[] array = {'A', 'B', 'C'};

		writer.write(array);	//배열의 모든 문자를 출력		
		
		writer.flush();	//출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();	//출력 스트림을 닫음
	}
}
