class IfEx06{
	public static void main(String[] args){
		int score =Integer.parseInt(args[0]);
		String grade = "";
		System.out.println("당신의 점수는"+score+"입니다.");
		
		if(score>=90){
			if(score>=95){
				grade = "A+";
			}else{
				grade="A";
			}
		}else{
			if(score>=85){
				grade="B+";
			}else{
				grade="B";
			}
		}
		System.out.println("학점:"+grade);
	}
}