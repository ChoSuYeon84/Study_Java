import java.io.FileReader;
import java.io.Reader;

//문자 입력 스트림 : Reader
//read(char[] cbuf, int off, int len) 메소드 : 입력 스트림으로부터 len개의 문자만큼 읽고  매개값으로 조어진 문자 배열에서 cbuf[off]부터 len개까지 저장함. 
//읽은 문자수인 len개를 리턴. 실제로 읽은 문자 수가 len개보다 적을 경우 읽은 수 만큼만 리턴
//지정한 길이만큼 읽기
public class ReadExam3 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("D:\\Study_Java\\Git_project\\Study_Java\\test9.txt");	//데이터 출발지를 test9.txt로 하는 문자기반 파일 입력 스트림을 생성
		
		char[] buffer = new char[5];		
		
		int readCharNum = reader.read(buffer, 2, 3);	//입력 스트림으로부터 3개의 문자를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장
		if(readCharNum != -1) {	//읽은 문자가 있다면	
			//배열 전체를 읽고 출력
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}//for
		}//if
		reader.close();		//입력 스트림을 닫음
	}//main()
}//class
