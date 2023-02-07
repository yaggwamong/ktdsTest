package todoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





/**
 * TODO 아이템 리스트
 * @author User
 *
 */
public class TodoItemService {
	
	private List <TodoItemVO> itemList;
	
    //생성자
	public TodoItemService() {
		itemList= new ArrayList<>();
		
	}

	public List<TodoItemVO> getItemList() {
		return itemList;
	}

	public void setItemList(List<TodoItemVO> itemList) {
		this.itemList = itemList;
	}
	
	
	public void create(String item) {
		itemList.add(new TodoItemVO(item));
	}
	
	public void update(int index,boolean YN) {
		if(itemList.size() <= index) {
			System.out.println("아이템이 존재하지 않습니다.");
		}
		TodoItemVO itemVO= itemList.get(index);
		itemVO.setYN(YN);
		System.out.println(itemVO);
		
		
		
		
	}
	public void delete(int index) {//
		if(itemList.size() <= index) {
			System.out.println("아이템이 존재하지 않습니다.");
		}
		itemList.remove(index);
	}

	public void read() {
		for(int i = 0 ;i<itemList.size();i+=1) {
			TodoItemVO itemVO = itemList.get(i);
			String a = " ";
			if(itemVO.isYN()) {
				a= "x";
			}		
			System.out.println("["+ a + "] 아이템명: "+ itemVO.getItem());	
		}
		System.out.println(itemList.size()+"개의 아이템이 조회되었습니다.");
	}
	





	public static void main(String[] args) {
		TodoItemService itemService = new TodoItemService();

		Scanner scan= new Scanner(System.in);
		while(true) {
			System.out.println("=================");
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			System.out.println("=================");
			
			int menu =scan.nextInt();
			scan.nextLine();// 엔터를 날려버리는 
			
			if(menu==1) {
				//등록
				System.out.println("TODO 명을 입력하세요: ");
				String item=scan.nextLine();

				itemService.create(item);
				System.out.println("아이템이 등록됐습니다.");
			}
			else if(menu==2) { /////////
				//수정
				System.out.println("수정할 아이템 번호를 입력하세요:");
				int index=scan.nextInt();
				scan.nextLine();
				System.out.println("아이템이 완료되었다면\"Y\"를 입력하세요:");
				String a= scan.nextLine();
				itemService.update(index, a.equals("Y"));
				if(a.equals("Y")) {
					System.out.println("[아이템명]이 완료되었습니다.");
				}
				else {
					System.out.println("[아이템명]이 미완료되었습니다.");
				}
				
				
			}
			else if(menu==3) {
				//삭제
				int index =scan.nextInt();
				scan.nextLine();
				itemService.delete(index);
				
			}
			else if(menu==4) {
				//조회
				itemService.read();
				
				
				System.out.println("모든 게시글을 조회했습니다.");
			}
			else {
				//종료
				System.out.println("프로그램이 종료 되었습니다.");
				break;
		}
			
		}
		
		
		
		
	}
}
