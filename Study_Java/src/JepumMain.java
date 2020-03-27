import java.util.ArrayList;

import com.hanul.JepumDAO;
import com.hanul.JepumDTO;

public class JepumMain {
	public static void main(String[] args) {
		//제품정보 입력
		ArrayList<JepumDTO> list = new ArrayList<>();
		list.add(new JepumDTO("컴퓨터", 500000, 5));
		list.add(new JepumDTO("프린터", 100000, 7));
		list.add(new JepumDTO("노트북", 300000, 5));
		list.add(new JepumDTO("모니터", 300000, 5));
		list.add(new JepumDTO("키보드", 100000, 8));
		
		
		JepumDAO dao = new JepumDAO(list);
		
		dao.getPrice();	//주문가격계산
		dao.display();	//제품정보출력
		dao.priceDescSort();//가격의 내림차순 정렬
		dao.display();
		dao.nameAscSort();	//제품명의 오름차순 정렬
		dao.display();
		
	}//main()
}//class
