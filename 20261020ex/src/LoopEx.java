//import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
		/*
		 * for문  : 횟수에의한 반복 실행 해야될 때
		 * whle문 : 조건에의한 반복 실행 해야될 때
		 */
		// 안녕하세요를 5회 출력하자
		//for(초기화; 조건식; 단계)
		//for(시작; 끝; 단계)
		/*
		for(int i = 0; i < 10; i += 2) {
			System.out.println("안녕하세요.");
		}
		int i = 1;
		for(; i < 10; i += 2) {
			System.out.println("안녕하세요.");
		}
		int j = 1;
		for(j = 5; j < 10; j += 2) {
			System.out.println("안녕하세요.");
		}
		for(int k = 0; k < 10; ++k){
			System.out.println("O");
		}
		*/
		
		// 1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램 만들어보자
		/*
		Scanner scanner = new Scanner(System.in);
		
		int inputData = scanner.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= inputData; i++) {
			sum += i;
		}
		*/
		//3단 구구단 출력
		/*
		for(int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));
			System.out.printf(String.format("3 * %d = %d%n", i, (3 * i)));
		}
		*/
		//전체 구구단 가로모드 세로모드 출력
		/*
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j <10; j++) {
				System.out.printf("%d X %d = %d%n", i, j, (i*j));
			}
		}
		//boolean falg = true;
		//for(int i = 1; falg; i++) {
			// 계속 트루인 상태는 무한루프
			// 방지방법 if (i >10) break; or falg = flase;
		//}
		
		*/
		/*
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <4; j++) {
				if(j == 3) {
					System.out.printf("%d X %d = %d%n", j, i, (j*i));
				} else {
					System.out.printf("%d X %d = %d\t", j, i, (j*i));
				}
			}
		}
		*/
		/*
		for(double d = 0.0; d < 1; d += 0.1) {
			System.out.printf("d: %f \n", d);
		}
		*/
		
		//*******************************************
		//중첩 for문을 이용할때 절대 3단계 이상을 사용하지 말자
		//*******************************************
		//for (int i = 0; i < 10; i++) {
		//	for(int j = 0; j < 10; j++) {
		//		for(int k = 0; k < 10; k++) {
		//			
		//		}
		//	}
		//}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		/*
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j <= 5 - i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		*/
		/*
		 * 
		 * 
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */
		
		/*
		int num = 1;
		int sum = 4;
		int num2 = 0;
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 9; j++) {
				if (j < sum) {
					System.out.print(' ');
				} else if (num2 < num){
					num2 += 1;
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			num2 = 0;
			sum--;
			num += 2;
			
			System.out.println();
			
		}
		/*
		System.out.println("MON\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");
		int offset = 3;
		int day = 1;
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < offset; j++) {
				System.out.print(String.format("%3c\t", '-'));
			}
			
			for (int j = 0; j < 7 - offset; j++) {
				
				if (day <= 30) {
					System.out.print(String.format("%3d\t", day));
					day++;
				} else {
					System.out.print(String.format("%3c\t", '-'));
				}
			}
			
			offset = 0;
			System.out.println();
			
			
		}
		*/
		
		
		
		
		
		
		
	}

}
