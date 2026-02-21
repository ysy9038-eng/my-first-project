class IfEx02{
	public static void main(String [] args){
/*	if-else문
	조건식을 만족하는 경우, 만족하지 않는 경우 모두 나타낼때 사용
	
	if(조건식){ 실행문;}
	else{ 실행문}
	조건식이 참(true)일 경우 {}안 수행
	조건식이 거짓(false)일 경우 else{}안 수행
	거짓일 경우를 나타내기 때문에 조건식 사용 안함
	
	if(조건식){
		//결과 true
		실행문;
		...
		}else({
		// 결과 false
		실행문;
		...
		}
*/
	int age = 2;
	if (age >= 8){
		System.out.println("학교에 다닙니다.");
	}else{	// 선택적 사용, 단독 사용불가
		System.out.println("학교에 다니지 않습니다.");
	}
	
	System.out.println("상관 없음.");
	
	}
}
