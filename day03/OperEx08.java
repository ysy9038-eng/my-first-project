class OperEx08{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		// 출력 덧셈 증가
		System.out.println( ++a + b); // 11+10 = 21
		
		int c = 10;
		int d = 10;
		// 증가 더하기 출력
		System.out.println(++c + d++); // 11+10 = 21
		
		int e = 10;
		int f = 10;
		System.out.println(e++ + f++); // 10+10=20
		
		int g = 10;
		System.out.println( ++g + ++g ); // 11  + 12 = 23
		
		int h = 10;
		System.out.println( h++ + h++ ); // 10 + 11 = 21
		System.out.println( h );
		
		// 후증감 : 현재 값을 먼저 사용하고, 그 다음에 1 증가.
	}
}

