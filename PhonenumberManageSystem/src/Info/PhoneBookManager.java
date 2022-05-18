package Info;

public class PhoneBookManager {
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	
	public void inputData() {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = MenuViewer.keyboard.nextLine();
		System.out.print("생년월일 : ");
		String birth = MenuViewer.keyboard.nextLine();
		
		infoStorage[curCnt++] = new PhoneInfo(name, phoneNumber, birth);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	public void searchData() {
		System.out.println("데이터 검색을 시작합니다..");
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx<0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx<0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			for (int idx = dataIdx; idx<(curCnt-1); idx++) {
				infoStorage[idx] = infoStorage[idx+1];
			}
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
		
		
	}
	private int search(String name) {
		for(int idx = 0; idx<curCnt; idx++) {
			PhoneInfo curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name) == 0) {
				return idx;
			}
		}
		return -1;
	}
}
