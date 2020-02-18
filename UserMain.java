
package test;

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		
		//---------- 아래부터 변수에 입력하는 코드--------------------------
		Scanner sc = new Scanner(System.in); // 입력을 도와주는 유틸 스캐너를 생성
		String id; // 사용할 id 변수 생성
		String pw; // 사용할 pw 변수 생성

		System.out.print("ID를 입력하세요 : ");
		id = sc.next(); // 입력받은 아이디를 id 변수에 저장합니다. 
		System.out.print("PW를 입력하세요 : ");
		pw = sc.next(); // 입력받은 패스워드를 pw 변수에 저장합니다. 

       
        //------- 아래부터 입력받은 값을 검사하는 코드----------------------		
		
		
		// 입력값 검사 UserProc에서 검사를 진행한다
		
		UserProc up = new UserProc(); 
		// UserProc 클래스를 사용하기 위해 up 객체생성(타입은 UserProc) 
		// 이 부분 설명을 어떻게 해야할지 어렵네요;; - 설명 수정 요망 - 
		
		User entity = up.getLoginUser(id, pw);
		// User 클래스 사용을 위해 entity 라는 변수를 선언 
		// UserProc에 getLofinUser 메서드를 만들고 매개 변수 id와 pw를 받는다

		
        //------------ 아래부터 입력받은 값을 출력하는 코드 ---------------
		if (entity != null) { // entity 값이 null 값이 아니면 아래를 출력함 
			
		// 이름과 현재 포인트를 출력한다   
			System.out.println("\n");
			System.out.println(entity.getName() + " 님이 입장하셨습니다.");
			System.out.println("현재 포인트는 " + entity.getPoint() + "점 입니다. \n");
                  
		 // 북클래스에 정보를 전달 받기 위해 객체를 생성 
			BookProc book = new BookProc();
		
		//  북클래스에서 책정보를 담을 ArryList를 생성한고 list에 담는다 
		//  list 변수에는 BookProc 안에 있는 getList 메서드 정보를 불러서 담는다 
			ArrayList<Book> list = book.getList();
		
			System.out.println("[[책 정보보기]]");
			System.out.println("\n");
			
			
		// 향상된 for문을 통해서  list에 담겨진 책 정보를 출력한다 	
			for (Book ob : list ) {
				System.out.println("책이름 : " +ob.getTitle());
				System.out.println("책저자 : " +ob.getAuthor());
				System.out.println("페이지 : " +ob.getPage()); 
				System.out.println("\n");
			}

		} else {
			// entity 값이 null 값이면 아이디랑 패스워드를 다시 치도록 한다. 
			System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 ID 입니다.");
		}

	}

}
