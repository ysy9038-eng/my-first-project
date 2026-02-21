class IfEx04{
	public static void main(String[] args){
/*	if-else if문 
	하나의 상황에 조건이 여러개인 경우 사용.
	하나의 조건에 만족하면 이후의 조건은 연산하지 않는다.

*/
	int age = 12;
	int price;
	
	if(age<8){
		price = 1000;
		System.out.println("미취학 아동입니다.");
		}else if(age<14){
			price = 1500;
			System.out.println("초등학생 입니다."); //초등학생 입니다.
			}
			else if(age<20){
				price=2000;
				System.out.println("중고등학생 입니다."); 
			}else{
				price = 2500;
				System.out.println("성인 입니다.");
			}
			System.out.println("요금은 "+price+"원 입니다.");
	} 
}