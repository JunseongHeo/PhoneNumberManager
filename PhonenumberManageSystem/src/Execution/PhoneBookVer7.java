// ����3. ������ ����, �˻�, ���� ����߰� 
// ����4. infoŬ���� ����. ������ �׷���
// ����5. PhoneBookManagerŬ���� ����_�ν��Ͻ� �ϳ��� �����ǵ��� ����, �Է� ������ ���ǥ��
// ����6. ����ó��(1.�ʱ�޴����ÿ��� 1~4 �̿��� ���� �Է��ϴ� ���ܻ�Ȳ, 2.inputData �޼��忡�� 1~3�̿��� ���� �Է��ϴ� ���ܻ�Ȳ)
// (����)����7. HashSet�� Ȱ���� �ߺ������� ����
package Execution;

import Interface.INIT_MENU;
import MyException.MenuChoiceException;

public class PhoneBookVer7 {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst(); // �����ڸ� �޼���� ȣ��
		int choice;
		
		while(true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				//���ܴ�����
				if(choice<INIT_MENU.INPUT || choice>INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
			
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
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				// ���ܰ� �߻��ϸ� �ش繮�� ����� while���� ���� �ʱ⼱���� �ݺ�
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.\n"); 
			}
		}
	}
}
