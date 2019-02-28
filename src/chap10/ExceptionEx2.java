package chap10;
/*
 * 다중 catch 구문 예제. : try 구문에서 발생 가능성이 있는 예외가 여러개 인 경우 catch구문을 여러개 사용할 수 있다
 * 
 * catch 구문에서 사용되는 예외객체는 상위자료형은 아래쪽에 배치 해야 한다.
 * => Exception 객체를 사용하는 catch 구문은 제일 아래쪽에 배치 된다.
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(10 / Integer.parseInt(args[0]));
			String s = null;
			System.out.println(s.trim());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch(NumberFormatException e) {
			System.out.println("command 라인에 파라미터는 숫자만 가능합니다.");
		} catch(ArithmeticException e) {
			System.out.println("command 라인에 파라미터는 0은 입력하지 마세요.");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("전산부로 연락주세요(전화:1234)");
		}
	}
}
