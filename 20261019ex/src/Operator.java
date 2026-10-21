
public class Operator {

	public static void main(String[] args) {
		
		/*
		 *  연산자 (Operator)
		 *  산술 연산자, 대입(복합) 연산자, 비교 연산자, 논리 연산자, 조건식 연산자 등등...
		 */
		/*
	     * 산술 연산자   +, -, *, /, %, ++, --
	     * 할당 연산자   =, +=, -=, *=, /=, %=, // (비트연산자 (웹에선 거의 안씀 , 속도 퍼포먼스를 높이기 위해 사용)) &=, |= 
	     * 비교 연산자   ==, !=, >, <, >=, <=
	     * 논리 연산자   &&, ||, !
	     */
		
		// 덧셈 연산자
		// 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2: " + (num1 + num2));
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		
		//문자열 덧셈 (연결연산자)
		String str1 = "Hello";
		String str2 = "World";
		System.out.println("str1 + str2: " + (str1 + str2));
		
		// 숫자 + 문자열 = 문자열 + 문자열 (연결연산자)
		
		System.out.println(10 + "Hello");
		System.out.println(3.14 + "Hello");
		
		//문자 덧셈
		System.out.println('A' + 'B');  // 65 - 66 = 131(유니코드 전환후 연산됨)
		System.out.println('가' + '나'); //44032 - 45208 = 89240
		
		// 뺄셈
		//숫자 뺄셈
		
		num1 = 10; num2 = 20;
		System.out.println("num1 - num2: " + (num1 - num2));
		
		// 문자열 뺄셈(X)
		
		str1 = "Hello"; str2 = "World";
		//System.out.println("str1 - str2: " + (str1 - str2));
		
		System.out.println('A' - 'B');  // 65 - 66 = -1(유니코드 전환후 연산됨)
		System.out.println('가' - '나'); //44032 - 45208 = -1176
		
		// 곱셈
		num1 = 10; num2 = 20;
		System.out.println("num1 * num2: " + (num1 * num2));
		
		System.out.println('A' * 'B');  // 65 * 66 = 4290(유니코드 전환후 연산됨)
		System.out.println('가' * '나'); //44032 * 45208 = 1990598656
		
		// 나눗셈
		num1 = 10; num2 = 20;
		System.out.println("num1 / num2: " + (num1 / (float)num2)); // int 는 4byte 이지만 결과값은 8byte 가 필요해서 방을 늘려줘야함 
		
		num3 = 0.8f; num4 = 0.2f;
		System.out.println("num3 / num4: " + (num3 / num4));
		
		System.out.println((int)'a'); // 97
		System.out.println((int)'A'); // 65
		System.out.println('A' / 'B'); // 97/65 => 1.4923076023-7692 == 1 int 는 4byte 이지만 결과값은 8byte 가 필요해서 방을 늘려줘야함 (오버플오루)
		
		System.out.println(0/100); // 0
		//System.out.println(100/0); // 에러
		
		// 나머지 연산자
		
		num1 = 10; num2 = 3;
		System.out.println("num1 % num2: " + (num1 % num2)); // 1
		System.out.println('a' % 'A'); // 97 / 65 의 나머지 32
		
		// 연산자 결과값이 실수일경우 담는 변수 타입도 실수로 해야 데이터기 유실되지 않는다
		// 피연산자의 데이터 타입이 int 보다 작을경우 데이터 타입을 int로 형변환한다
		// 피연산자의 데이터 타입이 int 보다 큰 경우 피연산자의 타입중 큰 데이터 타입으로 형변환한다
		
		
		
		
	}
	
}
