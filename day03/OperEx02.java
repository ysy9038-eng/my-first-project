class OperEx02{
	public static void main(String[] args){
		// 산술 연산자 ( + , -, *, / , %)
		int a = 10;
		double d = 10.5;
		System.out.println( a + d );
		
		int result = (int)(a+d);
		System.out.println( result );
		
		double result2 = a+d;
		System.out.println( result2 );
		
		int num = 10;
		int num2;
		num2 = num + 10;	// 20
		num = num2;			// 20
		System.out.println( num );
		System.out.println( num2 );
	}
}