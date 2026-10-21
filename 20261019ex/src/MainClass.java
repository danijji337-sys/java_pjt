
public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 지정자에 사용할 수 있는 옵션들
		 */
		
		// [.precision] : 소수점 아래 자리수를 지정한다
		float rate = 3.141592f;
		System.out.printf("rate: %f %n", rate);   // rate: 3.141592
		System.out.printf("rate: %.2f %n", rate); // rate: 3.14 
		System.out.printf("rate: %.4f %n", rate); // rate: 3.1416 : 반올림 처리
		
		// [width] : 전체 출력 자리수를 지정하고, 오른쪽 정렬한다
		int num1 = 1;
		int num2 = 12;
		int num3 = 123;
		
		System.out.printf("num1: %d %n", num1); // num1: 1
		System.out.printf("num2: %d %n", num2); // num2: 12 
		System.out.printf("num3: %d %n", num3); // num3: 123
		
		System.out.printf("num1: %3d %n", num1); // num1: __1
		System.out.printf("num2: %3d %n", num2); // num2: _12                         몇칸 잡을지
		System.out.printf("num3: %3d %n", num3); // num3: 123 System.out.printf("num3: %3d %n", num3);
		
		System.out.printf("num1: %-3d %n", num1); // num1: 1__
		System.out.printf("num2: %-3d %n", num2); // num2: 12_
		System.out.printf("num3: %-3d %n", num3); // num3: 123
		
		// [flags] : 전체 출력 자리수가 지정될 경우 빈칸을 0으로 채운다 (**오른쪽 정렬만 가능**)
		
		int num4 = 1;
		int num5 = 12;
		int num6 = 123;
		System.out.printf("num4: %4d %n", num4);  // 4칸 오른쪽 정렬 설정 ___1
		System.out.printf("num4: %04d %n", num4); // 0001
		System.out.printf("num5: %04d %n", num5); // 0012
		System.out.printf("num6: %04d %n", num6); // 0123
		
		// [argument_index$]
		int num7 = 1;
		int num8 = 2;
		int num9 = 3;
		int num10 = -1;
		
		System.out.printf("num7: %d num8: %d num9: %d num10: %d %n", num7, num8, num9, num10);
		// num7: 1 num8: 2 num9: 3 num10: -1 
		System.out.printf("num7: %2$d num8: %4$d num9: %3$d num10: %1$d %n", num10, num7, num9, num8);
		// num7: 1 num8: 2 num9: 3 num10: -1 (코드 판독이 더 어려워져서 사용 안함)
		
		/*
		 * 형식 문자열 반환하기 : string.format() === (javasscript: ``)
		 */
		
		String res = String.format("이름은 %s이고, 나이는%d살입니다.%n", "홍길동", 20);
		System.out.println("res: " + res);
		
		// let str = "홍길동";
		// let age = 20;
		// let res = `이름은 ${str}이고, 나이는${age}살입니다.`
		// console.log('res: ' res)
		
	}
}
