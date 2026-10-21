
public class Operator2 {
	
	public static void main(String[] args) {
		
		/*
		 *  대입 연산자
		 *  
		 */
		
		int no = 10; // '=' <== 이녀석을 대입(할당) 연산자
		// 대입(할당) 연산자란, 오른쪽 값을 왼쪽의 변수에 대입(할당)하는 연산자 입니다
		
		// 복합 대입 연산자
		/*
		 * +=: 덧셈 후 할당
		 * -=: 뺄셈 후 할당
		 * *=: 곱셈 후 할당
		 * /=: 나눗셈 후 할당
		 * %=: 나머지 연산 후 할당
		 */
		
		/*
	     * +=   no += 10;   no에 10을 더한 결괏값을 no에 대입한다.
	     * -=   no -= 10;   no에 10을 뺀 결괏값을 no에 대입한다.
	     * *=   no *= 10;   no에 10을 곱한 결괏값을 no에 대입한다.
	     * /=   no /= 10;   no를 10으로 나눈 결괏값을 no에 대입한다.
	     * %=   no %= 10;   no를 10으로 나눈 나머지를 no에 대입한다.
	     * 
	     * no = no + 1 사용 X
	     */
		
		// 증강 연산자
		// ==, --
		no = 10;
		no++;
		System.out.println("no: " + no);
		
		no--;
		System.out.println("no: " + no);
		// 증강 연산자 사용하지 않고 복합 대행 연산자를 사용해도 에러는 나지 않지만 가독성을 위해 증강 연산자를 사용하는 것이 더 좋다
		
		// 전위 연산자 or 후위 연산자
		
		int num1 = 10;
		int result1 = 0;
		
		result1 = ++num1;
		System.out.println("result1: " + result1); // 11
		System.out.println("num1: " + num1); //11
		
		int num2 = 10;
		int result2 = 0;
		
		result2 = num2++;
		System.out.println("result2: " + result2); // 10
		System.out.println("num2: " + num2); //11
		
		int num3 = 10;
		int result3 = 0;
		
		result3 = (num3++);
		System.out.println("result3: " + result3); // 10
		System.out.println("num3: " + num3); //11
		
		// 연산자 우선순위는 괄호와 상관없이 대입(할당) 연산자가 세다
		
		
		
	}

}
