package chap10;
/*
 * 컴파일 오류가 없도록 프로그램 수정하기.
 * main 메서드와 badmethod에서 각각 예외처리 하기.
 */
class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}
public class ExceptionEx11 {
	public static void main(String[] args) {
		try {
			badmethod();
		} catch (MyException e) {
			System.out.println("main메서드에서 예외처리");
		}
	}
	static void badmethod() throws MyException{
		try {
			throw new MyException("내가 만든 예외 클래스로 예외 강제 발생");
		} catch (MyException e) {
			System.out.println("badmethod메서드에서 예외처리");
			throw e;
		}
	}
}
