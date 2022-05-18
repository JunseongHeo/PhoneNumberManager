// ����3. ������ ����, �˻�, ���� ����߰� 
// ����4. infoŬ���� ����. ������ �׷���
// (����)����5. PhoneBookManagerŬ���� ����_�ν��Ͻ� �ϳ��� �����ǵ��� ����, �Է� ������ ���ǥ��
package Execution;

import Interface.INIT_MENU;

public class PhoneBookVer5 {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst(); // �����ڸ� �޼���� ȣ��
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
		
			switch(choice) {
			case INIT_MENU.INPUT:
				manager.inputData();
				break;
			case INIT_MENU.SEARCH:
				manager.searchData();
				break;
			case INIT_MENU.DELETE:
				manager.deleteData();
				break;
			case INIT_MENU.EXIT:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
