class ForEx09{
	public static void main(String []args){
		// 구구단
		int dan;
		int num;
		for(dan=1; dan<=9; dan++){
			for(num=1;num<=9; num++){
				System.out.println( dan + "X"+num+"="+(dan*num) );
			}System.out.println( dan+"X"+num+"="+(dan*num) );
		}
		// 몇 단인지 출력
		
		// for문 내에서 변수 선언
		for( int i=2; i<10; i++){
			System.out.println(i+"단");
			for(int j=1; j<10; j++){
				System.out.println( i +"x"+j+"="+(i*j) );
				
				System.out.println();
			}
		}
	}
}
