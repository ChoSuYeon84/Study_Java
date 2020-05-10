import java.io.FileInputStream;

public class Ex19 {
	//FileInputStream 클래스를 사용하면 파일의 내용을 1바이트씩 읽어올 수 있다.
	//1바이트씩 읽어오는 메소드는 read()이다.
	public static void main(String[] args) throws Exception {	//FileInputStream의 예외를 처리하기 위해 throws Exception 문을 추가한다.
		FileInputStream fis = new FileInputStream("D:\\Study_Java\\Git_project\\Study_Java\\src\\data1.txt");	//FileInputStream을 준비하고 파일을 연다.
		
		int ch;
		
		while((ch = fis.read()) != -1) {	//파일에서 문자 하나를 read()로 읽어온다. 파일의 끝일 경우 -1을 반환한다.
			System.out.print((char)ch);		//문자를 출력한다.
		}//while
		fis.close();					//파일의 모든 내용을 처리한 후 파일을 닫는다.
	}//main()
}//class

