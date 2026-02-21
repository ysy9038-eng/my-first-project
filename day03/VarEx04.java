class VarEx04{
	public static void main(String[] args){
		// 자동 타입 변환
		// 작은 타입 -> 큰 타입 (대입)
		// 실수 > 정수
		// 정수 : byte < short < int < long
		// 실수 : float < double
		
		char a = 'A';	//65
		int b  = a;
		System.out.println( b );
		
		double c = b;
		System.out.println( c );
		
		}
}