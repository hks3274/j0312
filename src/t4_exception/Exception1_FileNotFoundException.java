package t4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1_FileNotFoundException {
	public static void main(String[] args) {

		try {
//			FileInputStream is = new FileInputStream("text.txt");
			FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_exception\\Exception_classNotFound.java"); // \\ 윈도우 경로 => 쓸거면 2개 붙여야 함
																																																																			//리눅스는 / -> 이거 하나만 붙이면 됨
			System.out.println("text.txt파일이 존재합니다");
		} catch (FileNotFoundException e) {
			System.out.println("text.txt파일이 없습니다.");
			e.printStackTrace();
		}
		System.out.println("작업끝");
	}
}
