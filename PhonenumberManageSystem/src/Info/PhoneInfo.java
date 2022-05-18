package Info;

public class PhoneInfo {
	
	public String name; // 이름
	public String phoneNumber; // 전화번호
	public String birth; // 생년월일
	
	// 생성자
	public PhoneInfo(String name, String phoneNumber, String birth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	// 생년월일 모를때 나머지 정보만 입력
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	// 출력메서드
	public void showPhoneInfo() {
		System.out.println("----------------");
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phoneNumber);
		if (birth != null) {
			System.out.println("생년월일 : "+birth);
		}
		System.out.println("----------------");
	}
	
}
