package com.biz.classes.string;

public class String_07 {

	public static void main(String[] args) {
		
		//char 대신 대소문자 구분 가능하게 문자열로 찾는 방법, substring 이용
		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
		int index = 0;

		for(int i = 0 ; i < intLength ; i++) {
			String strAt = strNation.substring(i, i+1);
			if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(i + " 번째 위치에서 찾음"); //0번째 위치에서 찾음, 14번째 위치에서 찾음
		}
	}
}
