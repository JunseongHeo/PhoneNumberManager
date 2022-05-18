// 버전3. 데이터 저장, 검색, 삭제 기능추가 
// 버전4. info클래스 개선. 데이터 그룹핑
package Execution;

public class PhoneBookVer4 {

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
		
			switch(choice) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
