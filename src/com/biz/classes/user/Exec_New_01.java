package com.biz.classes.user;

public class Exec_New_01 {

	public static void main(String[] args) {
		
		// add() 메서드는 static 메서드이다
		User_01.add(); //70
		
		// 1. User_New_01 클래스를 un 객체로 선언
		// 2. new User_New_01() : 생성자 메서드
		//		un 객체를 사용할 수 있도록 초기화
		User_New_01 un = new User_New_01(); 
		un.add(); //나는 static이 없는 메서드, un. 하면 count가 보임, static이 있으면 클래스.메서드로 호출가능
		// static이 없으면 un이라 객체를 변수 선언하고, new 클래스()로 할당, 그 후 객체.메서드();로 실행
		// 1. 유형 : 성적처리할 때 1번째 호출 +100하고 2번째 호출 +100 하면 2번째 학생은 +200됨.(static 있을 때)
		// 성적처리 100명 -> Grade.calc() -> 저장소 저장
		// 2. 유형 (static 없는 Class는 필요한 만큼 복제 가능): 학생마다 Grade g1 = newGrade(); g1(객체명).calc()
		//		Grade g2 = newGrade(); g2(객체명).calc() , 매번 객체를 만들고
		// 학생명부는 static으로 만들고
		// 학생성적은 static 없이 그때그때 만들기
		/*
		 * 어떤 클래스에 있는 method에
		 * 	static 키워드가 붙어 있으면
		 * 클래스.method() 형식으로 호출하여 사용가능하지만
		 * 
		 * 
		 * static 키워드가 없는 method는 
		 * 객체를 생성하여 
		 * 객체.method() 형식으로 호출해야 한다.
		 * 
		 * 이 때, 객체는 클래스의 대리자(복제자)역할을 한다.
		 * 
		 */
		
	}

}
