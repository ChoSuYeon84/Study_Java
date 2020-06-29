import java.io.FileReader;
import java.io.Reader;

//문자 입력 스트림 : Reader
//read(char[] cbuf) 메소드 : 입력 스트림으로부터 매개값으로 조어진 문자 배열의 길이만큼 문자를 읽고 배열에 저장함. 
//읽은 문자수를 리턴. 실제로 읽은 문자 수가 배열의 길이보다 적을 경우 읽은 수 만큼만 리턴
//배열 길이만큼 읽기
public class ReadExam2 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("D:\\Study_Java\\Git_project\\Study_Java\\test8.txt");	//데이터 출발지를 test8.txt로 하는 문자기반 파일 입력 스트림을 생성
		
		char[] buffer = new char[100];		//길이 100인 배열 생성
		
		while(true) {
			int readCharNum = reader.read(buffer);	//배열 길이만큼 읽기
			if(readCharNum == -1) {	//파일 끝에 도달했을 경우
				break;
			}
			//읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		
		}
		reader.close();		//입력 스트림을 닫음
	}
}
