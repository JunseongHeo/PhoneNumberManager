package MyException;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) { //선택지 이외의 숫자 선택
		super("잘못된 선택 하셨습니다.");
		wrongChoice = choice;
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice+"에 해당하는 선택은 존재하지 않습니다.");
	}
}
