package Info;

public class PhoneInfo {
	
	public String name; // �̸�
	public String phoneNumber; // ��ȭ��ȣ
	
	// ������
	public PhoneInfo(String name, String num) {
		this.name = name;
		this.phoneNumber = num;
	}
	// ��¸޼���
	public void showPhoneInfo() {
		System.out.println("----------------");
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+phoneNumber);
	}
	
}
