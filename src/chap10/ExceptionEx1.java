package chap10;
/*
 * ���� ó�� ����
 * try catch
 *  ���� : 12346
 *  ����1: 1256 
 *  try : ���ܰ� �߻��� �� �ִ� ������
 *  catch : try �� ���� �� �߻��Ǵ� ���ܸ� ó�� �ϴ� ��
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.print("����2:");
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
