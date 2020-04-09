public class Circle {
	//문제1) 원 클래스(Circle)를 선언하시오. 단, 반드시 반지름을 파라미터(매개변수)로 받는 생성자를 선언하시오. 원의 넓이를 구하는 기능은 반지름을 이용하여 넓이값을 리턴하도록 작성하시오.
	//[클래스명] Circle, [데이터] 반지름 : radius, [기능] 반지름 : getRadius() / 원의 넓이 : getArea() / 반지름 * 반지름 * 3.14
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return(radius);
	}//getRadius()
	
	public double getArea() {
		return(radius*radius*3.14);
		
	}//getArea()
}//class