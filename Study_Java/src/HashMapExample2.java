import java.util.*;

//학번과 이름이 동일한 경우 같은 키로 인식
public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student2, Integer> map = new HashMap<Student2, Integer>();
		
		map.put(new Student2(1, "고길동"), 95);
		map.put(new Student2(1, "고길동"), 95);	//학번과 이름이 동일한 student를 키로 저장
		
		System.out.println("총 Entry 수 : " +  map.size());	//저장된 총 Map.Entry 수 얻기
	}//main()	
}//class
	
