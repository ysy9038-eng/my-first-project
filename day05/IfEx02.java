class IfEx02{
	public static void main(String[] args){
		int age = 10;
		//int price;	else 없기 때문에 반드시 초기화 해줘야 함.
		int price = 0;
		int i = 10;
		
		if( age < 8){
			price = 1000;
		}
		if (age<14){
			price=1500;
		}
		if (age<20 || (i+=2) < 0){	// 10<20(T) && (i=i+2) //i의 복합연산자를 사용할때 i는 i+2를 대입한다 // && <->|| 모든조건이 T일 경우 결과가 T, 앞쪽이 T인경우에만 연산을 해야한다.
			price = 2000;
		}
		System.out.println("요금은 "+ price+" 원 입니다.");
		System.out.println(i); //12<->10
	}
}
