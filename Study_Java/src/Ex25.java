import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex25 {
	public static void main(String[] args) throws Exception {
		//읽기 및 쓰기 모드로 파일을 연다.
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("D:\\Study_Java\\Git_project\\Study_Java\\src\\data5.txt");
		
		int ch;
		
		while((ch = fis.read()) != -1) {	//파일의 끝까지 1바이트씩 읽는다.
			fos.write((byte)ch);			//읽어온 1바이트를  파일에 쓴다
		}//while
		
		System.out.println("복사완료");
		fos.close();	//파일을 닫는다
		fis.close();	//파일을 닫는다
	}//main()
}//class
