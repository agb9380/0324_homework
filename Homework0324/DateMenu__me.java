package Homework0324;

import java.util.Calendar;
import java.util.Scanner;

public class DateMenu__me {

	Scanner sc = new Scanner(System.in);

	private String[] dayArr = { "", "일", "월", "화", "수", "목", "금", "토" };
	private int inputNum;
	private int inputYear;
	private int inputMonth;
	private int day; // 무슨 요일인지 확인
	private int lastday; // 각 월의 최댓값

	Calendar c = Calendar.getInstance();

	public int choiceMenu() {
		System.out.println("선택하세요 (1.특정년도 2.특정월 3.종료 )=> ");
		int inputNum = sc.nextInt();
		sc.nextLine();

		return inputNum;
	}

	public void dateMenu() {
		inputNum = choiceMenu();
		if (inputNum == 1) {
			System.out.println("년도를 입력하세요: ");
			inputYear = sc.nextInt();
			sc.nextLine();
//			1-1: 1월, 2-1: 2월 3-1: 3월, 4-1: 4월, 5-1 5월 ~ 12-1: 12월
//			c.set(inputYear, i-1, 1); //2020년을 입력하면 2020년으로 변경함, 년, 월, 일 지정
//			int day; // 무슨 요일인지 확인
//			int lastday; // 각 월의 최댓값

			for (int i = 1; i < 13; i++) {
				c.set(inputYear, i - 1, 1);
				System.out.println(); // 출력문 잘보이게함
				System.out.println("<< " + inputYear + "년 " + i + "월 >>");
				lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH); // lastday까지 수를 반복적으로 출력하면 해당 월의 달력이 출력됨
				day = c.get(Calendar.DAY_OF_WEEK);
				for (int j = 1; j <= lastday; j++) {
					System.out.print(" " + j + "일=" + dayArr[day]);
					day++;
					if (day == 8) {
						day = 1; // dayArr 배열 크기가 7(토요일)이 되었을 때, 다시 1(일요일)로 이동
					}

				}
				System.out.println();

			}

		} else if (inputNum == 2) {
			System.out.println("년도를 입력하세요: ");
			inputYear = sc.nextInt();
			sc.nextLine();
			System.out.println("월을 입력하세요: ");
			inputMonth = sc.nextInt();
			sc.nextLine();

			c.set(inputYear, inputMonth - 1, 1);
			lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH); // lastday까지 수를 반복적으로 출력하면 해당 월의 달력이 출력됨
			day = c.get(Calendar.DAY_OF_WEEK);
			for (int j = 1; j <= lastday; j++) {
				System.out.print(" " + j + "일=" + dayArr[day]);
				day++;
				if (day == 8) {
					day = 1; // dayArr 배열 크기가 7(토요일)이 되었을 때, 다시 1(일요일)로 이동
				}
			}

		} else if (inputNum == 3) {
			System.out.println("종료");
		}

	}

}
