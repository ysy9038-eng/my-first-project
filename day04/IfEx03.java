class IfEx03{
	public static void main(String[] args){
		int age = 12;	// 나이
		int price;		// 요금
		
		if (age<=8){
			price = 1000;
			System.out.println("미취학 아동입니다.");
		}
		if(age<14){
			price=1500;
			System.out.println("초등학생 입니다."); // 초등학생 입니다
		}
		if (age<20){
			price=2000;
			System.out.println("중고등학생 입니다."); // 중고등학생 입니다
		}else{
			price=2500;
			System.out.println("성인 입니다."); 
		}
		System.out.println("요금은"+price+"입니다."); //요금은 2000 입니다
	}
}