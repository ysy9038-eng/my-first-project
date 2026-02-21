class VarEx05{
	public static void main(String[] args){
		// 강제 타입 변환
		// 큰 타입-> 작은 타입 대입
		// 변환 하려는 타입 명시해줘라.
		
		int a = 65;
		char b =(char)a;
		System.out.println( a );
		System.out.println( b );
		
		// 실수 > 정수
		double x = 10.5;
		int y = (int)x; // 0.5의 정보의 손실 발생
		System.out.println( y );
		
		double z = y;
		System.out.println( z );	// 손실된 값은 돌아오지 않는다.
	}
}
