package test;

import java.util.ArrayList;

public class BookProc {

	public ArrayList<Book> getList() {
		// ArrayList ��ƿ�� ����Ͽ� Book Ŭ������ ������ ���
		// �Ű������� �Է��� getList �޼��带 ����
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("C++", "lee", 200);
		Book bk3 = new Book("jsp", "park", 300);
		// bk ��ä�� ����� ��ü�ȿ� å�̸� ���� �������� �� ������ ����
		ArrayList<Book> list = new ArrayList();

		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
        //ArrayList<Book>�ȿ� bk��ü���� ���ʴ�� �߰��ϴ� �۾� 
		return list;
		//������ list ������ ������ getList()�޼��忡 ���Ͻ�Ŵ 
	}

}
