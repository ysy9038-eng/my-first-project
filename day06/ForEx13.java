class ForEx13{
	public static void main(String[] args){
		// 1~20 까지 반복, 3의 배수이면서 짝수만 출력
		for(int i=1; i<=21; i++){	// 1~20 반복
/*			if((i%3 == 0) && (i%2 == 0) ){	// 조건 1) 3의 배수, 조건2) 짝수
				if(i%2 == 0){
					System.out.println(i+"는 3의 배수이면서 짝수 입니다.");
				}
*/
			if(i%3 == 0){ // 조건1) 3의 배수
				if(i%2 == 0)	// 조건2) 짝수
					System.out.println(i+"는 3의 배수이면서 짝수 입니다.");
			}				
			}
			
			
			}
		}