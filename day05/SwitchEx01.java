class SwitchEx01{
	public static void main(String[] args){
/*	switch-case문
	if문은 조건(case)이 많아지면 {}가 많아져서 코드가 길어짐.
	조건식의 결과 자료형(타입)이 같다면
	switch문으로 만드는것이 코드가 깔끔하고 가독성이 좋다.
	{}를 여러번 사용하지 않기 때문.
	case:~ break;
	일치하는 case가 없다면 default 코드 수행.
	
	switch(변수){
		case :
			실행문;
		case : 
			실행문;
			break;
		case : 
		default :
	}
*/
	String position = "과장";
	
	switch(position){
		case "부장" : 
			System.out.println("800만원");
			break;
		case "과장" : 
			System.out.println("600만원");
			break;
		case "사원":
			System.out.println("300만원");
			break;
		default :
			System.out.println("0원");
	}

	}
}
