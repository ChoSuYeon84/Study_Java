public class Study_Java33 {
	public static void main(String[] args) {
		LABEL:
		for(char upper = 'A';upper <='Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					break LABEL;
				}//if
			}//for
		}//for			
	}//main()
}//class
