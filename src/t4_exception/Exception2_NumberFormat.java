package t4_exception;

public class Exception2_NumberFormat {
	public static void main(String[] args) {
		String strNumber = "100a";
		System.out.println("num + 10 :"+(strNumber+10));
		
		try {
			int num = Integer.parseInt(strNumber);
			System.out.println("num + 10 :"+(num+10));
			System.out.println("정상처리");
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류 : "+ e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("작업끝");
		
	}
}
