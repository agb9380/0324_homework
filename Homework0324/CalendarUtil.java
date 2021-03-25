package Homework0324;

import java.util.Calendar;

public class CalendarUtil {
	
	
	
	public void showDayByYear(int year) { // 특정 년도에 해당하는 달력을 1~12월 모두 출력
		
		for(int month =1; month <= 12; month++) {
			showDayByMonth(year,month); // 해당 년도에 따른 월 달력 출력 (2번 문제)
		}
	}

	
	
	public void showDayByMonth(int year, int month) {
		
		Calendar c = Calendar.getInstance();  // 현재 시간에 대한 정보 받았고, year month 날아오는 인자에 따라서 변경해주어야함
		
		// year-month-1로 날짜정보 변경
		c.set(year,month-1,1);
		
		
		//month / 1일의 요일
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		//month / 마지막날 수
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		
		
		System.out.println("<<" + year + "년 "+ month+"월 >>"); //해당하는 월의 '마지막날'이 며칠인지 + 해당하는 월의 '시작일의 요일' => Calendar 객체가 필요함
		showDay(week,lastDay); //실제 달력을 출력하는 메소드
	}
	
	
	
//	굳이 외부에 드러낼 필요없는 showDay 메소드
	
	private void showDay(int week, int lastDay) {
		System.out.println("--------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토"); // week가 요일의 정보를 알고있음, week가 1일 때 일요일, 자신의 숫자 전만큼 tab을 해주어야함 ex) 토요일 7=>6번의 탭이 필요함
		System.out.println("--------------------------------------------------");
		int cnt=0;
		for(int i=1;i<week;i++) 
			System.out.print("\t");
			cnt++;
		for(int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t" );
			if(++cnt % 7 ==0)
				System.out.println();
		}
		if(cnt % 7 !=0)
			System.out.println();
		System.out.println("--------------------------------------------------");
			
			
		
	}
}
