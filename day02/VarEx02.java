class VarEx02{
	public static void main(String[] args){
		// 변수 : 오직 하나의 값을 저장하는 저장소
		// 선언 : 데이터타입 변수이름;
		// 대입 : 변수이름 = 값;
		// 선언과 대입 : 데이터타입 변수이름 = 값;
		
		int a; // 변수 a선언
		a = 10;// 대입 (오른쪽의 값을 왼쪽에 대입한다)
		System.out.println( a );
		// 변수 a를 읽는다(사용한다) : 변수 안에 있는 값을 사용한다.
		
		//int a; 변수의 이름은 중복 불가
		// 변수의 이름 길이 제한 없음
		int fjeifjoqfjklqwifjlkfjlas; // 변수 선언
		fjeifjoqfjklqwifjlkfjlas = 20;
		System.out.println( fjeifjoqfjklqwifjlkfjlas );
		
		// 대입 또 가능
		a = 30;
		System.out.println( a );    //마지막에 대입한 값만 남는다
	}
}