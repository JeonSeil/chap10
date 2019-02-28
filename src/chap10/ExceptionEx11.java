package chap10;
/*
 * ������ ������ ������ ���α׷� �����ϱ�.
 * main �޼���� badmethod���� ���� ����ó�� �ϱ�.
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
			System.out.println("main�޼��忡�� ����ó��");
		}
	}
	static void badmethod() throws MyException{
		try {
			throw new MyException("���� ���� ���� Ŭ������ ���� ���� �߻�");
		} catch (MyException e) {
			System.out.println("badmethod�޼��忡�� ����ó��");
			throw e;
		}
	}
}
