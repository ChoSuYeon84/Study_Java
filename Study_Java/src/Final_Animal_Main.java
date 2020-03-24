import com.hanul.finalanimal.Final_Action;
import com.hanul.finalanimal.Final_Cat;
import com.hanul.finalanimal.Final_Dog;
import com.hanul.finalanimal.Final_Duck;
import com.hanul.finalanimal.Final_Tiger;

public class Final_Animal_Main {
	public static void main(String[] args) {
		Final_Dog dog = new Final_Dog();
		Final_Cat cat = new Final_Cat();
		Final_Tiger tiger = new Final_Tiger();
		Final_Duck duck = new Final_Duck();
		
		dog.name = "강아지";
		cat.name = "야옹이";
		tiger.name = "호랑이";
		duck.name = "오리";
		
		Final_Action action = new Final_Action();
		action.action(dog);
		System.out.println("====================");
		action.action(cat);
		System.out.println("====================");
		action.action(tiger);
		System.out.println("====================");
		action.action(duck);
		System.out.println("====================");
	}//main()
}//class
