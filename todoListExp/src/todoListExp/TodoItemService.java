package todoListExp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoItemService {
	/*
	 * 아이템목록: List<TodoItem
	 */
   
	
	
	
	
	//상수
	//변수
	private List<TodoItemVO> todoItemList;
	
	//생성자
	public TodoItemService() {
		todoItemList=new ArrayList<>() ;
			
		}
	
	//Getter Setter

	public List<TodoItemVO> getTodoItemList(){
		return todoItemList;
	}
	public void setTodoItemLit(List<TodoItemVO> todoItemList) { //update 메소드를 위해 사용예정
		this.todoItemList=todoItemList; 
	}
	
	
	//Method
	/*
	 * 등록(String 아이템명): void
	 * 수정(int index,boolean isSuccess)
	 * 삭제 (int index)
	 * 조회 void
	 * 
	 */
	
	/**
	 * 등록
	 * @param itemName 아이템명
	 */
	public void create(String itemName) {
		todoItemList.add(new TodoItemVO(itemName));		
	}
		
	/**
	 * 수정
	 * @param index 수정할List Index
	 * @param isSuccess 완료여부
	 */
	public void update(int index,boolean isSuccess) {
		TodoItemVO todoItem = todoItemList.get(index); //두 메모리 주소가 같으니까 이렇게만 수정해도 된다. 
		todoItem.setSuccess(isSuccess);	
	}
	
	/**
	 * 삭제
	 * @param index 삭제할 List Index
	 */
	public void delete(int index) {
		todoItemList.remove(index);	
	}
	
	/**
	 * 조회 (모든 아이템을 조회한다.)
	 */
	public void read() {
		for(TodoItemVO todoItem:todoItemList) {
			String successSymbol = " ";
			if(todoItem.isSuccess()) {
				successSymbol = "X";
			}
			//String SuccessSymbol = todoItem.isSuccess() ? "X" : " "; //이러 방법도 있다~~ 4줄을 한줄로 - 삼항연산자
			System.out.println("[" +successSymbol+"] " +todoItem.getItemName());
		}
		System.out.println("총 "+todoItemList.size()+"개의 아이템이 조회 되었습니다.");
	}
	
	
	//main
	public static void main(String[] args) {
		TodoItemService service =new TodoItemService();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("TODO LIST");
		while(true) {
			System.out.println("=================");
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			System.out.println("=================");
			System.out.println("메뉴를 입력하세요" );
			
			int menu = scan.nextInt();//nextInt를 입력하면 엔터를 지우기 위해 nextLine을 사용한다. 
			scan.nextLine();// 엔터를 무시하는 코드
			
			if(menu==1) {
				System.out.println("TODO명을 입력하세요: ");
				String itemName= scan.nextLine();
				service.create(itemName);
				System.out.println("아이템이 등록되었습니다.");
				
			}
			
			else if(menu==2) {
				System.out.println("수정할 아이템 번호를 입력하세요.: ");
				int itemIndex = scan.nextInt();
				scan.nextLine();
				
				int listLength = service.getTodoItemList().size();
				//service.getTodoItemList().size() 0 itemIndex=0 모를수있다.하지만 <=로 에러가 나지않는다. 
				//service.getTodoItemList().isEmpty() 을 사용하면 비어있어도 에러가 나지안흔다. 
				if(service.getTodoItemList().isEmpty() || listLength<=itemIndex) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					System.out.println("아이템이 완료되었다면\"Y\"를 입력하세요:");
					String yn= scan.nextLine();
					boolean isY = yn.equalsIgnoreCase("Y");
					service.update(itemIndex,isY);
				//	service.update(itemIndex, yn.equalsIgnoreCase("Y"));
				//	service.update(itemIndex, yn.toUpperCase().equals("Y")); //내가 입력한 것을 다 대문자로 입력  많이 쓰임 
				//	service.update(itemIndex, yn.toLowerCase().equals("Y")); //이 셋중 한가지 사용 
					
					TodoItemVO todoItem= service.getTodoItemList().get(itemIndex);	
					if(isY) {
						System.out.println("["+todoItem.getItemName()+"] 이 완료되었습니다. ");
						
					}
					else {
						System.out.println("["+todoItem.getItemName()+"] 이 미완료되었습니다. ");
						
					}
					
				}
				
				
			}
			else if(menu==3) {
				System.out.println("삭제할 아이템 번호를 입력하세요: ");
				int itemIndex= scan.nextInt();
				scan.nextLine();
				
				int listLength = service.getTodoItemList().size();
				if(listLength<=itemIndex) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					service.delete(itemIndex);
					System.out.println("아이템이 삭제되었습니다.");
				}
				
	
			}
			else if(menu==4) {
				service.read();
	
			}
			else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
	
			}

		}
		
	}
}
