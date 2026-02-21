class OperEx05{
	public static void main(String[] args){
		// 삼항연산자(조건연산자)
		// 조건식 ? 조건식의 결과가 true 일때의 값 또는 식 : 조건식의 결과가 false일 때의 값 또는 식 ;
		// 조건식	: 결과가 논리형으로 나오도록 구성
		// 10>0 ? 100:0;
		
		System.out.println( 10<0 ? 100 : 0 );
		System.out.println( 10<0 ? "0" : "X");
		System.out.println( 10>0 ? 10+10 : 10-10 ); // 20
		
		int a = 10;
		System.out.println( a<0 ? "크다" : 'a' );
		String result = a>0 ? "크다" : "a"; // 변수에 담을 떄는 오른쪽과 왼쪽의 값이 같아야 한다.
		System.out.println( result );
		
		int age = 85;
		String result2 = !(age>90) ? "가" : "나";
		System.out.println( result2 );
		
		int score = 85;
		char grade = score >90 ? 'A': (score>80 ? 'B' : 'c');
		System.out.println( grade ); 
		
		int b = 10;
		String value = b>0? "양수" : (b==0? "0이다":"음수");
		System.out.println( value );
		//10
		int c = a>5 ? (a>10 ? 500 : 100) : 0; //true 일땐 물음표 뒤 f일때는 세미콜론 앞 더블콜론 뒤
		// 조건식의 결과 T -> ? 뒤 ~ : 사이
		// 조건식의 결과 F -> : 뒤
		System.out.println( c );
	}
}