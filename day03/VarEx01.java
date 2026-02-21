class VarEx01{
	public static void main(String[] args){
		int num1 = 2;
		int num2 = 3;
		int sum = num1 + num2;
		
		System.out.println("변수 num1의 값은 "+num1+"입니다.");
		System.out.println("변수 num2의 값은 "+num2+"입니다.");
		System.out.println("num1+num2의 값은 "+sum+"입니다.");
		
		num1= num1 + 1; //num1 += 1;
		System.out.println("변수 num1 값에 1을 더하면 "+num1+"입니다.");
		
		int num3 = 10;
		int num4 = 20;
		int num5 = num3 + num4;
		System.out.println(num3 + "+" + num4 + " = "+ num5); //결과 10+20=30
		
	}
}
