package t4_exception;

public class Exception_NullPointer {
	public static void main(String[] args) {
		String str = "Seoul";
		String str2 = null;
		
		System.out.println("o : " + str.charAt(2));
		try {
			System.out.println("str2 : " + str2.charAt(2));
			System.out.println("정상처리");
		} catch (NullPointerException e) {
			System.out.println("null 값 체크 : "+e.getMessage());
//			e.printStackTrace();
		}
		
	}
}
