import java.io.FileInputStream;

public class Ex20 {
	//data1.txt 파일의 내용은 "File Read Sample 입니다."로, Ex19의 출력 결과 확인시 영문은 잘 나왔지만 한글은 깨져 있는 것을 확인 할 수 있다.
	//read()는 1바이트 씩 읽으므로 2바이트를 차지하는 한글은 잘라서 읽고 바로 출력했기 때문이다.
	//한글도 잘 나오도록 Ex19를 수정해보자
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:\\Study_Java\\Git_project\\Study_Java\\src\\data1.txt");
		int ch;
		byte[] bt = new byte[1024];			//1024 크기의 배열 bt를 선언
		
		int i = 0;							//배열의 첨자로 사용할 i를 선언
		while((ch=fis.read()) != -1) {	
			bt[i] = (byte)ch;				//읽어온 1바이트를 배열에 저장한다.
			i++;							//배열의 첨자 i를 1씩 증가시킨다.
		}//while
		
		System.out.print(new String(bt));	//byte 형식의 배열을 String 형식으로 출력한다.
		fis.close();
	}//main()
}//class
