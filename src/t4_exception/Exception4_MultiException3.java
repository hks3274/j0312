package t4_exception;

public class Exception4_MultiException3 {
	public static void main(String[] args) {
		try {
			String data0 = args[0];
			System.out.println("args[0] = " + data0);
			String data1 = args[1];
			System.out.println("args[1] = " + data1);
			String data2 = args[2];
			System.out.println("args[2] = " + data2);

			int res = Integer.parseInt(data0) + Integer.parseInt(data2);
			System.out.println("res : " + res);

		} catch (ArrayIndexOutOfBoundsException e) { // Exception이 오류를 잡았는데 또 잡아서 오류가 발생
			System.out.println("첨자 변수 체크 : " + e.getMessage());
		}  catch (NumberFormatException e) {
			System.out.println("수치변수 체크 : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("작업 끝"); //finally는 공통적으로 사용할 내용을 적어주면 된다.		
		}
	}
}
