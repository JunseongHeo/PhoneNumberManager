package Info;

public class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num); // super()�� �θ������ ȣ�� �޼���. ��ȣ������ �Ű����� �ѱ�
		this.company = company;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("ȸ�� : "+company);
	}
}
