import com.hanul.poly03.Radio;
import com.hanul.poly03.RemoCon;
import com.hanul.poly03.Tv;

public class Poly03Main01 {
	//RemoCon Interface로 Tv, Radio 소리를 올리고 내린 후에 인터넷 접속
	public static void main(String[] args) {
		//① UpCasting
		RemoCon remoCon = new Tv();
		remoCon.volUp();
		remoCon.volDown();
		remoCon.internet();
		
		remoCon = new Radio();
		remoCon.volUp();
		remoCon.volDown();
		remoCon.internet();
		
		System.out.println("========================");
		
		Tv tv = new Tv();
		Radio radio = new Radio();
		
		//② 다형성 인수
		play(tv);
		play(radio);
		
		System.out.println("========================");
		
		//③ 다형성 배열
		RemoCon[] remoCons = {tv, radio};
		for (int i = 0; i < remoCons.length; i++) {
			remoCons[i].volUp();
			remoCons[i].volDown();
			remoCons[i].internet();
		}
	}//main()
	
	public static void play(RemoCon remoCon) {
		remoCon.volUp();
		remoCon.volDown();
		remoCon.internet();
	}//play()

}//class
