package t4_exception;

public class Exception1_classNotFound {
	public static void main(String[] args) {
		
		//java.lang.Object
		
		try {
			Class.forName("java.lang.Object2");
			System.out.println("java.lang패키지에는 Object2클래스가 있습니다");
		} catch (ClassNotFoundException e) { //일반 예외처리
//			System.out.println("java.lang패키지에는 Object2클래스가 없습니다");
//			e.printStackTrace(); //어떤 예외를 발생하는지 알려줌
			System.out.println("java.lang패키지에는 Object2클래스가 없습니다 : " + e.getMessage()); //자주 사용할 것 e.getMessage() ==> 발생한 오류의 예외를 알려줌
		}
		System.out.println("작업끝....");
	}
}
