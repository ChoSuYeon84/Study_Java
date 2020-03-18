public class ProductMain2 {
	public static void main(String[] args) {
		Product p1 = new Product();	//Product Class를 활용하기 위해 객체 p1을 생성
		p1.num = 1;			//p1의 멤버변수 num에 1을 할당: 참조변수.멤버변수로 접근
		p1.name ="컴퓨터";	//p1의 멤버변수 name에 컴퓨터를 할당: 참조변수.멤버변수로 접근
			
		Product p2 = new Product();
		p2.num = 2;
		p2.name = "노트북";
			
		Product p3 = new Product();
		p3.num = 3;
		p3.name = "프린터";		
			
		System.out.println("객체 p1의 정보");
		p1.display();
		System.out.println("==============");
			
		System.out.println("객체 p2의 정보");
		p2.display();
		System.out.println("==============");
			
		System.out.println("객체 p3의 정보");
		p3.display();
		System.out.println("==============");
		
}//main
}//class