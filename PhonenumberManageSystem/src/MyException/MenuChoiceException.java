package MyException;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) { //������ �̿��� ���� ����
		super("�߸��� ���� �ϼ̽��ϴ�.");
		wrongChoice = choice;
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice+"�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}
