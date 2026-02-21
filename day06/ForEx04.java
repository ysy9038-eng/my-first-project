class ForEx04{
	public static void main(String[] args){
		// 1~100까지의 합 - 반복 변수, 합을 담을 변수
		int num1;
		int sum1=0;
		for( num1 = 1; num1<=100; num1++){
			 // num1 1+2+3+4+...+100
			 sum1+=num1;
			 System.out.println( "증가하는 num1값"+num1+" 일때의 합 : "+sum1 );
		}
		System.out.println("1~100까지의 합 : "+sum1);
		// 1~100까지 홀수의 합
		int num2;
		int sum2 = 0;
		for( num2 = 1; num2<101; num2+=2){	// num2= num2+2
			 sum2+=num2; // sum2 = sum2+num2;		1+3+5+7+9+...+99
		}
		System.out.println("1~100 까지의 홀수의 합 :"+sum2);
		
		// 1~100까지 짝수의 합 // 결과값에 대입인가 짝수는 그렇게 많이 잡지않고?
		int num3;
		int sum3 = 0;
		for( num3 = 2; num3<101; num3+=2){
			 sum3+=num3;
			 System.out.println("짝수 num3의 값은 "+num3+"이고, 이때의 합은 "+sum3+" 입니다.");
		}
		System.out.println("최종값 :"+sum3);
	}
}
