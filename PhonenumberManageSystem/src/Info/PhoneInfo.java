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
	public int hashCode() {
		return name.hashCode(); // �ؽ��ڵ� ��ȯ
	}
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo) obj;
		if(name.compareTo(cmp.name) == 0)  { // ������ 0.
			return true;
		} else {
			return false;
		}
	}
	
	
}
