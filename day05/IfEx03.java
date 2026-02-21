class IfEx03{
	public static void main(String[] args){
		// 삼항연산자(조건연산자) 사용!
		int score = 45;
		char grade; 
		grade = (score >=90) ? 'A' :(score>=80? 'B':'C');
		
		System.out.println("당신의 등급은"+grade+" 입니다.");
			}
}