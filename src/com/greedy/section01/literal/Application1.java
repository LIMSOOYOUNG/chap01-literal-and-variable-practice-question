package com.greedy.section01.literal;

public class Application1 { // 클래스 선언부 (파일의 이름과 반드시 동일해야함.)
	public static void main(String[] args) { // 메인 메소드 (프로그램의 시작점.)
		
		/*여러가지 값의 형태를 출력
		 * 1. 숫자형태의 값
		 * 1-1. 정수 형태의 값
		 * 1-2. 실수 형태의 값
		 * 2. 문자 형태의 값
		 * 3. 문자열 형태의 값
		 * 4. 논리 형태의 값*/
			
		/*1. 숫자형태의 값
		  1-1. 정수 형태의 값*/
		System.out.println(123);
		/*1-2. 실수 형태의 값*/
		System.out.println(1.23);
		
		/*2. 문자 형태의 값*/
		System.out.println('a'); 		// 단수형 문자. 
//		System.out.println('ab'); 		2개 이상의 문자는  문자로 취급하지 않기 때문에 에러가 발생한다. 
//		System.out.println('');			또는 아무 문자도 기록하지 않는 경우 에러가 발생한다.
//		System.out.println('1');		숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자'1'이라고 판단한다.
		
		/*3. 문자열 형태의 값*/
		System.out.println("안녕하세요"); 	// 문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표로 감싸주어야한다.
		System.out.println("123");	   	// 정수 이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 인식한다.		
		System.out.println(""); 		// 아무 값도 없는 빈 쌍따옴표도 문자열로 인식한다.
		System.out.println("a"); 	   // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다.(문자 a와는 다르다.)
		
		/*4. 논리 형태의 값*/
		System.out.println(true);		// true 혹은 false 값을 논리형 이라고 한다.
		System.out.println(false);
	
	
	
	}
}
