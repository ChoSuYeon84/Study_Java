//객체 해시코드(hashCode())
//객체 해시코드란 객체를 식별하는 하나의 정수값을 말한다.
//우선 hashCode() 메소드를 실행해서 리턴된 해시코드 값이 같은지를 보고, 해시코드 값이 다르면 다른객체로 판단, 같으면 equals() 메소드로 비교
//hashCode() 메소드가 true가 나와도 equals()의 리턴값이 다르면 다른 객체가 된다.
public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {		//equals() 메소드를 재정의 해서 number 필드값이 같으면 true를 리턴하도록 함
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}//if
		}//if
		return false;
	}//equals()
	
	@Override
	public int hashCode() {
		return number;
	}
}//class
