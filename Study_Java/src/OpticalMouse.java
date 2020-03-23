public class OpticalMouse extends WheelMouse{
	//상위클래스인 WheelMouse Class를 하위클래스인 opticalMouse Class가 상속
	//오버라이드(Override) : 자식클래스에서 부모클래스로부터 상속받은 메소드를 재정의
	
	@Override
	public void clickLeft() {
		System.out.println("광마우스 왼쪽 버튼 클릭");
	}//clickLeft()

	@Override
	public void clickRight() {
		System.out.println("광마우스 오른쪽 버튼 클릭");
	}//clickRight()
	
	@Override
	public void scroll() {
		System.out.println("광마우스 스크롤 기능");
	}//scroll()
}//class
