package t4_exception;

class Parent {

}

class Child extends Parent {

}

class Child2 extends Parent {

}

public class Exception3_Final {
	public static void main(String[] args) {
		System.out.println("작업시작");

		// Child child = new child();
		Parent child = new Child();
		Child cc = (Child) child; // 다운 캐스팅
		System.out.println();

		Parent parent = new Parent();
		try {
			Child2 ccc2 = (Child2) parent; //instanceOf로 처리할 수 있음
			System.out.println("정상처리");
		} catch (ClassCastException e) {
			System.out.println("형변환 오류(다운캐스팅): " + e.getMessage());
//			e.printStackTrace();
		}

		try {
			String data = null;
			System.out.println(data);
			System.out.println(data+100);
			System.out.println((String) data + 100);
			System.out.println( data.toString() + 100); //변환하는 것에는 에러가 난다.
			System.out.println("정상처리2");
		} catch (NullPointerException e) {
			System.out.println("형변환 오류(널값 체크):"+e.getMessage());
//			e.printStackTrace();
		}
			
		System.out.println("작업끝");

	}
}
