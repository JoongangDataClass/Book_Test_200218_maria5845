package test;
// ����Ͻ� ���� : �����ͺ��̽� ���� ó�� �κ�  

/* (������� ���ֽ� ���� getLoginUser ����� ���� )
 * ���� : 
 * �Ű������� ���� ���̵� pororo,  ��й�ȣ 1234 �� ���Ͽ� ������ 
 * entity ��ä�� ���� setter�� ���ؼ�
 * id,pw,"�Ƿη�",89.97�� �����ϼ��� 
 * entity ������ ������
 * 
 */
public class UserProc {
//User main 
	public User getLoginUser(String id, String pw) {
	  
		User entity = null; // ����ϰ����ϴ� User Ŭ�������� null�� ��� ����Ѵ�. (�������� ����) 
		// if�� �ۿ��� �ۼ��ؾ� �Ѵٰ� �ϼ̽��ϴ�. 
		if(id.equals("pororo") && pw.equals("1234")) {
			// ���̵� pororo��� ġ�� ��й�ȣ�� 1234�� �¾ƾ� �ϱ� ������ &&(and) �����ڸ� ����ؾ��մϴ�.
			entity = new User(); 
			// ����� ��ü�� �ҷ����� 
			entity.setId(id);
			// User Ŭ������ setId �޼��忡 pororo ���� 
			entity.setPw(pw);
			// User Ŭ������ setPw �޼��忡 1234 ���� 
			entity.setName("�Ƿη�");
			// User Ŭ������ setName �޼��忡 "�Ƿη�" ��� ���� 
			entity.setPoint(89.97);
			// User Ŭ������ setPoint �޼��忡 89.97 ��� ����(����Ʈ) 
		}
		return entity;
		// getLoginUser �޼��忡 ���ϰ��� ������ entity ��ä�� ������ �������ָ� �˴ϴ�.
		
	}

}
