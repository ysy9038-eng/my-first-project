class ForEx01{	//반복문
	public static void main(String[] args){
/*	for문
	가장 많이 사용하는 반복문.
	반복문을 구현하는데 필요한 요소를 함께 작성.
	한줄에 작성하기 때문에 간결, 가독성이 좋음.

	for(①초기식; ②조건식; ③증감식){
		④실행문;
	}
	초기식 - 처음 한번만 실행.
	조건식 - 조건식 검사 -> true이면 실행/false이면 for문 종료.(언제까지 반복할 것인지 구현)-
	증감식 - for문에 사용하는 변수의 값 증가/감소 시킴.
	이때, 수행 순서를 이해하는 것이 중요. ①->②->③->④->②->③->④....조건식 결과가 F일 때까지 반복.
*/
	// hello world 5번 출력 //4보다 같거나 작다 5미만 0까지 하면
	for(int i=1; i<6; i++){
		System.out.println("hello world");
	
	}
	// for문에 사용되는 변수 증/감 출력
	for(int i=0; i<5;i++){
		System.out.println(i);
	}
	
	}
}