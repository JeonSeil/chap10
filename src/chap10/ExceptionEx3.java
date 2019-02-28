package chap10;
/*
 * try catch finally 구문
 * 
 * finally : 정상처리, 예외발생시 모두 실행되는 블럭
 *           중간에 return 구문이 실행 되도 finally구문은 실행되고 종료됨.
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println("작업시작");
			System.out.println("작업 중");
			int num = 10 / 0;
			System.out.println("작업 완료");
			return;
		} catch (Exception e) {
			System.out.println("작업 중 오류 발생");
			return;
		} finally {
			System.out.println("작업 마무리 하기");
		}
//		System.out.println("프로그램 종료");
	}
}
