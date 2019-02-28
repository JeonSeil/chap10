package chap10;
/*
 * ���� catch ���� ����. : try �������� �߻� ���ɼ��� �ִ� ���ܰ� ������ �� ��� catch������ ������ ����� �� �ִ�
 * 
 * catch �������� ���Ǵ� ���ܰ�ü�� �����ڷ����� �Ʒ��ʿ� ��ġ �ؾ� �Ѵ�.
 * => Exception ��ü�� ����ϴ� catch ������ ���� �Ʒ��ʿ� ��ġ �ȴ�.
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
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���");
		} catch(NumberFormatException e) {
			System.out.println("command ���ο� �Ķ���ʹ� ���ڸ� �����մϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("command ���ο� �Ķ���ʹ� 0�� �Է����� ������.");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("����η� �����ּ���(��ȭ:1234)");
		}
	}
}
