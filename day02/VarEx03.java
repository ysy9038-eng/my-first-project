class VarEx03{
	public static void main(String[] args){
		// 변수 이름 : 어떤것으로 사용하나? 유추 가능하도록 이름 짓는다.
		
		int age;  // 변수 선언
		age = 10; // 값 대입
		System.out.println( age );
		
		int level;
		// System.out.println( level );변수에 값이 없으면 사용 불가
		
		// 선언과 대입 한번에 가능
		int num = 5;
		System.out.println( num );
		
		int b = 20; // 선언과 대입
		System.out.println( b ); // 새로운 값 대입 전
		b = 30;     // 대입
		System.out.println( b ); // 새로운 값 대입 후
		
		//System.out.println( age, b ); 출력물은 하나의 값만 사용
		//값의 복사. 데이터 타입이 같기때문에 대입 가능. 
		int c = b;
		System.out.println( c );
	}
}
