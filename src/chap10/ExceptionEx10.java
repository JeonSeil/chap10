package chap10;

import java.util.Scanner;

/*
 * Exception Ŭ������ ��� �޾� MyException�� ���� �� �ִ�.
 */
class LoginFailException extends Exception {
	private int code;
	LoginFailException(String msg) {
		super(msg);
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
public class ExceptionEx10 {
	public static void main(String[] args) {
		try {
			String id="hongkd";
			String pw = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("���̵� �Է��ϼ���");
			String inputid = scan.nextLine(); //hongkd
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String inputpw = scan.nextLine(); //1111
			if(id.equals(inputid) && pw.equals(inputpw)) {
				System.out.println("�α��� ����");
			} else if(!id.equals(inputid)) {
				LoginFailException e = new LoginFailException("���̵� Ʋ���ϴ�.");
				e.setCode(100);
				throw e; //���ܹ߻�
			} else {
				LoginFailException e = new LoginFailException("��й�ȣ�� Ʋ���ϴ�.");
				e.setCode(200);
				throw e;
			}
		} catch(LoginFailException e) {
			System.out.println("���� �ڵ�:"+ e.getCode()); //200
			System.out.println("�����޽���:" + e.getMessage());
			e.printStackTrace();
		}
	}
}