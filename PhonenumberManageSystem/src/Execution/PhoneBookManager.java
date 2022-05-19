package Execution;

import Info.PhoneInfo; // 다른패키지의 클래스 수입
import Info.PhoneUnivInfo;
import Info.PhoneCompanyInfo;
import Interface.INPUT_SELECT;
import MyException.MenuChoiceException;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
//	final int MAX_CNT = 100; // final로 상수취급. 초기화한 값 그대로 사용
//	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT]; // 폰인포 객체배열
//	int curCnt = 0; // 객체배열 인덱스
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>(); 
	
	// 인스턴스를 하나만 생성하도록 제한
	static PhoneBookManager inst=null;
	public static PhoneBookManager createManagerInst() {
		if ( inst == null) {
			inst = new PhoneBookManager();
		}
		return inst;
	}
	
	private PhoneBookManager() {}
	
	// 생성자 초기화 메서드
	private PhoneInfo readFriendInfo() { // 일반친구
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}
	private PhoneInfo readUnivFriendInfo() { // 대학친구
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("전공 : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("학년(1/2/3/4) : ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	private PhoneInfo readCompanyFriendInfo() { // 회사친구
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("회사 : ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}
	// 데이터 입력
	public void inputData() throws MenuChoiceException {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1. 일반, 2. 대학, 3.회사");
		System.out.print("선택>>");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null; // 객체 생성
		
		// 예외 던지기
		if(choice<INPUT_SELECT.NORMAL || choice>INPUT_SELECT.COMPANY) 
			throw new MenuChoiceException(choice);
		
		switch (choice) { // 선택한 번호에 따라 생성자 초기화 메서드 호출
		case INPUT_SELECT.NORMAL: 
			info=readFriendInfo();
			break;
		case INPUT_SELECT.UNIV: 
			info=readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY: 
			info=readCompanyFriendInfo();
			break;
		}
		
//		infoStorage[curCnt++] = info; // 작성된 인스턴스를 객체배열에 저장
		boolean isAdded = infoStorage.add(info);
		if(isAdded == true) {
			System.out.println("데이터 입력이 완료되었습니다.");
		} else {
			System.out.println("이미 저장된 데이터입니다.");
		}
	}
	// 데이터 검색
	public void searchData() {
		System.out.println("데이터 검색을 시작합니다..");
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
//		int dataIdx = search(name);
//		if(dataIdx<0) {
//			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
//		} else {
//			infoStorage[dataIdx].showPhoneInfo();
//			System.out.println("데이터 검색이 완료되었습니다. \n");
//		}
		PhoneInfo info = search(name);
		if(info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		} else {
			info.showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
		
	}
	// 데이터 삭제
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
//		int dataIdx = search(name);
//				if(dataIdx<0) {
//			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
//		} else {
//			for (int idx = dataIdx; idx<(curCnt-1); idx++) {
//				infoStorage[idx] = infoStorage[idx+1];
//			}
//			curCnt--;
//			System.out.println("데이터 삭제가 완료되었습니다.");
//		}
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while(itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if(name.compareTo(curInfo.name) == 0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료되었습니다.");
				return;
			}
		}
	}
	private PhoneInfo search(String name) {
//		for(int idx = 0; idx<curCnt; idx++) {
//			PhoneInfo curInfo = infoStorage[idx]; // 서치용 객체 생성해서 데이터 넣기
//			// 검색할 이름과 infoStroage에 저장된 이름을 비교
//			if(name.compareTo(curInfo.name) == 0) { // compareTo()메서드 -1크다, 0같다, 1작다
//				return idx; // 이름이 같은 인스턴스의 인덱스 반환
//			}
//		}
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if(name.compareTo(curInfo.name) == 0) {
				return curInfo;
			}
		}
		return null;
	}
}
