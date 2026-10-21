
public class Operator3 {
	
	public static void main(String[] args) {
		
		/*
		 * 비교 연산자
		 * 비교 연산자란 크고 작음을 나타내는 연산자 입니다
		 */
		//컨트롤 쉬프트 o (정리기능)
		System.out.println(10 < 20); //true
		System.out.println(10 > 20); //false
		
		System.out.println(10 <= 20); //true
		System.out.println(10 >= 20); //false
		
		System.out.println(10 == 20); //false
		System.out.println(10 != 20); //true
		
		//System.out.println(10 === 20); 
		//System.out.println(10 !== 20); 자바스크립트에만 있는 문법
		
		float num5 = 0.1f; // 0.10000000149  > 타입만 double
	    double num6 = 0.1; // 0.10000000000  > double
	    
	    System.out.println("num5: " + num5);
	    System.out.println("num6: " + num6);
	    
	    System.out.println("num5 + num6: " + (num5 + num6)); // 0.20000000149011612
	    System.out.println("num5 == num6: " + (num5 == num6)); // false (실수는 메모리 설계상 정확한 데이터를 넣을수 없어 가비지 데이터가 들어가기때문에 같은 값을 넣어도 결과가 false 가 나올 수 있다)
	    System.out.println("num5 != num6: " + (num5 != num6)); // true
	    
	    System.out.println("num5 > num6: " + (num5 > num6)); // true 
	    System.out.println("num5 < num6: " + (num5 < num6)); // false
	    
	    int num7 = 10;
	    float num8 = 10.0f;
	    
	    // int + float = float + float // num7: 10.0 num8: 10.0
	    
	    System.out.println("num7 > num8: " + (num7 > num8)); //false
	    System.out.println("num7 >= num8: " + (num7 >= num8)); //false / true
	    System.out.println("num7 < num8: " + (num7 < num8)); //true / false
	    System.out.println("num7 <= num8: " + (num7 <= num8)); //true 
	    System.out.println("num7 == num8: " + (num7 == num8)); //false / true
	    System.out.println("num7 != num8: " + (num7 != num8)); //true / false
	    
	    
	    //***************************
	    //문자열 비교 연산자
	    //***************************
	    
	    String str1 = "hello";
	    String str2 = "hello";
	    System.out.println("str1 == str2: " + (str1 == str2)); // true
	    
	    String str3 = new String("Hello"); // String 은 래퍼런스 (참조 타입)
	    String str4 = new String("Hello");
	    System.out.println("str3 == str4: " + (str3 == str4)); // false
	    System.out.println("str3 == str4: " + (str3.equals(str4))); // true 
	    // 문자 비교시 == 절대 쓰지 말자 .equals 사용하자 ***
	    
	    
	}

}
