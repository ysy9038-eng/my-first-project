package day08;

public class ArrayEx02 {
	public static void main(String[] args) {
		// 배열 선언 : 타입[] 변수명;
		// 타입[] 변수명 = new 타입[개수];
		int[] arr = new int[5];	// arr 배열에 들어가는 값의 수
		
		// 참조변수가 가지는 값 = 주소
		System.out.println( arr );
	
	// 배열 사용 -> 변수 사용!
	// 인덱스[] : 배열 요소가 저장된 메모리 위치를 찾아주는 역할.
	// 인덱스의 번호는 0부터 시작.
	// 5개의 값 -> 인덱스 0~4까지 
	
	// 값 대입 -> 변수=값;
	arr[0] = 10; 
	arr[1] = 20;
	arr[2] = 50;
	arr[3] = 30;
	arr[4] = 40;
	// arr[5]= 60;
	
	// 값 사용
	System.out.println( arr[0] );	// 선언할 때 [] 변수명 앞/뒤 가능
	System.out.println( arr[1] );	// 사용할 때 [] 변수명 뒤 사용
	System.out.println( arr[2] );
	System.out.println( arr[3] );
	System.out.println( arr[4] );
	//System.out.println( arr[5]);
	}
	
}
