package day08;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 방 개수만 지정한 경우 -> 초기화 : 타입의 기본값
		int[] arr = new int[3];
		System.out.println("참조변수 arr의 값 : "+arr);	//배열 객체의 주소
		System.out.println("정수형 기본값 : "+arr[2]);	//int 타입의 기본값 0
		
		double[] d = new double[3];
		System.out.println("참조변수 d의 값 : "+d);
		System.out.println("실수형 기본값 : "+d[0]);// double 기본값 0.0
		
		boolean[] b = new boolean[2];
		System.out.println("참조변수 b의 값 : "+b);
		System.out.println("논리형 기본값: "+b[1]);	//boolean 기본값 false
		
		String[] s = new String[1];
		System.out.println("참조변수 s의 값 :"+s);
		System.out.println("참조타입 기본값 : "+s[0]); // 참조타입 기본값 null
	}
}
