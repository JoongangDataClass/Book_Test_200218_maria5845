
package test;

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		
		//---------- �Ʒ����� ������ �Է��ϴ� �ڵ�--------------------------
		Scanner sc = new Scanner(System.in); // �Է��� �����ִ� ��ƿ ��ĳ�ʸ� ����
		String id; // ����� id ���� ����
		String pw; // ����� pw ���� ����

		System.out.print("ID�� �Է��ϼ��� : ");
		id = sc.next(); // �Է¹��� ���̵� id ������ �����մϴ�. 
		System.out.print("PW�� �Է��ϼ��� : ");
		pw = sc.next(); // �Է¹��� �н����带 pw ������ �����մϴ�. 

       
        //------- �Ʒ����� �Է¹��� ���� �˻��ϴ� �ڵ�----------------------		
		
		
		// �Է°� �˻� UserProc���� �˻縦 �����Ѵ�
		
		UserProc up = new UserProc(); 
		// UserProc Ŭ������ ����ϱ� ���� up ��ü����(Ÿ���� UserProc) 
		// �� �κ� ������ ��� �ؾ����� ��Ƴ׿�;; - ���� ���� ��� - 
		
		User entity = up.getLoginUser(id, pw);
		// User Ŭ���� ����� ���� entity ��� ������ ���� 
		// UserProc�� getLofinUser �޼��带 ����� �Ű� ���� id�� pw�� �޴´�

		
        //------------ �Ʒ����� �Է¹��� ���� ����ϴ� �ڵ� ---------------
		if (entity != null) { // entity ���� null ���� �ƴϸ� �Ʒ��� ����� 
			
		// �̸��� ���� ����Ʈ�� ����Ѵ�   
			System.out.println("\n");
			System.out.println(entity.getName() + " ���� �����ϼ̽��ϴ�.");
			System.out.println("���� ����Ʈ�� " + entity.getPoint() + "�� �Դϴ�. \n");
                  
		 // ��Ŭ������ ������ ���� �ޱ� ���� ��ü�� ���� 
			BookProc book = new BookProc();
		
		//  ��Ŭ�������� å������ ���� ArryList�� �����Ѱ� list�� ��´� 
		//  list �������� BookProc �ȿ� �ִ� getList �޼��� ������ �ҷ��� ��´� 
			ArrayList<Book> list = book.getList();
		
			System.out.println("[[å ��������]]");
			System.out.println("\n");
			
			
		// ���� for���� ���ؼ�  list�� ����� å ������ ����Ѵ� 	
			for (Book ob : list ) {
				System.out.println("å�̸� : " +ob.getTitle());
				System.out.println("å���� : " +ob.getAuthor());
				System.out.println("������ : " +ob.getPage()); 
				System.out.println("\n");
			}

		} else {
			// entity ���� null ���̸� ���̵�� �н����带 �ٽ� ġ���� �Ѵ�. 
			System.out.println("ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID �Դϴ�.");
		}

	}

}
