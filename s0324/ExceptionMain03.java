package s0324;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		
		
		System.out.println("main start...");
		
		for(int i = -2; i<3; i++) {
			System.out.println(i+"번 째 반복문 수행중...");
			try {
				System.out.println(10 / i);
			}catch(ArithmeticException ae) {
				System.out.println("예외발생...");
				break; // 반복문 나가기
			}finally {
				System.out.println("반복문 수행중..."); // finally 키워드가 있으면 break로 나가더라도, finally라는 문장을 수행함				
			}
			
		}

		System.out.println("main end...");
	}

}