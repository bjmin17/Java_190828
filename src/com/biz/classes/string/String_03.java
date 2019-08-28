package com.biz.classes.string;

public class String_03 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// 문자열의 길이(개수)를 확인해서
		// 변수 intLength 저장
		
		int intLength = strNation.length();
		char cSearch = 'u';
		int index = 0;

		// i 값이 0 ~ intLength - 1 이라는 것은
		// 0번째 부터 intLength - 1번째 까지 라는 조건
		// 만족하는 동안 반복 실행하겠다
		
		for(int i = 0; i < intLength ; i++) {
			char cA = strNation.charAt( i ); //대소문자 구분하고 싶으면 char 못 씀
			if(cA == cSearch) //cSearch 변수 사용해서 if 조건문 만듦
				System.out.println(i + "번 위치에 있음"); // 3번 위치에 있음
			
		}
	}
}
