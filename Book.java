package test;
// VO �뵵 : �� Ŭ�������� �ٸ� Ŭ������� �������� �Էµ� ���� ������ִ� �뵵 
public class Book {
	private String title;
	private String author;
	private int page;
// �� Ŭ�������� ����� ������ �����̺����� ���� 
	
	public Book() {
		super();
	}
// �� ����Ʈ ������ 
	
	public Book(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}
	// ���� �Ű������� ������ �����̺� ������ �㵵�� ������ ���� 

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
	// ���� �۰� �̸��� ���� ���ͼ��� �޼��带 ���� 
	
	

}
