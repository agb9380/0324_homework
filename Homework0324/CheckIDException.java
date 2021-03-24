package Homework0324;

public class CheckIDException extends Exception {

	public CheckIDException() {
		super();
	}

	public CheckIDException(String message) {
		super(message); // 상위클래스인 Exception에 message 전달
	}
	
}
