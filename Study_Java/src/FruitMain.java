import com.hanul.Fruit.FruitDAO;
import com.hanul.Fruit.FruitDTO;

public class FruitMain {
	public static void main(String[] args) {
		//5 종류의 과일주문 현황을 저장할 객체(FruitDTO) 배열(Fruit[])생성하고 값을 할당
		FruitDTO[] fruit = new FruitDTO[5];
		fruit[0] = new FruitDTO("바나나", 3800, 3);
		fruit[1] = new FruitDTO("딸기", 2000, 6);
		fruit[2] = new FruitDTO("망고", 4000, 16);
		fruit[3] = new FruitDTO("천혜향", 3200, 20);
		fruit[4] = new FruitDTO("사과", 1000, 20);
		
		//FruitDao.java의 메소드를 호출
		//FruitDao 객체 생성시 배열(Fruit[])을 매개변수로 전달
		
		FruitDAO dao = new FruitDAO(fruit);
		dao.getPrice();
		dao.priceDescSort();
		dao.display();
		
	}//main()
}//class
