package Info;

public class PhoneUnivInfo extends PhoneInfo{
	String major;
	int year;
	
	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num); // super()�� �θ������ ȣ�� �޼���. ��ȣ������ �Ű����� �ѱ�
		this.major = major;
		this.year = year;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("���� : "+major);
		System.out.println("�г� : "+year);
	}
}
