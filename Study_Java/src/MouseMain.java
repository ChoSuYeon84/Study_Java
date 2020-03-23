public class MouseMain {
	public static void main(String[] args) {
		System.out.println("Mouse Class");
		
		Mouse m = new Mouse();	//Mouse 객체 생성
		m.clickLeft();
		m.clickRight();
		System.out.println("==============");
		
		System.out.println("WheelMouse Class");
		WheelMouse wm = new WheelMouse();	//whellMouse 객체생성
		wm.clickLeft();		//상속받은 상위클래스 (Mouse)의 메소드
		wm.clickRight();	//상속받은 상위클래스 (Mouse)의 메소드
		wm.scroll();		//하위클래스(WheelMouse)의 메소드
		System.out.println("==============");
		
		System.out.println("OpticalMouse Class");
		OpticalMouse om = new OpticalMouse();	//OpticalMouse 객체생성
		om.clickLeft();
		om.clickRight();
		om.scroll();
	}//main()
}//class
