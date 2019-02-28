package chap10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/*
 * �������̵� �� �θ�Ŭ������ �޼��庸�� �ڼ�Ŭ������ �޼����� ����ó���� ���ų�, ���� ������ �����ϴ�.
 * �������̵� �� �θ�Ŭ������ �޼��庸�� �ڼ�Ŭ������ �޼����� ���� �����ڴ� ���ų�, ���� ������ �����ϴ�.
 * 
 * �θ𿡼� ����� ����Ŭ����       �ڼտ��� ����� ����Ŭ����
 *   IOException  >   FileNotFoundException,UnknownHostException
 *   
 *   FileNotFoundException,UnknownHostException �� IOException�� ���� Ŭ������.
 *   ����Ŭ���� �������� ����Ŭ�������� ���� ������.
 */
class Parent {
	void method() throws IOException {
		System.out.println("Parent method ");
		boolean b = false;
	}
}
class Child extends Parent {
	@Override
	protected void method() throws FileNotFoundException,UnknownHostException {
		  System.out.println("Child method ");
	}
}
public class Exception12 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
