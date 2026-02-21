class LoopEx{	//반복문
	public static void main(String[] args){
/*
	루프는 특정 조건이 만족될때까지 같은 코드 블럭을 반복 실행하는 구조.
	* Java 반복문 종류
	* for문 - 정해진 횟수만큼 반복할 때 사용. : 초기화 -> 조건검사 -> 실행 -> 증감식 -> 조건검사 ->T(실행)/F(for문 끝)
	*while문		- 조건이 참인동안 반복할 때 사용. : 조건검사 -> 실행 ->....
	*do-while문 - 조건과 상관없이 최소 한번 실행, 이후 반복할지 결정. : 실행 -> 조건검사 -> ....
*/		

		//hello world 5번 출력
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		
		// 1~10 까지의 합.
		int sum = 0;
		sum = sum+1;	//sum+=1;
		sum = sum+2;	//sum+=2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10; // 0+1+2+3+4+5+6+7+8+9+10
		System.out.println(sum);
		
		
	}
}