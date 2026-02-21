class OperEx07{
	public static void main(String[] args){
		// 증감 연산자의 위치 순서
		// 변수 앞 (선증감) - 1순위
		// 변수 뒤 (후증감) - 마지막순위
		int a = 10;
		System.out.println(a++); //출 10, 연11
		System.out.println(++a); //연 12, 출 12
		System.out.println(a++); //출 12, 연 13
		System.out.println(a++); //출 13, 연 14
		System.out.println(++a); //연 15, 출 15
							a++; //연 16
		System.out.println(++a); //연 17, 출 17
		System.out.println(a);	 //출 17
		
		
		int b = 10;
		System.out.println(b--); //출10, 연 9
		System.out.println(--b); //연8, 출 9
		System.out.println(b--); //출8, 연 7
		System.out.println(b--); //출7, 연 6
		System.out.println(--b); //연5, 출 5
							b--; //연4
		System.out.println(--b); //연3, 출 3
		System.out.println(b);   //출3
	}
}
