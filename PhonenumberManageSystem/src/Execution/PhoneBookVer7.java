// 버전3. 데이터 저장, 검색, 삭제 기능추가 
// 버전4. info클래스 개선. 데이터 그룹핑
// 버전5. PhoneBookManager클래스 개선_인스턴스 하나만 생성되도록 제한, 입력 선택지 상수표현
// 버전6. 예외처리(1.초기메뉴선택에서 1~4 이외의 값을 입력하는 예외상황, 2.inputData 메서드에서 1~3이외의 값을 입력하는 예외상황)
// (현재)버전7. HashSet을 활용해 중복데이터 제한
package Execution;

import Interface.INIT_MENU;
import MyException.MenuChoiceException;

public class PhoneBookVer7 {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst(); // 생성자를 메서드로 호출
		int choice;
		
		while(true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				//예외던지기
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
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				// 예외가 발생하면 해당문구 출력후 while문에 의해 초기선택지 반복
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n"); 
			}
		}
	}
}
