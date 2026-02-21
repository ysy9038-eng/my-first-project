class ForEx02{
	public static void main(String[] args){
/*		for(초기식; 조건식; 증감식){
			실행문;
			}
*/		
	// 초기식 생략
	int a = 1;	// 반복에 사용할 변수 미리 선언/초기화
	for( ; a<6; a++){
		System.out.println(a);
	}
	
	// 조건식 생략
	for( int b=1; ; b++){
		System.out.println(b);	// 1 2 3 4 5
		if( b == 5){ break; }
	}
	
	// 모든 요소 생략 (무한 반복)
	for( ; ; ){
		System.out.println("무한반복")
	}
	}
}
