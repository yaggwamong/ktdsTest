package todoListExp;

public class TodoItemVO {
	/*
	 * 생성자: TodoItemVO(string 아이템명)
	 * 완료여부 : boolean (true일 경우는 완료,false는 미완료)
	 * 아이템명: String
	 */
	//ㅁㄴㅇㅁㄴㅇ
	// 상수
	// 변수
	/**
	 * 아이템명
	 */
	private String itemName;
	/**
	 * 완료여부
	 */
	private boolean isSuccess; //얘는 자동으로 false가 들어간다. 
	//생성자
	public TodoItemVO(String itemName) {
		setItemName(itemName);
		
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
	
}
