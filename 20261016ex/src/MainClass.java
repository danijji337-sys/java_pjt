import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 데이터 타입 
		 * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 되는데,
		 * 각각의 메모리 크기에 따라 데이터 종류를 지정하는 것을 말한다.
		 * 
		 * 메모리 단위
		 * 1bit(비트) > 메모리 최소단위
		 * 8bit(비트) > 1byte(바이트)
		 * 1024byte(바이트) > 1KB(키로바이트)
		 * 1024KB(키로바이트) > 1MB(메가바이트)
		 * 1024Mb(메가바이트) > 1GB(기가바이트)
		 * 1024GB(기가바이트) > 1TB(테라바이트)
		 * 
		 */
		
		// 정수 데이터 타입
		/*
		 * byte (1byte) -128 ~ -127 
		 * 많이 사용하지는 않지만 소형 디바이스 등에서 실행되는경우 메모리를 아끼기 위해 사용될때도 있음
		 * short (2byte) -32,768 ~ -32,767
		 * int (4byte) -2,147,483,648 ~ 2,147,483,647 (가장 많이씀)
		 * long (8byte)
		 */
		
		byte byteNum = 115;
		System.out.println("byteNum: " + byteNum);
		
		byteNum = 127;
		
		byte byteNum01 = -128;
		System.out.println("byteNum01: " + byteNum01);
		
		byteNum01 = (byte)(byteNum01 - 1);
		System.out.println("byteNum01: " + byteNum01);
		
		short shortNum = 22768;
		System.out.println("shortNum: " + shortNum);
		
		int intNum = 1147483648;
		System.out.println("intNum: " + intNum);
		
		int intNum01 = -2147483648;
		System.out.println("intNum01: " + intNum01);
		
		intNum01 = intNum01 - 1;
		System.out.println("intNum01: " + intNum01);
		
		long longNum = 722337203685477508L; // long 타입 선언시 숫자뒤에 대문자 L , 
											// 소문자도 가능하지만 숫자 1과 비슷해 가독성이 떨어지므로 비권장
		System.out.println("longNum: " + longNum);
		
		System.out.println("byte최솟값: " + Byte.MIN_VALUE);
		System.out.println("byte최댓값: " + Byte.MAX_VALUE);
		
		System.out.println("short최솟값: " + Short.MIN_VALUE);
		System.out.println("short최댓값: " + Short.MAX_VALUE);
		
		System.out.println("int최솟값: " + Integer.MIN_VALUE);
		System.out.println("int최댓값: " + Integer.MAX_VALUE);
		
		System.out.println("long최솟값: " + Long.MIN_VALUE);
		System.out.println("long최댓값: " + Long.MAX_VALUE);
		
		
		//실수(부동소수점)
		/*
		 * float(4byte)
		 * double(8byte)
		 */
		
		float floatNom = 3.14f;
		System.out.println("floatNom: " + floatNom);
		
		double doubleNum = 3.14159265358979;
		System.out.println("doubleNum: " + doubleNum);

		System.out.println("float최솟값: " + Float.MIN_VALUE);
		System.out.println("float최댓값: " + Float.MAX_VALUE);
		
		System.out.println("double최솟값: " + Double.MIN_VALUE);
		System.out.println("double최댓값: " + Double.MAX_VALUE);
		
		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288d;
	    System.out.println("num1: " + num1);
	    System.out.println("num2: " + num2);
		
	    
	    //논리데이터타입
	    // 참(True) 거짓(false)
	    // boolean (1byte) true, false
	    
	    boolean flag = true;
	    System.out.println("flag: " + flag);
	    
	    //문자와 문자열 데이터 xkdlq
	    // 문자
	    /*
	     * 메모리에 문자 데이터를 저장하기 위해 사용하는 데이터 타입
	     * char (2bte)
	     */
	    char ch = 'a'; // 문자는 반드시 작은따옴표로 표기 "" < 에러가 난다
	    		
	    System.out.println("ch: " + ch);
	    ch = 'b'; // 문자열을 변수에 넣으면 에러가 난다
	    System.out.println("ch: " + ch);
	    
	    // 빈문자(empty) vs 공백문자(space)
	    // char char1 = ''; 에러
	    // char char1 = ' '; // 공백이라는 문자가 담겼으므로 한칸 띄우면 에러가 나지 않는다
	    
	    // 문자는 메모리에 저장될떄 정수(유니코드)로 저장 된다
	    char char1 = 'A';
	    System.out.println("char1: " + char1); // A
	    
	    int unicode = char1;
	    System.out.println("unicode: " + unicode); // 65
	    
	    char char2 = 'ㄱ';
	    System.out.println("char2: " + char2); // ㄱ
	    
	    unicode = char2;
	    System.out.println("unicode: " + unicode); // 12593
	    
	    char char3 = 65;
	    System.out.println("char3: " + char3); // A
	    
	    char3 = 12593;
	    System.out.println("char3: " + char3); // ㄱ
	    
	    
	    // 문자열 (첫글자 대문자)
	    // String
	    String str1 = "hello";
	    System.out.println("str1: " + str1);
	    
	    str1 = "";
	    System.out.println("str1: " + str1);

	    str1 = " ";
	    System.out.println("str1: " + str1);
	    
	    // 콘솔을 이용합 데이터 입출력(입력, 출력)
	    // 데이터 출력
	    System.out.print("hello python");   // line 
	    System.out.println("hello java");   //hello pythonhello java
	    System.out.print("hello python\n");	//hello python
	    System.out.println("hello java");	//hello java
	    
	    /*
	     *  특수문자 정리
	     *  \n : 개행(줄바꿈)
	     *  \t : 4칸공백 (탭)
	     *  \' : 작은따옴표 (')
	     *  \" : 큰따옴표 (")
	     *  \\ : 역슬래쉬(\)
	     */
	    
	    System.out.print("이름\t학번\n");
	    System.out.println("Mr. H\t2020_000123");
	    System.out.println("Mr. K\t2020_000124");
	    
	    System.out.println("어머님 께서는 \"밥먹고 설거지 해놔라.\"라고 하셨습니다.");
	    System.out.println("그래서 나는 \'네\'라고 했습니다.");
	    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	    System.out.println("\\\\\\2020-08-05\\\\\\");
	    
	    // 데이터 입력
	    Scanner scanner = new Scanner(System.in); // 인풋을 열어놨으면 다시 끊어줘야함
	    
	    //String inputStr = scanner.nextLine();
	    //System.out.println("inputStr: " + inputStr); 
	    
	    /*
	     *  nextByte()      : 정수 입력
	     *  nextInt()       : 정수 입력
	     *  nextLong()      : 정수 입력
	     *  nextFloat()     : 실수 입력
	     *  nextDouble()    : 실수 입력
	     *  nextLine()      : 문자열 입력
	     *  nextBoolean()   : 논리 입력
	     *  
	     */
	    
	    //scanner.close(); // 외부자원 연결시 끊어준다
	    
	    /*
	    int inputInt = scanner.nextInt();
	    System.out.println("inputInt: " + inputInt);
	    
	    scanner.nextLine();
	    
	    String inputString = scanner.nextLine();
	    System.out.println("inputString: " + inputString); 
	    */
	    
	    String inputString = scanner.next();
	    System.out.println("inputString: " + inputString);
	    
	    
	    scanner.close();
	    
	    
	}

}
