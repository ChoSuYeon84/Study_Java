import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.hanul.study.MemberDTO;



public class MemberCopyMain {
	public static void main(String[] args) {
		//member.txt 파일에서 라인단위(readLine())로 내용을 읽어서
		//membercopy2.txt 파일을 생성 ▶ member.txt → membercopy2.txt 파일 복사
		//라인단위의 각 항목은 TAB으로 구분되어 있다 ▶ split("/t");
		//MemberDTO 타입을 갖는 ArrayList<> 생성 ▶ ArrayList<memberDTO> list;	
		
		try {
			//파일 입력을 위한 준비단계 : FileReader, BufferedReader
			String inputPath = "D:\\Study_Java\\Git_project\\Study_Java\\member.txt";
			FileReader fr = new FileReader(inputPath);
			BufferedReader br = new BufferedReader(fr);
			
			//열려진 파일의 내용을 읽어(readLine())서 저장할 변수를 초기화
			//TAB으로 split()한 후, MemberDTO 객체 생성
			//ArrayList<MemberDTO> list 객체 생성
			//파일을 읽고 ArrayList<> 저장(add())	
			String line = null;
			MemberDTO dto = null;
			ArrayList<MemberDTO> list = new ArrayList<>();
			
			while((line = br.readLine()) != null) {
				String[] sp = line.split("\t");
				
				dto= new MemberDTO();
				dto.setNum(Integer.parseInt(sp[0]));
				dto.setName(sp[1]);
				dto.setAge(Integer.parseInt(sp[2]));
				dto.setAddr(sp[3]);
				dto.setTel(sp[4]);
				
				list.add(dto);
			}//while
			
			//파일 출력을 위한 준비단계 : FileWriter, BufferedWriter
			String outputPath ="D:\\Study_Java\\Git_project\\Study_Java\\membercopy2.txt";	
			FileWriter fw = new FileWriter(outputPath);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//ArrayList<>의 저장된 내용을 파일에 출력
			int index = 0;	//현재 라인을 저장할 변수
			for (MemberDTO dto2 : list) {
				if (index < list.size()-1) {	//현재라인의 인덱스와 전체라인의 인덱스 비교 : 줄바꿈
					String line2 = dto2.getNum() +"\t"+dto2.getName()+"\t"+dto2.getAge()+"\t"+dto2.getAddr()+"\t"+dto2.getTel()+"\n";
					index++;
					bw.write(line2);
					bw.flush();
				}else {	//마지막 라인 : 줄바꿈을 하지 않는다.
					String line2 = dto2.getNum() +"\t"+dto2.getName()+"\t"+dto2.getAge()+"\t"+dto2.getAddr()+"\t"+dto2.getTel();
					index++;
					bw.write(line2);
					bw.flush();
				}//if
			}//for
			
			//스트림 종료
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
