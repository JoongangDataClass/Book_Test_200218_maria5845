package test;
// VO 용도 : 북 클래스에서 다른 클래스들과 메인으로 입력된 값을 출력해주는 용도 
public class Book {
	private String title;
	private String author;
	private int page;
// 북 클래스에서 사용할 변수를 프라이빗으로 선언 
	
	public Book() {
		super();
	}
// 북 디폴트 생성자 
	
	public Book(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}
	// 받은 매개변수를 선언한 프라이빗 변수에 담도록 생성자 선언 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	// 제목 작가 이름을 담을 게터세터 메서드를 만듬 
	
	

}
