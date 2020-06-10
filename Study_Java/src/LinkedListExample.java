import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//ArrayList와 LinkdeList의 실행 성능 비고
//ArrayList는 중간 인덱스의 객체를 제거하면 뒤에 있는 객체의 인덱스가 1씩 앞으로 당겨지기 때문에 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 LinkedList가 좋은 성능을 발휘함
//끝에서부터 순차적으로 추가 또는 삭제하는 경우는 ArrayList가 빠르지만, 중간에 추가, 삭제하는 경우는 앞뒤 링크 정보만 변경하는 LinkedList가 더 빠르다.
public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i <10000; i++) {
			list1.add(0, String.valueOf(i));
		}//for
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : "+ (endTime-startTime)+ "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkexList 걸린시간 : "+(endTime-startTime)+ "ns");
	}
}
