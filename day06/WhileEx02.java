class WhileEx02{
	public static void main(String[] args){
		
	
		// 100까지 출력
		int a = 1;		// 초기식	
		while(a<101) {	// 조건식
			System.out.println(a);	// 1 2 3 4...100
			a++;		//증감식
		}
		// 100까지 홀수만 출력
		int b = 1;
		while(b<101){
			System.out.println(b);	// 1 3 5 7 9 ... 99
			b+= 2;	// b = b+2;
		}
		
		// 100까지 짝수만 출력
		int c = 2;
		while(c<=100){
			System.out.println(c);	//2 4 6
			c+=2;	// 102
		}
		
	}
}
