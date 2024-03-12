package t2_nested2;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("su: "+t1.su);
		t1.modTest1();
		System.out.println();
		
		new Aa();//외부(일반)클래스
		System.out.println();
		
		
		Test1.Aa t1a = new Test1.Aa(); //정적 멤버 클래스(중첩 클래스)
		System.out.println("suA: "+t1a.suA);
		System.out.println("suB : "+t1a.suB); //힙에있는 있는 영역에서 가져옴
		t1a.modTest1A();
		t1a.modTest1B();
		System.out.println();
		
		System.out.println("suB :"+Test1.Aa.suB); //메소드영역에서 가져옴
		Test1.Aa.modTest1B();
		
	}
}
