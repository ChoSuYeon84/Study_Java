//바이트 배열로 변환(getBytes())
//EUC-KR은 알파벳은 1바이트, 한글은 2바이트로 변환
//UTF-8은 알파벳은 1바이트, 한글은 3바이트로 변환
public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		try {
			byte[] bytes1 = str.getBytes("euc-kr");	//EUC-KR을 이용해서 인코딩 및 디코딩
			System.out.println("byte1.length: "+bytes1.length);
			String str1 = new String(bytes1, "euc-kr");
			System.out.println("bytes1->String : "+str1);
			
			byte[] bytes2 = str.getBytes("utf-8");	//UFT-8을 이용해서 인코딩 및 디코딩
			System.out.println("byte1.length: "+bytes2.length);
			String str2 = new String(bytes2, "utf-8");
			System.out.println("bytes1->String : "+str2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
