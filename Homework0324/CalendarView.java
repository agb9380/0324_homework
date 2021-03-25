package Homework0324;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc;

	public CalendarView() {
		sc = new Scanner(System.in);
	}

	public int getInt(String msg) {
		System.out.println(msg);
		int no = sc.nextInt();
		sc.nextLine();

		return no;
	}

public void process() {
		
		CalendarUtil util = new CalendarUtil();
		
/*loop:*/ while (true) {

			int command = getInt("항목을 선택하세요(1.특정연도 2.특정월 3.종료) : ");
			int year, month;
			switch (command) {
			case 1:
				year = getInt("년도를 입력하세요 :");
				util.showDayByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 :");
				month = getInt("월을 입력하세요 :");
				util.showDayByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 밑의 loop를 사용하지 않고, 바로 종료하도록 하는 것, System 클래스의 static
//				break loop; // break는 가장 가까운 스위치 빠져나옴, 3번 선택하면 종료해야하니까

			}

		}

	}

}