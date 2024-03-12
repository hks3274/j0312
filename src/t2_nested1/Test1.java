package t2_nested1;

//중첩클래스 : instance 멤버 클래스
public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다");
		
	}
	
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드입니다");
	}
	
	public class Aa { //중첩 클래스
//		int su = 100; //(O) 같은 이름의 변수로 했을 때 에러가 나지 않는다.
		int suA = 200;
		//static int suB = 250;
		
		public Aa() {
			System.out.println("이곳은 중첩클래스 Aa클래스 입니다");
		}
		
		public void modTest1A() { //에러가 안난다.
			System.out.println("이곳은 Test1클래스의 modTest1A메소드입니다");
		}
		
//	public static void modTest1B() {}
		
	}
	
}


class Aa{
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다");
	}
}