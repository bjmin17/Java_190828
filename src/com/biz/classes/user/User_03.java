package com.biz.classes.user;

public class User_03 {
	
	public static void count() {
		// count() 메서드가 호출될때마다
		// ncount는 새로 생성이 되고 0으로 clear
		int nCount = 0;
		nCount ++;
		System.out.println(nCount + "번째 호출"); // 출력없음, 호출될때 1번째 호출 ~ 1번째 호출
		
	}
}
