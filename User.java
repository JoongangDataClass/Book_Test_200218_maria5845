package test;

//Vo 
/*
 * -id : String 
 * -pw : String 
 * -name : String
 * -point : double 
 * +생성자 2개 
 * +ge,se 
 * 
 * 
 */
public class User {

     // 북클래스와 동일하게 생성한 유저 클래스 
	// 아이디 이름 비밀번호 포인트를 담기위해 만듬
	private String id;
	private String pw;
	private String name;
	private double point;

	public User() {
		super();
	}

	public User(String id, String pw, String name, double point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

}
