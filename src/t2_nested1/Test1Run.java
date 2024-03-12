package t2_nested1;

//import t2_nested1.Test1.Aa;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("Test1클래스의 su : "+t1.su);
		t1.modTest1();
		System.out.println();
		
		Aa aa = new Aa();
		System.out.println();
		
//		Aa t1a = t1.new Aa();
		Test1.Aa t1a = t1.new Aa(); //중첩 클래스를 부를 때 사용
		System.out.println("suA : "+t1a.suA);
		t1a.modTest1A();
	}
}
