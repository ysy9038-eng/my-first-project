class VarEx10{
	public static void main (String[] args){
		//정수형 기본 int 타입 -21억 ~ 21억
		int num;
		num = 3; 
		System.out.println("변수 num의 값은"+ num +" 입니다.");
		
		num = 5;
		System.out.println();
		System.out.println("변수 num의 값을 변경했습니다.");
		System.out.println("변수 num의 값은 "+num+"입니다.");
		// 같은 타입 변수는 한번에 선언 가능 
		int num1, num2;
		num1 = 10;
		num2 = num1;
		System.out.println("변수 num1의 값은 "+num1+" 입니다.");
		System.out.println("변수 num2의 값은 "+num2+" 입니다.");
	}
}