package store;

/**
 * 실행 클래스 
 * @author User
 *
 */
public class Main {
	
	Store store = new Store();	//인스턴트 필드로 바꾸면 에러 static때문
	
	public static void main(String[] args) {
		
		Main main =new Main();		
		main.store.addProducts();		
		main.store.checkQuantity();
	}

}
