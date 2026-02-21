class ForEx14{
	public static void main(String[] args){
		// 1~100 반복, 3의 배수 합
		int num, sum = 0;
		for( num= 1; num<101; num++){
			if(num%3 == 0){
				// 3의 배수,
				sum+=num;	// 3+6+9+12+..+99
			}
		}
		System.out.println("1부터 100까지의 3의 배수의 합 :"+sum);
	}
}