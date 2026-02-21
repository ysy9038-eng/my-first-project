class SwitchEx02{
	public static void main(String[] args){
		int score = 2;
		switch(score*100){
			case 100 : 
				System.out.println("당신의 점수는 100이고, 상품은 자전거 입니다.");
				//break;
			case 200 :
				System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");
				//break;
			case 300 :
				System.out.println("당신의 점수는 300이고, 상품은 노트북 입니다.");
				break;
			case 400 :
				System.out.println("당신의 점수는 400이고, 상품은 자동차 입니다.");
				break;
			default : 
				System.out.println("꽝!");
		}
	}
}