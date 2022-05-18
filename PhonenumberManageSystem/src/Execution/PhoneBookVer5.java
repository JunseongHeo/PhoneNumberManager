// 버전3. 데이터 저장, 검색, 삭제 기능추가 
// 버전4. info클래스 개선. 데이터 그룹핑
// (현재)버전5. PhoneBookManager클래스 개선_인스턴스 하나만 생성되도록 제한, 입력 선택지 상수표현
package Execution;

import Interface.INIT_MENU;

public class PhoneBookVer5 {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst(); // 생성자를 메서드로 호출
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
