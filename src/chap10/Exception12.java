package chap10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/*
 * 오버라이딩 시 부모클래스의 메서드보다 자손클래스의 메서드의 예외처리는 같거나, 좁은 범위만 가능하다.
 * 오버라이딩 시 부모클래스의 메서드보다 자손클래스의 메서드의 접근 제어자는 같거나, 넓은 범위로 가능하다.
 * 
 * 부모에서 선언된 예외클래스       자손에서 선언된 예외클래스
 *   IOException  >   FileNotFoundException,UnknownHostException
 *   
 *   FileNotFoundException,UnknownHostException 은 IOException의 하위 클래스임.
 *   하위클래스 여러개는 상위클래스보다 좁은 범위다.
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
