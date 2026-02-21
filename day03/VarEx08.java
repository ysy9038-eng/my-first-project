class OperEx01{
	public static void main(String[] args){
		// 부호 연산자( + , - )
		// 양수 음수
		int num1 = 10;
		int num2 = 20;
		System.out.println( +num1 );	// 10
		System.out.println( -num2 );	// -20 : 대입 아님
		System.out.println( num2 );		//20   : 값이 바뀐것이 아님	
		
		num2 = -num2;	// 값이 바뀌려면 '대입'을 해야 함.
		System.out.println( num2 );		// -20
	}
}