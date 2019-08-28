package com.biz.classes.string;

public class String_New_12 {

	public static void main(String[] args) {

		String s1 = "Korea"; //일반적인 변수 선언 방법
		String s2 = "Korea";
		
		String n1 = new String("Korea"); //new String이라는 생성자를 이용해 변수 만듦
		String n2 = new String("Korea");
		
		
		boolean bYes = s1 == s2;
		System.out.println("s1 == s2 : " + bYes); //s1 == s2 : true, 두 객체가 같은 저장소에 있냐?
		
		bYes = n1 == n2;
		System.out.println("n1 == n2 : " + bYes); //false, 두 객체가 같은 저장소에 있냐?
		
		// 옳은 비교예시, if(100%가 와야함) else (100%이외의 값), 절대 문자열 비교할 때 == 이용 안하기
		bYes = n1.equals(n2);
		bYes = n1.equalsIgnoreCase(n2);
		
		
	}

}
