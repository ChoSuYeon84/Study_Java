import java.io.FileWriter;
import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);	//키보드로 입력받기 위해 scanner 클래스를 준비.
		FileWriter fw = new FileWriter("D:\\Study_Java\\Git_project\\Study_Java\\src\\data4.txt");
		
		String str;
		while(!(str = scanner.nextLine()).equals("")) {
			fw.write(str+"\r\n");
		}
		fw.close();
	}//main()
}//class
