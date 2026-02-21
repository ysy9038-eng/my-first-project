class ForEx07{
	public static void main(String[] args){
		// 구구단 - 단, 곱해지는수
		int dan;
		int num;
		for(dan=2; dan<=3; dan++){		// 구구단의 단 반복
			for( num=1; num<10; num++){	// 각각의 단에서 곱해지는 수 반복
				System.out.println( dan +"X"+ num+"="+( dan*num ));
			}
			System.out.println();
		}
	}
}
