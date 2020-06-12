import java.util.HashSet;
import java.util.Set;

//Member1 객체를 중복 없이 저장하는 HashSet
public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member1> set = new HashSet<Member1>();
		
		set.add(new Member1("홍길동", 30));
		set.add(new Member1("홍길동", 30));	//인스턴스는 다르지만 내부데이터가 동일하므로 객체 1개만 저장
		
		System.out.println("총 객체수 : "+ set.size());	//저장된 객체 수 얻기
	}//main()
}//class
