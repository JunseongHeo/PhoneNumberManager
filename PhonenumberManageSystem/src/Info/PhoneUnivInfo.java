package Info;

public class PhoneUnivInfo extends PhoneInfo{
	String major;
	int year;
	
	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num); // super()는 부모생성자 호출 메서드. 괄호안으로 매개변수 넘김
		this.major = major;
		this.year = year;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+year);
	}
}
