class VarEx07{
	public static void main(String[] args){
		// 문자열 String
		// 기본 타입 아님
		//""(큰따옴표) 사용, 공백도 문자
		String s;
		s = "hello";
		System.out.println( s );
		
		String s2 = " ";
		String s3 = ""; 
		System.out.println( s2 );
		System.out.println( s3 );
		
		String s4 = "world";
		System.out.println("s4의 값 :"+s4);
		
		System.out.println(s + s2 + s4);
		
		int a = 100;
		System.out.println( a + s );
		
		boolean x = false;
		System.out.println( x+s2+s );
	}
}