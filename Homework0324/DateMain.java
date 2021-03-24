package Homework0324;

import java.util.Calendar;
import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {
		
		String[] dayArr = {"","일","월","화","수","목","금","토"};
		Calendar c = Calendar.getInstance();
		
		//int year = c.get(Calendar.YEAR);  //현재 년도
		//int month = c.get(Calendar.MONTH)+1; //현재 월 
		//int date = c.get(Calendar.DATE); // 현재 일
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요 (1.특정년도 2.특정월 3.종료 )=> ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		if(inputNum ==1) {
			System.out.println("년도를 입력하세요. ");
			int inputYear= sc.nextInt();
			sc.nextLine();
			//입력받으면 
			c.set(inputYear, 1, 1); //2020년을 입력하면 2020년으로 변경함, 년, 월, 일 지정, 이거를 반복문에 넣으면 의미없는 초기화를 계속하는 것
		
			//get을 이용해서 2020년 1월 1일부터 출력하기
			
			//c.get
			
			
			for(int i=0; i<12; i++) {		
				int month = c.get(Calendar.MONTH); // 월이 나와야함
				System.out.println(month);
			}
			// 만약 2020을 입력하면
			//for( int i=0; i<)
		}
		
	}
	

}



// 2020년 1월부터 