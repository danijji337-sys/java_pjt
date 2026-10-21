
public class Operator4 {

	public static void main(String[] args) {
		
		/*
		 * 논리 연산자(boolean)
		 * &&	: and 연산자		A && B => A외 B가 모두 인 경우에만 True
		 * ||	: or 연산자		A || B => A외 B중 하나라도 True 이라면 True
		 * !	: 부정(not) 연산자 A ! B => A의 현재상태를 부정 True > false false > True
		 */
		
		int num1 = 10; int num2 = 20; int num3 = 30;
		boolean result = (num1 < num3) && (num2 < num3);
		System.out.println("result: " + result); // result: true
		
		result = (num1 > num3) && (num2 < num3);
		System.out.println("result: " + result); // result: false
		
		result = (num1 > num2) || (num2 < num3);
		System.out.println("result: " + result); // result: true
		
		result = (num1 < num2) && (num2 < num3) && (num3 > num1);
		System.out.println("result: " + result); // 앞에서 부터 하나씩 비교해보면 된다 result: true
		
		System.out.println(!true); // false
		System.out.println(!!true); // true
		
		/*
	     * &&와 ||중에서 어떤 연산자의 연산 우선순위가 높을까요?
	     * 갑작스런 질문에 살짝 당황하셨나요? 
	     * 쉽게 생각하면 &&와 ||는 모두 논리연산자로 연산 우선순위가 같아서 왼쪽부터 순차적으로 연산할거라 
	     * 생각하기 쉽습니다. 하지만 실제 연산 우선순위는 &&가 ||보다 높습니다. 
	     */
		
		boolean res = false;
		
		int no1 = 10;
		int no2 = 20;
		int no3 = 30;
		
		res = (no1 < no2) || (no2 < no3) && (no1 > no3);
		System.out.println("res: " + res); // res: true  실제 연산 우선순위는 &&가 ||보다 높아서 true가 나온다 (&& 부터 계산된다)
		
		res = ((no1 < no2) || (no2 < no3)) && (no1 > no3);
		System.out.println("res: " + res); // res: false
		
		/*
		 *  조건식 연산자 or 삼항식 연산자
		 */
		
		int passScore = 80;
		int myScore = 90;
		
		//나의 점수가 80 이상이면 'PASS'를 출력 그렇지 않으면 'FAIL'을 출력하지
		
		String resultStr = (myScore >= passScore) ? "PASS" : "FAIL";
		System.out.println("resultStr: " + resultStr); // resultStr: PASS
		// ? 앞의 내용이 true 라면 : 앞의 내용 실행 false 라면 : 뒤의 내용 실행
		
		/*
		 * 파이썬에서 삼항식 연산자
		 * true인경우 if 조건식 else false인경우
		 */
		
		
	}

}
