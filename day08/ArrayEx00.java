package day08;

public class ArrayEx00 {}
/*
	기본 타입( primitive Type )
		- 정수5, 실수2, 논리1형과 같이 같은 값 자체를 저장하는 타입.
		- 값이 변수에 직접 저장.
		- 메모리의 스택(stack) 영역에 저장.
		int age = 20; -> 변수와 값 같이 있음.
		- 복사 시 값 자체가 복사됨.
		
	참조 타입(Reference Type)
		- 배열(Array), 클래스(Class), 인터페이스(Interface),..등
		- 변수에 값이 아닌 객체의 주소(참조값)가 들어감.
		- 객체는 힙(heap) 영역에 생성
		- 복사 시 주소만 복사됨.->같은 객체를 가리킴.
		String str = new String ("hello");
		
	Null
		- 참조타입 변수는 객체의 주소를 저장.
		- '아무 객체도 참조하지 않는 상태'를 나타내는 특수한 값.
		- null도 변수에 넣을 수 있다.
		- 변수는 있지만 참조하는 객체가 없음.
	NullPointerException
		- 자바에서 실행 중에 발생하는 오류를 예외(Exception) 라고 부름.
		- 가장 많이 만나는 예외 중 하나.
		- 아무 객체도 참조하지 않는데(null) 사용하려고 할 때 오류!
 */


