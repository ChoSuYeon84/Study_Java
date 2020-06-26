import java.io.FileWriter;
import java.io.Writer;

//문자 출력 스트림 : Writer
//write(char[] cbuf, int off, int len) 메소드 : c[off]부터 len개의 문자를 출력 스트림으로 보냄
//배열 일부를 출력하기
public class WriteExam3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\Study_Java\\Git_project\\Study_Java\\test9.txt");	//데이터 도착지를 test9.txt로 하는 문자기반 파일 출력 스트림을 생성
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};

		writer.write(array, 1, 3);	//배열의 1번 인덱스부터 3개를 출력		
		
		writer.flush();	//출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();	//출력 스트림을 닫음
	}
}
