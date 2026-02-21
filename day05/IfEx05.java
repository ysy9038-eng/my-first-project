class IfEx05{
	public static void main (String[] args){
/*	중첩 if문
	if(조건식){
		// 바깥 if문의 조건식의 결과가 true
		실행문;
		if(조건식){}
		실행문;
		...
	}
*/
	int score = 97;
	String grade = "";
	
	if(score>=90){
		if(score>=95){
			grade = "A";
		}else{
			grade="A";
		}
	}
	System.out.println(grade);
	}
}
