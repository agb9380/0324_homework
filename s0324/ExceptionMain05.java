package s0324;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

abstract class Parent {
	public abstract void print();

	public abstract void scan() throws Exception; // 추상 메소드를 만들 때, 간접 처리 구문을 써주는 것

}

class Child extends Parent {

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void scan() throws Exception {
		// TODO Auto-generated method stub

	}

}

public class ExceptionMain05 {

	public static void main(String[] args) throws Exception {

//  JVM도 예외 처리할 수 있음 public static void main(String[] args) throws Exception {	JVM에 예외 처리 넘기는 것. 웬만하면 x, 내 코드에서 처리 해주는게 좋음

		b();

		Child obj = new Child();
		obj.print();
		try {
			obj.scan(); // 체크드 익셉션 => 예외가 발생할 수 있으니까 예외를 처리 하라고 나옴, 그래서 좀 더 안전하게 갈 수 있음(최소한의 안전 장치), scan						// 메소드에 throws가 붙어있으니까
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			b();
//			
//		} catch (Exception e) {
//			System.out.println("main()의 예외처리....");
//			e.printStackTrace();
//		}
//		a();

	}

	public static void b() throws Exception { // main 메소드로 예외 처리를 넘김
		System.out.println("b() 메소드 호출...");
		String str = null;
		System.out.println(str.charAt(0)); // nullpointerException 예외 처리는 어떻게 함? ArithmeticException,
											// NullPointerException ==> 어떤 예외가 발생할지 모름.. 그래서 Exception해주면 어떤 예외든지 처리할 수
											// 있음
		System.out.println(1 / 0); // ArithmeticException 예외 발생
	}

	public static void a() {
		System.out.println("a() 메소드 호출...");

		try {
			FileReader fr = new FileReader("a.txt"); // 무조건 try catch필요함

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}