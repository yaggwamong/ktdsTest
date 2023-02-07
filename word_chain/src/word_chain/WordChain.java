package word_chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordChain {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		List<String > wordList = new ArrayList<>();
		String startLetter = "";
		
		System.out.println("끝말잇기 시작	");
		while(true) {
			if(startLetter.equals("")) {
				System.out.println("시작 단어를 입력하세요.");	
			}
			else {//(!startLetter.equals(""))
				System.out.println("\""+ startLetter+ "\"로 시작하는 단어를 입력하세요.");
			}
			
			String word = scan.nextLine();
			word= word.trim(); //앞뒤 공백 삭제  
			word = word.replace(" ","");//띄어쓰기 삭제 //할당을 꼭 시켜주기!!
			
			if(word.length() < 3) {
				if(!word.startsWith(startLetter) || word.equals("포기")) { //startsWith대신 indexOf를 사용할 수 있다.
					System.out.println("\""+word + "\"를 입력했습니다.");  // word대신 null을 할당시키면 오류가 난다.
					System.out.println("게임이 종료됩니다.");
					break;
				}
				
				System.out.println("\""+word + "\"는"+word.length()+"글자입니다. 3글자 이상을 입력하세요");
				}
				else if (!word.startsWith(startLetter)||word.equals("포기")) {
					System.out.println("\""+word + "\"를 입력했습니다.");
					System.out.println("게임이 종료됩니다.");
					break;
				}
			
				else {
					wordList.add(word); //위에 잘못된게 없으면 단어리스트에 추가  
					startLetter= word.substring(word.length()-1); //글자 길이-1 해야 글자의 인덱스가 나온다. 
					
				   
				}
			
		}
		
		System.out.println("입력한 단어들은");
		for(String word : wordList) {
			System.out.println(word);
		}
		System.out.println("입니다.");
		
	}
}
