class VarEx{
	public static void main(String[] args){
/*		지역변수 : 변수는 선언된 {}영역/블럭 안에서만 사용 가능. = {}블럭 밖 사용 불가.
				{}영역/블럭 종료되면 자동 삭제.  */
	int a = 100;
	if( a>10){
		int x = 1000;
		
		System.out.println( "변수 a : "+a);	//가능	
		System.out.println( "변수 x : "+x);	//가능
	}
	System.out.println("변수 a :"+a);
//	System.out.println("변수 x :"+x);		// if문 밖에서 사용 불가.
	}
}
