class ForEx15{
	public static void main(String[] args){
		// 1~100 반복, 홀수(odd)의 합, 짝수(even)의 합
		int num, odd =0, even=0;
		for( num1 =1; num1<101; num1++){
			if(num%2 == 0){	//짝수
				even = even+num;	// even += num, 2+4+6+8+...+100
			}else{
				odd+=num;
			}
		
			}
		}
		
		System.out.println("홀수 합 :"+odd+",짝수 합 : "+even+");
	}
}
