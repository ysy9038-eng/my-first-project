class DoWhileEx01{
	public static void main(String[] args){
/*		while문 조건식의 결과가 falxe 일 경우 실행문 수행 안함.
		반복 발생 안함.
		
		do-while문
		{} 안의 실행부분 반드시 한번 실행한 후 조건 검사.
		{}안의 실행문을 반드시 실행해야하는 경우 사용.
*/
		// 1~10까지의 합
		int num = 1;
		int sum = 0;
		do{
			sum += num;
			num++;
		}while( num < 11 );
		System.out.println("1부터 10까지의 합 :"+sum);
		
		System.out.println("==while문으로 바꿔보기==");
		
		int num1 = 1;
		int sum1 = 0;
		while(num1<11){
			sum1 += num1;
			num1++;
			}
		System.out.println("1부터 10까지의 합 :"+sum1);
		
		int number = 2;
		do{
			System.out.println("hello");
			number++;
		}while( number == 1);	// false
	}
}