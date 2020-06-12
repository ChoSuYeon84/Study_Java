//hashCode()와 equals()메소드 재정의 
public class Member1 {
	public String name;
	public int age;
	
	public Member1 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {	//name 과 age 값이 같으면 true를 리턴
		if(obj instanceof Member1) {
			Member1 member1 = (Member1) obj;
			return member1.name.equals(name) && (member1.age == age);
		} else {
			return false;
		}
	}
	
	public int hashCode() {	//name과 age 값이 같으면 동일한 hashCode를 리턴
		return name.hashCode() + age;	//String의 hashCode()이용
	}
}
