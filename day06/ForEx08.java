class ForEx08{
	public static void main(String[] args){
		// 구구단 2~5단 출력
		int dan;
		int num;
		for(dan=2; dan<6; dan++){
			for(num=1; num<10; num++){
				System.out.println( dan + "X"+num+"="+(dan*num) );
			}
			System.out.println();	// 줄바꿈
		}
	}
}