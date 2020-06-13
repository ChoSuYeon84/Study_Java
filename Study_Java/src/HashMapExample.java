import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션으로, 
//객체가 달라도 동등객체라면 같은키로 간주하고 중복저장되지 않도록 하기 위하여 HashMap의 키로 사용할 객체는 hashCode()와 equals()메소드를 재정의해서 동등객체가 될 조건을 정해야 한다.
//동등객체의 조건은 hashCode()의 리턴값이 같아야 하고 equals()메소드가 true를 리턴해야함

//이름을 키로, 점수를 값으로 저장하기
public class HashMapExample {
	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("또치", 85);
		map.put("둘리", 90);
		map.put("도우너", 80);
		map.put("또치", 95); //"또치" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		System.out.println("총 Entry 수 : "+ map.size());	//저장된 총 Entry 수 얻기
		
		//객체 찾기
		System.out.println("\t또치 : "+ map.get("또치"));	//이름(키)으로 점수(값)를 검색
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();	//keySet 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {		//반복해서 키를 얻고 값을 Map에서 얻어냄
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("또치");	//키로 Map.Entry를 제거
		System.out.println("총 Entry 수 : " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	//Map.Entry Set 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {	//반복해서 Map.Entry를 얻고 키와 값을 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();	//모든 Map.Entry 삭제
		System.out.println("총 Entry 수 : " + map.size());
		
	}//main()
}//class
