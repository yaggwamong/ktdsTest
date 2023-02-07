package todoList;

public class TodoItemVO {
	/**
	 * 순서
	 */
	//private int index;
	/**
	 * 아이템 명
	 */
	private String item;
	private boolean isYN;
	
	public TodoItemVO(String item) {//생성자 이름은 class 이름과 똑같이 
		setItem(item);
	}

	/*public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}*/

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public boolean isYN() {
		return isYN;
	}

	public void setYN(boolean isYN) {
		this.isYN = isYN;
	}
	
	

}
