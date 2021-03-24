package s0324;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("a.txt"); // 파일리더를 이용해서 객체를 만들때는 이 파일이 없을 수도 있음! 그러니까 예외처리를 하는게 좋아 라고 하는게
														// '컴파일 시점 예외', checked exception

		} catch (FileNotFoundException fnfe) {
			try { // 중첩된 예외 처리도 가능
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}