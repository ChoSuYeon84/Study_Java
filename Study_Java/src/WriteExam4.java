import java.io.FileWriter;
import java.io.Writer;

//문자 출력 스트림 : Writer
//write(String str) 메소드 : 문자열 전체를 출력 스트림으로 보냄
//write(String str, int off, int len) 메소드 : 주어진 문자열 off 순번부터 len개 까지의 문자를 보냄
//문자열 출력하기
public class WriteExam4 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\Study_Java\\Git_project\\Study_Java\\test10.txt");	//데이터 도착지를 test10.txt로 하는 문자기반 파일 출력 스트림을 생성
		
		String str = "ABC";

		writer.write(str);	//문자열 전체를 출력		
		
		writer.flush();	//출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();	//출력 스트림을 닫음
	}
}
