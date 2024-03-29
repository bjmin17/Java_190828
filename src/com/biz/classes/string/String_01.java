package com.biz.classes.string;

public class String_01 {

	public static void main(String[] args) {

		/*
		 * 1. strNation 문자열 변수 선언
		 * 2. "Republic of Korea" 문자열 할당(저장)
		 * 3. strNation 문자열에서 소문자'u'가 몇 번째에 위치하고 있는지 찾으시오.
		 * 단, 시작 위치는 0부터 시작합니다
		 */
		
		/*
		 * strNation 문자열 중에서 u라는 문자가 몇번째 위치에 있나?
		 */
		String strNation = new String();
		strNation = "Republic of Korea";

		int intLength = strNation.length(); // 위치값을 알아내

		for (int i = 0; i < intLength; i++) {// 기 위한 과정
			char cA = strNation.charAt(i);
			if (cA == 'u') {
				System.out.println(cA + "라는 글자가 " + (i+1)+ "번째에 있다");//u라는 글자가 4번째에 있다
			}
		}
		
		strNation = "Republic of Korea";
		intLength = strNation.length();
		
		// 'R' 이 cA 변수에 담길 것
		char cA = strNation.charAt(0);
		if(cA == 'u')
			System.out.println("0 번 위치에 있음");
		
		cA = strNation.charAt(1);
		if(cA == 'u')
			System.out.println("1 번 위치에 있음");
		
		cA = strNation.charAt(2);
		if(cA == 'u')
			System.out.println("2 번 위치에 있음");
		
	}

}
