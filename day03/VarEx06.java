class VarEx06{
	public static void main(String[] args){
		// 논리형 boolean - true/false
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println( b1 );
		System.out.println( b2 );
		
		System.out.println( 3>4 );	//false
		System.out.println( 3 < 4 );	//true
		
		int x = 5;
		int y = 10;
		System.out.println( x>y );	//5>10 -> false
		System.out.println( x < y);		//5 < 10 -> true 
		
		int q = 3+4; 
		
		boolean z= x>y;		//5>10 -> false
		System.out.println( "boolean 타입 변수 z의 값은 : "+z );
	}
}