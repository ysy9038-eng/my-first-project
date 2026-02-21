class OperEx06{
	public static void main(String[] args){
		// 증감(증가, 감소) 연산자
		// ++ , -- : 1증가, 1감소
		// boolean 논리형 타입에서 사용 불가
		int a = 10;
		System.out.println( a );	//10
							++a;	//선증가11;(세미콜론)이 붙어있으면 하나의 실행문
		System.out.println( a );	//11
							a++;	//후증가 12
		System.out.println( a );	//12
		
		// 증감 연산자의 위치에 따른 우선순위
		// 증감 연산자가 변수의 뒤에 있을 경우 연산이 제일 마지막에 일어남
		
		int b = 10;
		System.out.println( ++b );	// 연산 11, 출력 11
		System.out.println(b);		// 출력 11
		System.out.println(b++);	// 출력 11, 연산 12
		System.out.println(b);		// 출력 12
		
		int c = 10;
		System.out.println(--c);	// 연산 9, 출력 9
		System.out.println(c);		// 출력 9
	    System.out.println(c--);	// 출력 9, 연산 8
		System.out.println(c);		// 출력 8
	}
}