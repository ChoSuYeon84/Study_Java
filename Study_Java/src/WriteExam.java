import java.io.FileWriter;
import java.io.Writer;

//문자 출력 스트림 : Writer
//write(int c) 메소드 : 매개 변수로 주어지는 int(4byte)에서 끝 2byte(1개의 문자)만 출력 스트림으로 보냄. (매개 변수가 int 타입이므로 4byte 모두를 보내는 것은 아님)
//한 문자씩 출력하기
public class WriteExam {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\Study_Java\\Git_project\\Study_Java\\test7.txt");	//데이터 도착지를 test7.txt로 하는 문자기반 파일 출력 스트림을 생성
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		//한 문자씩 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();	//출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();	//출력 스트림을 닫음
	}
}
