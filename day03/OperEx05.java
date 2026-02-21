class OperEx05{
	public static void main(String[] args){
/*	오버플로우(Overflow)
	주로 정수형 데이터 타입에서 발생
	데이터가 저장 될 수 있는 범위롤 넘어설 때 발생.
	최대값을 초과화거나 최소값을 밑도는 값이 들어가게될 때 발생하는 현상.
	결과값이 이상한 값으로 나옴.		
*/
	// byte 타입 범위 : -128~ 127
	// byte b = 128;
	byte b = 127;
	System.out.println( b );
	
	byte b2 = (byte)(b+3);	//130
	System.out.println( b2 );
	
	byte b3 = (byte)(100+30);
	System.out.println( b3 );
	
	b++;	//127+1
	System.out.println( b );
	}
}