class WhileEx04{
	public static void main(String[] args){
		// 1~10까지의 합
		int num=1, sum = 0;
		
	    while(num<11){
			sum+= num;	// 0+1+2+3+...+10
			num++;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
	    // 1~100까지의 합
		int num2=1, sum2 = 0;
		
		while(num2<101){
			sum2+= num2;
			num2++;
		}
		System.out.println("1~100까지의 합 :"+sum2);
	}
}
