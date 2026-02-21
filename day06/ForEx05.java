class ForEx05{
	public static void main(String[] args){
		// 중첩 for문
		int a;
		for( a=1;a<=5;a++){
			for( int b=1; b<6; b++){
				System.out.println(a + "=="+b);
			}
		}
		// for문 속 for문 2개
		int x;
		for( x=1; x<=5; x++){
			for(int y=1; y<=5; y++){	// 변수 y 사용
				System.out.println(x +"--"+ y);
			}
			for(int y=1; y<=5; y++){	// 변수 y 사용, 영역이 다르기 때문에 가능.
				System.out.println("hello");
			}
		}
		System.out.println();
		
		int c, d;	// 같은 타입변수 한번에 선언 가능
		for(c=1; c<6; c++){
			for(d=1; d<6; d++){		// 영역이 다르기 때문에
				System.out.println(c+" : "+d);
			}
			for(d=1; d<6; d++){		// 영역이 다르기 때문에
				System.out.println(c+" | "+d);
			}
		}
	}
}