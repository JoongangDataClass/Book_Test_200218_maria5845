package test;

import java.util.ArrayList;

public class BookProc {

	public ArrayList<Book> getList() {
		// ArrayList 유틸을 사용하여 Book 클래스에 내용을 담고
		// 매개변수를 입력할 getList 메서드를 생성
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("C++", "lee", 200);
		Book bk3 = new Book("jsp", "park", 300);
		// bk 객채를 만들어 객체안에 책이름 저자 페이지를 수 정보를 담음
		ArrayList<Book> list = new ArrayList();

		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
        //ArrayList<Book>안에 bk객체들을 차례대로 추가하는 작업 
		return list;
		//선언한 list 변수의 내용을 getList()메서드에 리턴시킴 
	}

}
