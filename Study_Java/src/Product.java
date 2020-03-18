public class Product {	//Class : 특성(상태정보)과 동작(행위정보)이 기술(구현)
	//멤버변수(필드) 선언 : 상태정보 ▶ DTO Class, VO Class
		int num;
		String name;
		
		//멤버메소드 정의 : 행위정보 ▶ DAO Class
		public void display() {
			System.out.println("num : "+num);
			System.out.println("name : "+name);
		}//display()

	}//class