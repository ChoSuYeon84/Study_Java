public class CircleMain {
	public static void main(String[] args) {
		//문제2) 문제1에서 작성한 원 클래스를 실행하는 프로그램을 작성하되, 반지름이 5인 원 객체를 생성하여 다음의 출력결과가 나오도록 작성 하시오.
		//[출력결과] 반지름 : 5 / 원의 넓이 : 78.5
		Circle circle = new Circle(5);
		System.out.println("반지름 : "+circle.getRadius());
		System.out.println("원의 넓이 : "+circle.getArea());
		
	}//main()
}//class