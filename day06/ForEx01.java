class ForEx01{
	public static void main(String[] args){
		// hello java 10번 출력
		// for(초기식; 조건식; 증감식){ 실행문;}
		
		int a;
		for(a=10;a<20;a++){
			System.out.println("hello java");
		}
		
		// 100까지 출력
		for( int b=1;b<101;b++){
			System.out.println(b);
		}
		
		//100까지 홀수 출력
		
		
		for( int c=1;c<101; c+=2){		//c = c+2
			System.out.println(c);
		}
		//100까지 짝수 출력
		for( int d=2; d<=100; d+=2){
			System.out.println("짝수 d : "+d);
		}
	}
}