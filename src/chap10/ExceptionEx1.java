package chap10;
/*
 * 예외 처리 예제
 * try catch
 *  정상 : 12346
 *  예외1: 1256 
 *  try : 예외가 발생할 수 있는 구문들
 *  catch : try 블럭 실행 시 발생되는 예외를 처리 하는 블럭
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.print("예외2:");
		System.out.print(1/0);
		try {
			System.out.print(2);
			System.out.print(3/0);
			System.out.print(4);
		} catch(ArithmeticException e) {
			System.out.print(5);
		}
		System.out.println(6);
	}
}
