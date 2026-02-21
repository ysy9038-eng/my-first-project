class IfEx04{
	public static void main(String[] args){
/*		정수로 사용할 변수
		90이상 A, 80이상 B, 70이상 C, 60이상 D, 그 외 F
		결과가 B가 나오도록 구성.
*/		
	int score = 80;
	String result;
	if(score>=90){
		result = "A";
		
	}else if(score>=80){
		result="B";
		
	}else if(score>=70){
		result="C";
		
	}else if(score>=60){
		result="D";
	}else{
		result="F";
	}
	System.out.println(result);

	}
}
