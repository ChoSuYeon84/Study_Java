public class Study_Java30 {
	public static void main(String[] args) {
		//for, while, do~while을 이용하여 구구단을 출력하는 프로그램을 완성하시오.
		//① for
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i * j < 10) {
					System.out.print(i+"X"+j+"=0"+(i*j)+"\t");
				}else {
					System.out.print(i+"X"+j+"="+(i*j)+"\t");
				}//if
			}//for j
			System.out.println();
		}//for i
		
	System.out.println("=======================================================================");
		//② while
		int i = 2;
		while(i <= 9) {
			int j = 1;
			while(j <=9) {
				if(i * j < 10) {
					System.out.print(i+"X"+j+"=0"+(i*j)+"\t");
				}else {
					System.out.print(i+"X"+j+"="+(i*j)+"\t");
				}//if
				j++;
			}//while
			i++;
			System.out.println();
		}//while
				
	System.out.println("=======================================================================");

		//③ do while
		i = 2;
		do {
			int j = 1;
			do {
				if(i * j < 10) {
					System.out.print(i+"X"+j+"=0"+(i*j)+"\t");
				}else {
					System.out.print(i+"X"+j+"="+(i*j)+"\t");
				}//if
				j++;
			}while(j <=9);
			i++;
			System.out.println();
		}while(i <= 9);

	}//main()
}//class