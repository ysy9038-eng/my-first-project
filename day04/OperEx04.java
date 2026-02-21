class OperEx04{
	public static void main(String[] args){
		// 복합 대입 연산자 ( = )
		// 변수의 값이 바뀐다
		// = , += , -=, *= , /=, %=
		int a =10;
		System.out.println( a+20 ); // 30 단순 더하기
		System.out.println( a );
		
		// 대입연산자 사용
		System.out.println( a+=20 );	// a = a+20
		System.out.println( a );
	}
}