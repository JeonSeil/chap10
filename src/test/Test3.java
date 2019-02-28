package test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
������ ������ ���ڸ� ���ߴ� ������ �����ϴ� ���߿� ���ڰ� �ƴ� �����ڸ� �־ �߻��� �����̴� 
����ó���� �ؼ� ���ڰ� �ƴ� ���� �Է����� ���� �ٽ� �Է��� �޵��� ���α׷��� �ۼ��ϱ�

1 �� 100 ������ ���� �Է��ϼ��� : 50 
�� ���� ���� �Է��ϼ���
1 �� 100 ������ ���� �Է��ϼ��� : aaa 
Exception in thread "main" java.util.InputMismatchException 
at java.util.Scanner.throwFor(Scanner.java:819) 
.....

1 ���� 100 ������ ���� �ƴ� ��� InputNumberException ���ܸ� �߻��ϰ�, 
1���� 100������ ���� �Է°����մϴ�. �޼��� ��� �� �ٽ� �Է¹޵��� ���α׷� �����ϱ� 
*/
class InputNumberException extends Exception {
	InputNumberException(String msg) {
		super(msg);
	}
}
public class Test3 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		do {
			count++;
			System.out.print("1 �� 100 ������ ���� �Է��ϼ��� :");
			try {
			  input = new Scanner(System.in).nextInt();
			  if(input < 1 || input > 100) {
				  throw new InputNumberException("1���� 100������ ���ڸ� �Է��ϼ���");
//				  System.out.println("1���� 100������ ���ڸ� �Է��ϼ���");
//				  continue;
			  }
			} catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				continue;
			} catch(InputNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ��� .");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ��� .");
			} else {
				System.out.println("������ϴ� .");
				System.out.println("�õ�Ƚ����" + count + " ���Դϴ� .");
				break;
			}
		} while (true);
	}
}