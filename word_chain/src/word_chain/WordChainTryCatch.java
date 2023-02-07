package word_chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordChainTryCatch {
	
	public static void checkWord(String word,String startLetter) {
		if(!word.startsWith(startLetter) || word.equals("포기")){
			throw new  WrongWordException();	
		}
		else if (word.length()<3){
			throw new InvalidWordException();
		}
	}
	

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
			
			try {
				checkWord(word,startLetter);
				wordList.add(word);
				startLetter = word.substring(word.length()-1);
			}
			catch (InvalidWordException iwe) {
				System.out.println(word+ " 는 "+ word.length() + "자리 단어입니다.");
				System.out.println("3자리 이상의 단어를 입력하세요");
				
			}
			catch(WrongWordException wwe) {
				System.out.println(word+" 을 입력했습니다. 게임을 종료합니다.");
				break;
			}

			
		}
		
		System.out.println("입력한 단어들은");
		for(String word : wordList) {
			System.out.println(word);
		}
		System.out.println("입니다.");
		
	}
}
