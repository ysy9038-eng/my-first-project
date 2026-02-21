class OperEx02{
	public static void main(String[] args){
		// 논리 연산자 ( if / for 등의 제어문과 함께 쓰임 )
		// && , || , !
		// &&	(and 연산자) : 조건이 모두 true 일 경우 결과 true
		// ||	(or 연산자)	: 조건이 하나라도 true 인 경우 결과 true
		// !	(not 연산자)	: 결과를 반대로
		System.out.println( true && true);	// T
		System.out.println( true && false);	// F
		System.out.println( true && false && true );	// F
		System.out.println( false && false );	//F
		
		System.out.println( true || true);	// T
		System.out.println( true || false);	// T
		System.out.println( true || false || true);	// T
		System.out.println( false || false );	// F
}
