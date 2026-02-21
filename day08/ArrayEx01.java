package day08;
/*
	배열
	- 자료형(데이터타입)이 같은 데이터를 여러개 저장할 때 사용.
	- 데이터가 순차적으로 나열된 구조 : 순서대로 관리
	- 배열도 데이터 타입.	예) int[] inaArr;
	배열 선언
		타입 변수명;
		
		자료형[] 배열이름 = new 자료형[개수];
		자료형 배열이름[] = new 자료형[개수];
*/
public class ArrayEx01 {
	public static void main(String[] args) {
		// 배열 생성 
		// 1.선언과 동시에 값 넣음
		// 2.선언 후 값 넣음
		
		// 1.선언 대입(초기화) 동시에 하기
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = {1, 2, 3};	// new int[] 생략 가능, 컴파일러가 new int[] 알아서 처리
		
		// 2. 선언과 대입 따로 하기
		int[] arr3;
		arr3 = new int[] {4, 5, 6}; // new int[] 생략 불가
		
		// 생성할 때 값의 개수만 지정, 값 넣지 않음.
		// 자료형에 따라 기본값으로 초기화 됨.
		int[] arr4 = new int[3];	// 0 0 0
	}
}
