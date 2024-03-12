package t4_exception;

import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1_IOException {
	public static void main(String[] args) {
		
		//파일을 다운, 보내는게 스트림이라는 객체임
		try {
			InputStreamReader is =  new InputStreamReader(System.in); //콘솔을 통해서 파일명을 입력받아 처리하겠다.
			System.out.print("업로드할 파일명을 입력하세요 ");
			is.read();
			System.out.println("파일을 정상적으로 읽었습니다");
		} catch (IOException e) {
			System.out.println("파일 읽기 실패~~~~");
			e.printStackTrace();
		}
		
		
	}
}
