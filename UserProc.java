package test;
// 비즈니스 로직 : 데이터베이스 연동 처리 부분  

/* (강사님이 내주신 문제 getLoginUser 만들어 보기 )
 * 조건 : 
 * 매개변수로 들어온 아이디 pororo,  비밀번호 1234 를 비교하여 맞으면 
 * entity 객채를 만들어서 setter를 통해서
 * id,pw,"뽀로로",89.97을 대입하세요 
 * entity 리턴을 진행함
 * 
 */
public class UserProc {
//User main 
	public User getLoginUser(String id, String pw) {
	  
		User entity = null; // 사용하고자하는 User 클래스에는 null을 잡아 줘야한다. (관행적인 형식) 
		// if문 밖에다 작성해야 한다고 하셨습니다. 
		if(id.equals("pororo") && pw.equals("1234")) {
			// 아이디를 pororo라고 치고 비밀번호도 1234가 맞아야 하기 때문에 &&(and) 연산자를 사용해야합니다.
			entity = new User(); 
			// 사용할 객체를 불러오고 
			entity.setId(id);
			// User 클래스에 setId 메서드에 pororo 저장 
			entity.setPw(pw);
			// User 클래스에 setPw 메서드에 1234 저장 
			entity.setName("뽀로로");
			// User 클래스에 setName 메서드에 "뽀로로" 라고 저장 
			entity.setPoint(89.97);
			// User 클래스에 setPoint 메서드에 89.97 라고 저장(포인트) 
		}
		return entity;
		// getLoginUser 메서드에 리턴값은 선언한 entity 객채의 내용을 리턴해주면 됩니다.
		
	}

}
