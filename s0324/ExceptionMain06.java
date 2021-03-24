package s0324;

import java.util.Scanner;

/*
 * 등록할 ID를 입력하세요 : hello1234
 * ID는 최대 8글자만 가능합니다
 * 
 * 등록할 ID를 입력하세요 : hello123
 * ID를 등록하였습니다.
 */

public class ExceptionMain06 {
	
	static void register() throws CheckIDException { // 예외를 CheckIDException에서 처리할 것임
		Scanner sc = new Scanner(System.in);
		System.out.println("등록할 ID를 입력하세요.");
		String id = sc.nextLine();
		
		
		if(id.length()>8)
			throw new CheckIDException("최대 8글자만 가능합니다.");
			
		System.out.println("ID를 등록하였습니다.");	

	}
	
	public static void main(String[] args) {
		
		try {
			register();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("등록할 ID를 입력하세요.");
//		String id = sc.nextLine();
//
//		
//		try {
//			if (id.length() > 8) { // 예외로 인식하고 싶음, 자바에서는 이거를 예외로 생각안하니까
//				throw new CheckIDException("ID는 최대 8글자만 가능합니다."); // CheckIDException에 매개변수를 가진 생성자를 추가해야함
////				throw new Exception("ID는 최대 8글자만 가능합니다."); // 체크 익셉션 클래스를 새로 만들어서 주석
//
//			}
//			System.out.println("ID를 등록하였습니다.");	
//		} catch (Exception e) {
//			e.printStackTrace();   //sysout(e.getmessage());
//			//sysout(e.getmessage());
//		}
//
////		입력받은 문자열의 길이를 확인해야함, 이런식으로 하면 되긴 하는데 예외 처리를 해보자
////		if(id.length()>8) {
////			System.out.println("ID는 최대 8글자만 가능합니다");
////		}else {
////			System.out.println("ID를 등록하였습니다.");			
////		}
//
//	}


