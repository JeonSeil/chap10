package test;

/*
*  ���� �ҽ��� ����� ���ÿ�. 
*  ���� ���� ����� ���ÿ�.
*  1256
*/
public class Test2 {
	static void method(boolean b) { //false
		try {
			System.out.print(1);
			if (b)
				throw new ArithmeticException();
			System.out.print(2);
		} catch (RuntimeException r) {
			System.out.print(3);
			return;
		} catch (Exception e) {
			System.out.print(4);
			return;
		} finally {
			System.out.print(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true); //135
		method(false);//1256
	} // main    1351256
}
