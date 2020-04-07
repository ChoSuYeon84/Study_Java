import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonTestMain01 {
	public static void main(String[] args) {
		JsonDTO dto1 = new JsonDTO(10, "홍길동", 33, "광주시 서구 농성동", "010-1111-1111");
		JsonDTO dto2 = new JsonDTO(20, "박문수", 30, "광주시 남구 봉선동", "010-2222-2222");
		JsonDTO dto3 = new JsonDTO(30, "이순신", 50, "광주시 북구 용봉동", "010-3333-3333");
		
		JSONArray array = new JSONArray();		//Json Array 객체 생성
		JSONObject object = new JSONObject();	//Json Object  객체 생성
		
		object.put("member", dto1);	//DTO 객체를 JSON Object 객체로 변환
		array.add(object);			//JSON Object를 JSON Array에 등록
		
		object.put("member", dto2);
		array.add(object);
		
		object.put("member", dto3);
		array.add(object);
		
		String json = array.toString();	//JSON 형식의 내용을 화면에 출력
		System.out.println(json);
		
		//결과를 화면에 출력
		for (int i = 0; i < array.size(); i++) {
			JSONObject obj = array.getJSONObject(i);
			obj = obj.getJSONObject("member");
			JsonDTO dto = (JsonDTO) JSONObject.toBean(obj, JsonDTO.class);
			System.out.println(dto.getNum()+"\t");
			System.out.println(dto.getName()+"\t");
			System.out.println(dto.getAge()+"\t");
			System.out.println(dto.getAddr()+"\t");
			System.out.println(dto.getTel()+"\n");
		}//for
		
		//결과를 파일로 저장
		try {
			FileWriter fw = new FileWriter("member.json");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(json);
			bw.flush();
			bw.close();
			fw.close();
			System.out.println("member.json 파일이 생성되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class

/*
○ 외부 API(Library) 등록하는 방법1
- 등록하고자 하는 API(라이브러리)를 복사한다.
- JRE 설치된 폴더\lib\ext(C:\Program Files\Java\jre1.8.0_241\lib\ext) 붙여넣기
- Eclipse 재시작(File MenuBar >Restart)
- 모든 프로젝트에서 해당 API를 활용할 수 있다.
- Export 할 때 별도로 해당 라이브러리를 함께 내보내기 해야한다. 

○ 외부 API(Library) 등록하는 방법2 (권장)
	- 해당 프로젝트 > 마오 > Build Path > Configure Build Path
	- 상단 탭 : Libraries > Add External JARs... > 해당 라이브러리를 선택 > Apply and Close
	- 해당 프로젝트에서만 API를 활용할 수 있다. 
	- Export 할 때 해당 라이브러리도 같이 내보내기 된다. 
	
★ 방법1과 방법2를 혼용할 시 오류가 발생할 수 있다 : 둘 중 하나를 삭제 
*/