class IfEx01{ //단어와 단어와의 조합에서 대문자 카멜표기법
	public static void main(String[] args){
		int score = 95; // 명시적 초기화
		char grade; // 선언
/*		자바에서는 변수를 사용할 때 값이 반드시 대입 되어있어야 함.
		else 가 있기 때문에 모든 경우에 grade의 값이 정해짐 -> 선언만해도 문제 없음
*/
		
		if(score>=90){
			grade = 'A';
		}else if(score>=80){
			grade='B';
		}else {
			grade = 'C';
		}
		System.out.println("당신의 등급은"+grade+" 입니다.");
	}
}