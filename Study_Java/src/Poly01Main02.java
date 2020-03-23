import com.hanul.poly01.Animal;
import com.hanul.poly01.Cat;
import com.hanul.poly01.Dog;

public class Poly01Main02 {
	public static void main(String[] args) {
		Dog dog = new Dog();	//일반적인 객체 생성 방법 : A a = new A();
		dog.cry();
		
		Animal animal = new Cat(); //업캐스팅(UpCasting) → 다형성
		animal.cry();			   //부모클래스가 동작을 시키다
		//animal.night();		 //오류발생 : Animal 클래스에는 night() 메소드가 없다.
		
		Cat cat = (Cat)animal;		//다운캐스팅(DownCasting)
		cat.night();
		((Cat)animal).night();
	}//main()
}//class

/*
○ 객체를 생성하는 방법
 	- Dog dog = new Dog();			▶ 일반적인 방식
 	- Animal animal = new Dog();	▶ 업캐스팅(UpCasting) → 다형성
 	
○ 다형성의 전제 조건
 	- 상속관계 : public class 자식클래스(B) extends 부모클래스(A) ▶ B → A
 	- Override 필수 : 자식클래스(B)에서는 부모클래스(A)의 기능(메소드)을 재정의 필수
 	- UpCasting으로 객체를 생성(부모클래스 쪽으로 할당한다) : A a = new B();
 */
