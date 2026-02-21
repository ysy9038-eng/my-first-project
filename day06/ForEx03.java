class ForEx03{
	public static void main(String[] args){
/*		
*/		
	
	// 1~5 까지의 합 - > 반복문에 사용될 변수, 합을 담을 변수
	int num;
	int sum = 0;
	for( num = 1; num<6; num++){	// 1+2+3+4+5 sum=num
		 sum+= num; // sum = sum+num; 0+1+2+3+4+5
	}
	System.out.println( "1~5까지의 합 : "+sum );
	// 1~10 까지의 합 - 1~10 반복, 합
	int num2 = 0;
	int sum2 = 0;
	for( num2 = 1; num2<11; num2++){	
		 sum2 = sum2+num2;	// 0+1+2+3+4+5+6+7+8+9+10 sum2 += num2;

	}
	 System.out.println("1~10 까지의 합 : "+sum2);
	
}
}