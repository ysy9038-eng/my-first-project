class WhileEx06{
	public static void main(String[] args){
		// 구구단
		int dan = 2;
		while( dan < 10){
			System.out.println(dan+" 단");
			int num = 1;
			while( num < 10){
				System.out.println(dan+ "X" +num+ " = "+dan*num);
				num++;
			}
			dan++;
			System.out.println();	// 줄바꿈
		}
	}
}
