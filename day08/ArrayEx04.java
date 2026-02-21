package day08;

public class ArrayEx04 {
	public static void main(String[] args){
		// 배열[] 선언 : 형태만 다를뿐 변수 선언과 같음.
		// 타입[] 변수명; -> 배열 선언
		// 변수명[인덱스] = 값;-> 대입
		
		int[] arr;
		arr = new int[2];	// 2개의 방, 몇 개의 값이 들어갈 것인지 지정. {}타입에 맞는 값;
	
	// 배열의 값
	System.out.println( arr[1] ); //0
	
	// 값 대입
	arr[0] = 100;
	System.out.println( arr[0] );
	
	arr[0]++;	// 101
	System.out.println( arr[0] );
	System.out.println( arr[0]+10);//101+10
	System.out.println( arr[0]+arr[1] ); //101+0
	System.out.println( ++arr[1] );// 1
	
	arr[1] = arr[0];	// 값의 복사
	System.out.println( arr[1] );
	}
}
