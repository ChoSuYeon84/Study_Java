public class StudentMain {
	//Student Class 객체를 생성하고 값(이름(name), 국어(kor), 영어(eng), 수학(mat))을 입력 ▶ 멤버변수
	//총점 계산 (sum()), 평균계산(avg()), 결과를 출력(display())▶ 멤버 메소드	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name ="홍길동";
		s1.kor = 90;
		s1.eng = 65;
		s1.mat = 100;
		s1.getSum();
		s1.getAvg();
		s1.display();
		
		Student s2 = new Student();
		s2.name = "성춘향";
		s2.kor = 80;
		s2.eng = 95;
		s2.mat = 90;
		s2.getSum();
		s2.getAvg();
		s2.display();
		
	}//main()
}//class
