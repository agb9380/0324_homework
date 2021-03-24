package s0324;

public class CheckIDException extends Exception {

	public CheckIDException() {   // source => generate con~ super하면 부모에 있는 것 가져올 수 있음
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckIDException(String message) {
		super(message); // 상위클래스인 Exception에 message 전달
	}   // 예외처리 클래스로 인식, 익셉션 클래스를 상속받기만 하면됨
	
}
