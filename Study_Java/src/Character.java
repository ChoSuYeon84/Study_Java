public abstract class Character {	//추상클래스
	//멤버변수 선언
	protected int exp;		//경험치
	protected int energy;	//에너지
	protected int level;	//레벨

	//추상메소드
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	
	//에너지체크
	public boolean checkEnergy() {
		if(energy > 0) {
			return true;
		}else {
			return false;
		}//if
	}//checkEnergy()
	
	//현재 캐릭터의 상태를 출력
	public void printInfo() {
		System.out.println("==========================");
		System.out.println("현재 캐릭터의 정보를 출력합니다.");
		System.out.println("경험치 : "+ exp);
		System.out.println("에너지 : "+ energy);
		System.out.println("레벨 : "+ level);
		System.out.println("==========================");
	}//printInfo()
	
}//class