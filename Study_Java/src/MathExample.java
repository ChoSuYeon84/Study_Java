//Math클래스
public class MathExample {
	public static void main(String[] args) {
		
		//절대값
		int m1 = Math.abs(-5);
		double m2 = Math.abs(-3.14);
		System.out.println("m1 = " + m1);
		System.out.println("m2 = " + m2);
		
		//올림값
		double m3 = Math.ceil(5.3);
		double m4 = Math.ceil(-5.3);
		System.out.println("m3 = " + m3);
		System.out.println("m4 = " + m4);
		
		//버림값
		double m5 = Math.floor(5.3);
		double m6 = Math.floor(-5.3);
		System.out.println("m5 = " + m5);
		System.out.println("m6 = " + m6);
		
		//최대값
		int m7 = Math.max(5, 9);
		double m8 = Math.max(5.3,  2.5);
		System.out.println("m7 = " + m7);
		System.out.println("m8 = " + m8);
		
		//최소값
		int m9 = Math.min(5, 9);
		double m10 = Math.min(5.3,  2.5);
		System.out.println("m9 = " + m9);
		System.out.println("m10 = " + m10);
		
		//랜덤값
		double m11 = Math.random();
		System.out.println("m11 = "+ m11);
		
		//가까운 정수의 실수값
		double m12 = Math.rint(5.3);
		double m13 = Math.rint(5.7);
		System.out.println("m12 = " + m12);
		System.out.println("m13 = " + m13);
		
		//반올림값
		long m14 = Math.round(5.3);
		long m15 = Math.round(5.7);
		System.out.println("m14 = " + m14);
		System.out.println("m15 = " + m15);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double m16 = temp2 / 100.0;
		System.out.println("m16 = "+ m16);
		
	}//main
}//class
