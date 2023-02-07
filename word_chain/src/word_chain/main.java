package word_chain;

import java.util.Arrays;
import java.util.List;

public class main {
	

	
	public static void main(String[] args) {
		String str = "      값 값 값        ";  // 모두 재할당을 해야 변한다 
		
		//문자열에서 좌우공백 제거하기 .trim
		str= str.trim();
		System.out.println("변경된 값은 ["+ str+ "] 입니다.");
		
		System.out.println();
		//문자열에서 텍스트 변경하기 .replace / .replaceAll
		str = str.replace(" ", "_");
		System.out.println("변경된 값은 ["+ str+ "] 입니다.");
		
		str = str.replaceAll("_", "-");
		System.out.println("변경된 값은 ["+ str+ "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다. </html>";
		str = str.replaceAll("[가-힣]", "");
		System.out.println("변경된 값은 ["+ str+ "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다. </html>";
		str = str.replaceAll("[^가-힣]", "");// [] 범위 지정자 ^ 범위 빼고 [a-zA-Z] 모든 영어 공백도 없애고 싶으면 [a-zA-Z ] [0-9] 숫자 
		System.out.println("변경된 값은 ["+ str+ "] 입니다.");
		
		str = "<html>HTML 문서를 작성합니다. </html>";
		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("변경된 값은 ["+ str+ "] 입니다.");
		
		str = "핸드폰 번호는 010-1234-5678 입니다.";
		str= str.replaceAll("[^0-9]","");
		System.out.println("변경된 값은 ["+ str+ "] 입니다.");
		
		System.out.println();
		//문자열에서 특정 단어로 시작하는지 확인하기 .indexOf 
		str = "자전거";
		System.out.println("자 의 자리: " + str.indexOf("자"));
		System.out.println("전 의 자리: " + str.indexOf("전"));
		System.out.println("거 의 자리: " + str.indexOf("거"));
		System.out.println("충 의 자리: " + str.indexOf("충"));
		
		if(str.indexOf("자")==0	) { //statWith를 못쓸 경우 
			System.out.println("자전거는 \"자\"로 시작합니다. ");
			
		}	
		
		System.out.println();
		//문자열에서 특정 단어로 시작하는지 확인하기 .startWith
		System.out.println("자전거가 \"자\"로 시작하나요?"+str.startsWith("자"));
		System.out.println("자전거가 \"전\"로 시작하나요?"+str.startsWith("전"));
		System.out.println("자전거가 \"거\"로 시작하나요?"+str.startsWith("거"));
		
		
		System.out.println();
		//문자열에서 특정 단어로 끝나는지 확인하기 .lastIndexOf
		str = "기러기";
		System.out.println("기러기 \"기\"의 자리는? (indexOf) " + str.indexOf("기"));
		System.out.println("기러기 \"기\"의 자리는? (lastIndexOf) " + str.lastIndexOf("기"));
		System.out.println(str.length());
		System.out.println("기러기는 \"기\"로 끝나나요? "+(str.lastIndexOf("기")==str.length()-1));
		
		System.out.println();
		//문자열에서 특정 단어로 끝나는지 확인하기 .endsWith //더 간편하다
		System.out.println("거중기는 \"거\"로 끝나나요? "+str.endsWith("거"));
		System.out.println("거중기는 \"중\"로 끝나나요? "+str.endsWith("중	"));
		System.out.println("거중기는 \"기\"로 끝나나요? "+str.endsWith("기"));
		
		System.out.println();
		//문자열에서 특정 단어 및 글자가 포함되어 있는지 확인하기 .indexOf -1이 아니면 된다. contain 없을때는 이거 쓴다. 
		str = "자전거";
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? "+ (str.indexOf("자") > -1));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? "+ (str.indexOf("전") > -1));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? "+ (str.indexOf("거") > -1));
		System.out.println("자전거에는 \"충\"가 포함되어 있나요? "+ (str.indexOf("충") > -1));
		
		System.out.println();
		//문자열에 특정 단어 및 글자가 포함되어 있는지 확인하기 .contains
		str = "자전거";
		System.out.println("자전거에는 \"자\"가 포함되어 있나요? "+ (str.contains("자")));
		System.out.println("자전거에는 \"전\"가 포함되어 있나요? "+ (str.contains("전")));
		System.out.println("자전거에는 \"거\"가 포함되어 있나요? "+ (str.contains("거")));
		System.out.println("자전거에는 \"충\"가 포함되어 있나요? "+ (str.contains("충")));
		
		System.out.println();
		//문자열 자르기 .substring(p)
		str = "2023-02-03";
		String day = str.substring(8);
		System.out.println(day);
		
		System.out.println();
		//문제
		str = "2023-02-03";
		day = str.substring(5).replace("-","");
		System.out.println(day);
		
		System.out.println();
		//문자열 자르기 .substring(p,p)
		str = "2023-02-03 11:01:15";
		//     0123456789012345678
		String year = str.substring(0, 4);
		String month = str.substring(5, 7);
		String date =str.substring(8,10); 
		String hour = str.substring(11, 13);
		String min = str.substring(14, 16);
		String sec = str.substring(17, 19);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		System.out.printf("%s년 %s월 %s일 %s시 %s분 %s초\n",year,month,date,hour,min,sec);
		
		
		System.out.println();
		//문자열 특정 단어 및 기호 등으로 자르기 .split
		str = "자전거,거중기,기러기"; // 
		str.split(","); //배열로 출력 하지만 배열은 왠만하면 피하는게 좋다 그래서 리스트로 넣는게 좋다 .
		List <String> wordList= Arrays.asList(str.split(",")); // 따라서 배열을 리스트로 스트링의 리스트타임 
		for(String word: wordList) {
			System.out.println(word.trim());
		}
		
		str = "2023-02-22 11:22:34"; //날짜들 뽑아서 쓸떄 subString 대신 이걸 애용한다. 
		List <String > dataList = Arrays.asList(str.split("[- :]"));
		for(String dateItem: dataList) {
			System.out.println(dateItem);
		}
		System.out.printf("%s년 %s월 %s일 %s시 %s분 %s초\n",dataList.get(0), dataList.get(1)
														,dataList.get(2), dataList.get(3)
														,dataList.get(4), dataList.get(5));
		
		String url = "https://www.google.co.kr"; 
//		              012345678901234567890123   :// 구분자 
	
		System.out.println(url.indexOf("://"));
		
		String protocol = url.substring(0,url.indexOf("://"));
		System.out.println("Protocol: "+ protocol);
		
		String subDomain = url.substring(url.indexOf("://")+"://".length(), url.indexOf("."));
		System.out.println("Sub domain: "+ subDomain); 
		// .의 정확한 위치는 구분은 못한다. 그땐 split과 index를  이용해야한다.
		
		String domain = url.substring(url.indexOf(subDomain)+subDomain.length()+1); 
		//인덱스의 첫번째 글자를 더해주기 때문에 그 단어의 길이 만큼 더해 준다.
		domain = domain.substring(0,domain.indexOf("."));
		System.out.println("Domain: "+ domain);
		
		String companyCode = url.substring(url.indexOf(domain)+domain.length()+1);
		companyCode = companyCode.substring(0,companyCode.indexOf("."));
		System.out.println("Compay code: " + companyCode);
	
//		String nationCode = url.substring(url.indexOf(companyCode)+companyCode.length()+1);
//    System.out.println("Nation Code: " + nationCode);
		
		String nationCode = url.substring(url.lastIndexOf(".")+1);
		System.out.println("Nation code: " + nationCode);
		
	}
}
