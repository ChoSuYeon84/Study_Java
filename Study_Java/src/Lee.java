public class Lee extends Character{
	public Lee () {
		exp = 20;
		energy = 30;
		level = 0;
		System.out.println("이상해씨 캐릭터가 생성되었습니다.");
		printInfo();
	}//Lee()

	@Override
	public void eat() {
		energy += 5;
		
	}//eat()

	@Override
	public void sleep() {
		energy += 20;
		
	}//sleep()

	@Override
	public boolean play() {
		energy -= 10;
		exp += 15;
		return checkEnergy();
	}//play()

	@Override
	public boolean train() {
		energy -= 10;
		exp += 25;
		return checkEnergy();
	}//train()

	@Override
	public void levelUp() {
		if(energy > 35) {
			level++;
			exp -= 35;
			System.out.println("레벨업 되었습니다.");
		}//if
	}//levelUp()
	
}//class