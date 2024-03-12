package t2_nested3;

//중첩클래스 : 로컬 멤버 클래스
public class Test1 {
	int su = 300;

	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다");

	}

	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드입니다");
	}

	public void modclass() {
		int atom = 900;
		System.out.println("이곳은 Test1클래스의 modClass메소드 입니다.");
		System.out.println("이곳은 Test1클래스의 modClass메소드 안의 atom변수 입니다 : " + atom);
		
		
		
		class Aa { // 로컬 클래스 //메소드 블럭 안에 있는 클래스는 메소드를 사용하고 나오게 된다. 그래서 public 을 사용하면 안된다.
			int suA = 400;

			public Aa() {
				System.out.println("이곳은 중첩클래스 Aa클래스 입니다");
			}

			public void modTest1A() { // 에러가 안난다.
				System.out.println("이곳은 Test1클래스의 modTest1A메소드입니다");
			}

		}
		System.out.println("---------------------------------------------");
		Aa aa = new Aa();
		System.out.println("중첩클래스 안의 suA :"+aa.suA);
		aa.modTest1A();
		
	}
	
	public void modClass2() {
		class Bb {
			
		}
	}
	
	public void modClass3() {
		class Aa {
			
		}
	}
	
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다");
	}
}