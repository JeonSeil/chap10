package test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
다음은 사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다 
예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 프로그램을 작성하기

1 과 100 사이의 값을 입력하세요 : 50 
더 작은 수를 입력하세요
1 과 100 사이의 값을 입력하세요 : aaa 
Exception in thread "main" java.util.InputMismatchException 
at java.util.Scanner.throwFor(Scanner.java:819) 
.....

1 부터 100 사이의 수가 아닌 경우 InputNumberException 예외를 발생하고, 
1부터 100사이의 수만 입력가능합니다. 메세지 출력 후 다시 입력받도록 프로그램 수정하기 
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
			System.out.print("1 과 100 사이의 값을 입력하세요 :");
			try {
			  input = new Scanner(System.in).nextInt();
			  if(input < 1 || input > 100) {
				  throw new InputNumberException("1부터 100까지의 숫자만 입력하세요");
//				  System.out.println("1부터 100까지의 숫자만 입력하세요");
//				  continue;
			  }
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				continue;
			} catch(InputNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요 .");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요 .");
			} else {
				System.out.println("맞췄습니다 .");
				System.out.println("시도횟수는" + count + " 번입니다 .");
				break;
			}
		} while (true);
	}
}