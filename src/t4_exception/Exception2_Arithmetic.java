package t4_exception;

//실행예외처리 ==> 수식오류
public class Exception2_Arithmetic {
	public static void main(String[] args) {
		int su1 = 10, su2 = 0;
		
		
		try {
			System.out.println("10 / 0 = "+( su1 / su2 ));
			System.out.println("정상처리");
		} catch (ArithmeticException e) {
			System.out.println("예외처리"+ e.getMessage());
//			e.printStackTrace();		
		}
		
		System.out.println("작업 끝");
	}
}
