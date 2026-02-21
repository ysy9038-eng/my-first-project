class OperEx03{
	public static void main(String[] args){
		int num = 10;
		int a = 2;
		boolean result = ((num=num+10) < 10) || ((a=a+2) < 10);
						// num += 10			a += 2
						// 20 < 10 -> F		|| 4 < 10 -> T
		System.out.println(result);	// True
		System.out.println(num);	// 20
		System.out.println(a);		// 4
		
	}
}