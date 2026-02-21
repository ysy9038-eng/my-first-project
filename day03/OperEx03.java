class OperEx03{
	public static void main(String[] args){
		int mathScore =90;
		int engScore = 70;
	
		// 두 과목 점수의 합
		System.out.println( mathScore + engScore); // 90+70 160
		int sum = mathScore + engScore;
		System.out.println("수학점수와 영어점수의 합은 :"+sum);
		
		// 두 과목 점수의 평균
		System.out.println( (mathScore+engScore)/2);
		System.out.println (sum/2);
		double avgScore = sum/2;
		System.out.println( avgScore );
	}
}