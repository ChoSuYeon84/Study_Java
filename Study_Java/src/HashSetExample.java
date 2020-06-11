import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//String 객체를 중복 없이 저장하는 HashSet
//HashSet은 객체들을 순서없이 저장하고 동일한 객체는 중복 저장하지 않는다.
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");		//"Java" 는 한번만 저장됨
		set.add("MyBATIS");
		
		int size = set.size();	//저장된 객체수 얻기
		System.out.println("총 객체수 : "+size);
		
		Iterator<String> iterator = set.iterator();	//반복자 얻기
		while(iterator.hasNext()) {				//객체수 만큼 루핑
			String element = iterator.next();	//1개의 객체를 가져옴
			System.out.println("\t" + element);
		}//while
		
		set.remove("JDBC");	//1개의 객체삭제
		set.remove("MyBATIS");	//1개의 객체 삭제
		
		System.out.println("총 객체수 : "+ set.size());
		
		iterator = set.iterator();	//반복자 얻기
		for(String element : set) {	//객체수 만큼 루핑
			System.out.println("\t" + element);
		}
		
		set.clear();	//모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}//if
		
	}//main()
}//class
