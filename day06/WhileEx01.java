class WhileEx01{
	public static void main(String[] args){
/*	while문
	조건식이 참(true)인 경우 반복 수행.
	
	초기식;
	while(조건식){
		실행문;
		}
*/
	// 1~5까지 반복
	int a = 1;		// 초기식
	while(a <6){	// 조건식
		System.out.println(a);	// 실행문	1 2 3 4 5
		a++;		// 증감식
	}
	
}
}