//키로 사용할 객체 - hashCode()와 equals()재정의
public class Student2 {
	public int sno;
	public String name;
	
	public Student2(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {	//학번과 이름이 같다면 true를 리턴
		if(obj instanceof Student2) {
			Student2 student2 = (Student2) obj;
			return (sno == student2.sno) && (name.equals(student2.name));
		} else {
			return false;
		}//if
	} //equals

	public int hashCode() {	//학번과 이름이 같다면 동일한 값을 리턴
		return sno + name.hashCode();
	}
}
