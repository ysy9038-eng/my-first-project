class IfEx07{
	public static void main(String[] args){
		int score = Integer.parseInt(args[0]);
		String grade = "";
		
		System.out.println("당신의 점수는 "+score+" 입니다.");
		
		if(score>=90){
			grade = "A";
			if(score>=98){
				grade +="+";	//grade = grade + "+"	; -> A+
			}else if(score<94){
				grade+="-";		//grade = grade + "-"; -> A-
			}
		}else if(score >=80){
			grade="B";
			if(score>=88){
				grade +="+";
			}else if(score<84){
				grade+="-";
			}
		}else{
			grade="c";
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
}
}