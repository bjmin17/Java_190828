package com.biz.classes.string;

import java.util.Scanner;

public class String_09 {

	/*
	 * strNation 에 저장된 문자열을 보여주고
	 * 한 개의 문자를 키보드로 입력받고
	 * 입력한 문자가 몇 번째 위치에 있는지를 찾아보기
	 * 단, 최초에 나타난 위치만 알고 싶다.
	 */
	public static void main(String[] args) {
		
		// 키보드에서 입력한 문자열을 가져오기 위한 도구
		Scanner scanner = new Scanner(System.in);
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		System.out.println("전체 문자열 : " + strNation); //전체 문자열 : Republic of Korea
		
		
		System.out.println("찾는 문자를 입력하세요");
		System.out.print("문자 >> ");
		String strSearch = scanner.nextLine();
		System.out.println("입력한 문자 : " + strSearch); //입력한 문자 : strSearch
		
		System.out.println("=============================");
		
		//문자열의 개수만큼 찾기를 반복하겠다
		for(int i = 0 ; i < intLength; i++) {
			
			// 1. strNation 문자열에서 0번부터 intLengh-1까지
			// 		한글자씩 추출
			String strAt = strNation.substring(i, i+1);
			
			// 2. 추출된 1개의 문자열과 키보드에서 입력한 문자열을
			// 	비교하기(같은가?)
			if(strAt.equalsIgnoreCase(strSearch)) {
				System.out.println(strSearch + "문자가 " + (i+1) + "번째에 위치해 있다."); // r문자가 1번째에 위치해 있다. r문자가 15번째에 위치해 있다.
				break; // for 반복문만 중단하라 // r문자가 1번째에 위치해있다.
			}
			
			
		}
				
		
	}
}

