package Info;

public class PhoneInfo {
	
	public String name; // 이름
	public String phoneNumber; // 전화번호
	
	// 생성자
	public PhoneInfo(String name, String num) {
		this.name = name;
		this.phoneNumber = num;
	}
	// 출력메서드
	public void showPhoneInfo() {
		System.out.println("----------------");
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phoneNumber);
	}
	
}
