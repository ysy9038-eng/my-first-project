class WhileEx05{
	public static void main(String[] args){
		// 1~100까지 홀수의 합
		int num = 1;
		int odd = 0;
		while(num<101){
			odd += num;
			num += 2;	// 1 3 5 7 9 10 .. 99
			
		}
		System.out.println("100까지 홀수의 합 :"+odd);
		
		// 1~100까지 짝수의 합
		int num2 = 2;
		int even = 0;
		while( num2<101){
			even+=num2;
			num2+=2;
		}
		System.out.println("100까지 짝수의 합 :"+even);
	}
}
