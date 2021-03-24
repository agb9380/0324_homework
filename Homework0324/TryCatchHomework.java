package Homework0324;

import java.util.Scanner;

public class TryCatchHomework {

	static void input() throws CheckIDException {
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호를 입력하세요 :");
		int inputNum = sc.nextInt();
		sc.nextLine();
		// 1~45 사이만 가능
		if (inputNum >= 1 && inputNum <= 45) {
			System.out.println(inputNum + "을 포함해서 로또번호들을 추출하겠습니다.");
		} else { // 이때 예외가 발생한다고 정의
			throw new CheckIDException("LottoNumberException: 1-45 사이만 가능합니다. " + inputNum + "은 올바르지 않습니다.");
		}

	}

	public static void main(String[] args) {

		try {
			input();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}