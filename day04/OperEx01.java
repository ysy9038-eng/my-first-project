class OperEx01{
	public static void main(String[] args){
		// 비교 연산자 ( == , != , > , <, <= , >= )
		// 비교연산자의 결과는 논리형으로 나온다. boolean - true/false
		System.out.println( 10 == 0 );	//false
		System.out.println( 10 != 0);	//true
		System.out.println( 10 > 0 );	//true
		System.out.println( 10 < 0 );	//false
		System.out.println( 10 >= 0 );	//true
		System.out.println( 10 <= 0 );	//false
		
		System.out.println("========");
		
		// 변수 활용
		int num1 = 5;
		int num2 = 3;
		boolean value = num1 > num2;	// true
		System.out.println( value );
		
		value = num1 < num2;	//false
		System.out.println( value );
	}
}