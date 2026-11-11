package com.office.exception;

public class stringEx {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Hello");		
		System.out.println(stringBuffer);
		
		/*
		 * 문자열 추가
		 */
		
		stringBuffer.append("world");
		System.out.println(stringBuffer);
		
		/*
		 *  특정 위치에 문자열 추가
		 */
		
		stringBuffer.insert(5, "++");
		System.out.println(stringBuffer);
		
		/*
		 *  특정 범위 삭제 (5 ~ 10 이면 5부터 9까지 삭제)
		 */
		
		stringBuffer.delete(5, 10);
		
		
		/*
		 *  특정위치 문자 삭제
		 */
		
		stringBuffer.deleteCharAt(5);
		System.out.println(stringBuffer);
		
		/*
		 *  문자열 교체 (2 ~ 4 이면 2부터 3까지 문자 교체)
		 */
		
		stringBuffer.replace(2, 4, "LL");
		System.out.println(stringBuffer);
		
		/*
		 *  문자열 뒤집기
		 */
		
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		
		/*
		 * 문자열 길이
		 */
		
		int length = stringBuffer.length();
		System.out.println(length);
		
	}
	
}
