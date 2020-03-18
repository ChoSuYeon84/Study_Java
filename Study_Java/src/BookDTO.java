//상태정보(멤버변수, 필드)를 저장하는 Class
//서로 다른 타입의 데이터를 하나로 묶기 위해 설계
public class BookDTO {
	//① 멤버변수 선언 ▶ 정보은닉(캡슐화) : private
	private String title;	//제목
	private int Price;		//가격
	private String company;	//출판사
	private String name;	//저자
	
	//② 기본 생성자 메소드(Default Constructor Method)
	//클래스의 이름과 메소드의 이름이 동일, 리턴타입이 없다.
	//전달되는 매개변수와 구현부(body{})가 없다 : 빈깡통
	//생략가능 → JVM이 자동으로 생성 ▶ 단, DTO(VO) Class 설계 시 반드시 만들어 주자!
	public BookDTO() {}	//객체를 생성해야 하므로 접근제어자를 public을 주고 클래스이름, 괄호, 블럭

	//③ 선언된 멤버변수로 값을 할당하기 위해, 전달되는 매개변수를 초기화하는 생성자 메소드 정의 (생성자 메소드를 초기화 한다)
	//이클립스에서 자동으로 제공 : Source MenuBar(마오>Source)>Generate Constructor using Fields...
	public BookDTO(String title, int price, String company, String name) {
		super();				//부모(상위)클래스 : JAVA의 모든 클래스는 Object Class 무조건 상속
		this.title = title;		//매개변수와 멤버변수를 구분하기 위해 멤버변수 앞에 this 키워드
		Price = price;
		this.company = company;
		this.name = name;
	}

	//④ 입력(Setter), 출력(Getter)메소드를 정의 : 멤버변수에 접근
	//이클립스에서 자동으로 제공 : Source MenuBar(마오>Source)>Generate Getters and Setters...
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}//class
