import java.util.Scanner;

public class PrintFClass {

	public static void main(String[] args) {

		//형식 문자열 출력
		/*
		 * 형식문자열 출력 이란, 특정 형식에 맞춰 출력해랴 하는 경우에 사용한다
		 * System.out.printf();
		 */
		//System.out.println("이름: " + name);
		//System.out.printf("이름: %s\n", name);
		
		/*
		 * 이름: %s --> 형식
		 * %s --> 지정자
		 * name --> 데이터
		 */
		
		// 이름 홍길동, 주소: 대전
		String uName = "홍길동";
		String uAddr = "대전";
		System.out.printf("이름: %s, 주소: %s", uName, uAddr);
		System.out.println();
		
		/*
		 * 지정자 종류
		 * %d	:정수형
		 * %f	:실수형
		 * %c	:문자형
		 * %s   :문자열
		 * %b
		 * 
		 * %o	:8진수형
		 * %x	:16진수형
		 * 
		 * %n	:개행
		 */
		
		
		System.out.printf("이름: %s, 나이: %s", "홍길동", 20);
		System.out.println();
		System.out.printf("10진수 123 --> 8진수 %o", 123);
		System.out.println();
		System.out.printf("결혼 유무 %b", false);
		
		// Q) 사용자 한테 이름 나이 몸무게 신장을 입력받아 출력하는 코드 작성하자
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름입력: ");
		String mName = scanner.nextLine();
		
		System.out.println("나이입력: ");
		int mAge = scanner.nextInt();
		
		System.out.println("몸무게입력: ");
		float mWeight = scanner.nextFloat();
		
		System.out.println("신장입력: ");
		double mHeight = scanner.nextDouble();
		
		System.out.printf("이름: %s, 나이: %d, 몸무게: %f, 신장: %f",
				           mName, mAge, mWeight, mHeight);
		
		scanner.close();
		
	}

}
