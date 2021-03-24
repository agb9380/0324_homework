package s0324;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import kr.ac.kopo.day10.homework.GameMain;



class Dog{
	String name;
	int age;
	
	Dog(String name, int age){ // 생성자를 통해 초기화
		this.name =name;
		this.age = age;
	}
	
	public void info() {
		
		System.out.println("name" + name + ", age: " + age);
	}
	
	
}



public class DateMain {

	public static void main(String[] args) {
		
		
		// Calendar 클래스로 해보자, Calendar 클래스는 추상 클래스임
		
		Calendar c = Calendar.getInstance(); // 객체를 얻기 위해 Calendar.getInstance(); 이 메소드는 static임
		
		System.out.println("c :" + c);
		
		
		int year = c.get(Calendar.YEAR);   // calendar 클래스의 year 상수 변수는 public이고, static이기 때문에 접근 가능, c.get(1)을 입력한것과 동일
		//int year2 = c.get(1);
		int month = c.get(Calendar.MONTH) + 1 ; // 0~11까지 나옴
		int date = c.get(Calendar.DATE);
		
		//int date = c.get(Calendar.DAY_OF_MONTH); 이렇게 써도 위와 똑같이 나옴
		
		int day = c.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)
		
		 String[] dayArr = {"","일","월","화","수","목","금","토"}; //순서 맞춰주기 위해 비워줬음
		//String[] dayArr = {"일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 "+ year + "년 " + month + "월 " + date + "일 (" + dayArr[day]+")");  //[day-1] 에서 [day]로 할 수 있는 건 배열에 "" 넣었기 때문임
		
		
		
		
		
		
		
		// 2021년 5월 5일이 무슨 요일일까?
		
		c.set(2021,5-1,5); // 5월로 지정 (년, 월, 일 지정) 변경됨, month는 0~11까지 나옴, 5-1 한 이유
		day = c.get(Calendar.DAY_OF_WEEK);  // 5월 5일이 무슨 요일인지 알기 위해 DAY_OF_WEEK ==> 2021년 5월 5일로 '현재' 날짜를 지정하고,  c.get(7)을 넣으면 현재 요일에 해당하는 수를 출력함, 1(일요일)~ 7(월요일)에 해당하는 수 출력
		System.out.println("2021년 5월 5일은 "  + dayArr[day] + "요일입니다.");
		
		//5월의 마지막날이 몇 일?
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH); // 현재 month(현재는 6월)의 최댓값
		System.out.println("6월은?? "+ lastday + "일로 구성되어 있습니다.");
		
		//2월의 마지막날이 몇 일?
		c.set(Calendar.MONTH, 2-1 ); // 2월로 변경 2021년 2월 5일 변경
		lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("2월은 "+ lastday + "일로 구성되어 있습니다.");
		
		
		Date d = c.getTime();
		
		
		
		
		//simpleDateFormat
		
		String pattern = "yyyy년-MM월-dd일 HH시 mm분 ss초(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String data = sdf.format(new Date());
		System.out.println(data);
		
		data = sdf.format(d);
		System.out.println(data);

		
		
		/*
//		Dog dog = new Dog("멍이", 3);
//		System.out.println("dog: " + dog.toString());   // 모든 클래스는 object 클래스를 상속받음, 자식 클래스가 부모 클래스의 메소드를 내것처럼 사용함
//														// '출력'할 때만 toString 메소드가 호출됨 dog 나 dog.toString() 이 같은 이유
//		dog.info();	
		
		// 오늘은 2021년 3월 24일 입니다.
		
		Date d = new Date();
		d.toString();
		System.out.println("d: "+ d);  //원래는 주소값이 찍혀야 하는데..		
		System.out.println("d: "+ d.toString());  //원래는 주소값이 찍혀야 하는데.. => Date 클래스가 부모 클래스의 toString 메소드를 오버라이딩 했음!!, 주소값을 찍지 않고, 나의 정보(나의 객체에 대한 정보)를 찍도록 했음
		
		
		
		//년, 월, 일을 뽑아내기
		
		int year = d.getYear() + 1900; // 1900년 1월 1일부터 몇 년째 인지의 결과가 나옴.... 그래서 +1900
		int month = d.getMonth() +1; 
		int date = d.getDate(); 
		
		
		System.out.println("오늘은 " + year + "년 " );
		System.out.println("오늘은 " + month + "월 " );
		System.out.println("오늘은 " + date + "일 " );
		
		
		*/
		
		
		
		
		
		
	}

}
