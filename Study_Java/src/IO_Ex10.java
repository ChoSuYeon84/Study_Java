import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO_Ex10 {
	//버퍼를 이용한 이미지 파일 복사(입출력의 효율화)
	//BufferedInputStream, BufferedOutputStream
	//FileInputStream → BufferedInputStream
	//FileOutputStream → BufferedOutputStream
	//버퍼의 기본크기 : 1024byte
	//마지막 버퍼에는 버퍼의 기본크기보다 작은 용량이 버퍼에 남아 있다.
	//마지막 버퍼에 남아 있는 내용을 강제전송(flush())후에 종료(close())
	public static void main(String[] args) {
		try {
			String inputPath = "D:\\Study_Java\\Git_project\\Study_Java\\pic.jpg";		//원본파일
			String outputPath = "D:\\Study_Java\\Git_project\\Study_Java\\copy2.jpg";	//사본파일
			
			FileInputStream fis = new FileInputStream(inputPath);		//원본파일
			FileOutputStream fos = new FileOutputStream(outputPath);	//사본파일
			
			BufferedInputStream bis = new BufferedInputStream(fis);		//입력버퍼
			BufferedOutputStream bos = new BufferedOutputStream(fos);	//출력버퍼
			
			int data, cnt = 0;
			while((data = bis.read()) != -1) {
				cnt++;
				System.err.println(data);
				bos.write(data);
			}//while
			bos.flush();		//마지막 버퍼에 남아 있는 내용을 강제 전송 후 출력
			bos.close();
			bis.close();
			fos.close();
			fis.close();
			System.out.println("접근횟수 : "+cnt);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		
	}//main()
}//class
