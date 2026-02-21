class SwitchEx06{
	public static void main(String[] args){
		int score = 88;
		char grade = ' ';
		switch(score){
			case 100 : case 99 : case 98 : case 97 :
			case 96	 : case 95 :
				grade = 'A';
			break;
			case 94, 93, 92, 91, 90 :
				grade = 'B';
			break;
			default :
				grade = 'F';
			
		}
		System.out.println("당신의 학점은"+grade+"입니다.");
	}
}