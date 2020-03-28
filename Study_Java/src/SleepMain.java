public class SleepMain {
	public static void main(String[] args) {
		Sleep sleep1 = new Sleep(1);
		Sleep sleep2 = new Sleep(2);
		Sleep sleep3 = new Sleep(3);
		
		sleep1.start();
		sleep2.start();
		sleep3.start();
	}//main()
}//class
