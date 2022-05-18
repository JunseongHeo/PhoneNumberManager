package Info;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num); // super()는 부모생성자 호출 메서드. 괄호안으로 매개변수 넘김
		this.company = company;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("회사 : "+company);
	}
}
