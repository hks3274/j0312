package t4_exception;

public class Exception5_throw2 {
	public static void main(String[] args) {
		try { //여기서 오류를 검출한다.
			findMethod();
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("찾는 클래스가 없습니다."+e.getMessage());
		}finally {
			System.out.println("작업끝..");
		}
	}

	private static void findMethod() throws ClassNotFoundException { //선언부에 throws를 적용 
		Class.forName("java.lang.String"); //여기서 오류가 발생하면 나간다.
		System.out.println("계속진행중..");
	}
}
