class WhileEx03{
	public static void main(String[] args){
		// 10부터 감소
		int a = 10;
		while (a > 0){
			System.out.println(a);
			a--;
		}
		
		// 100부터 감소하는 홀수 출력
		int b=99;
		while( b > 0){
			System.out.println( b );
			b-=2;	// b= b-2;
		}
		
		int x=100;
		while( x>= 1){
			System.out.println( x-1);
			x-=2;
		}
		
		// 100부터 감소하는 짝수 출력
		int c = 100;	// 초기식
		while( c >= 2){	// 조건식
			System.out.println( c );	// 실행
			c-=2;		// 증감식
		}
	}
}