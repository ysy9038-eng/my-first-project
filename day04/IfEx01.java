class IfEx01{
	public static void main(String[] args){
/*	if문
	if(조건식){ 
		실행문; 
		... // 블럭안에서 모든 문법이 가능하다
		}
		조건식은 t/f의 결과가 나오도록 구성.
		조건식의 결과가 true일 경우, if문 {}안의 실행문 실행,
	*/
		int age = 7;
		if (age < 8){
			// 조건식이 true 일때
			System.out.println("초등학생이 아닙니다."); //들여쓰기 잘보이기 위해 필수
		}
		System.out.println("if문 아님.");
		
	}
	
}