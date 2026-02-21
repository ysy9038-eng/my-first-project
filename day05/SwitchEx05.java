class SwitchEx05{
	public static void main(String[] args){
		int score = 2;
		String msg = "";
		score *= 100;	//200
		msg = "당신의 점수는 "+score+"점이며 상품은 : ";		//200
		
		switch(score){
			case 400 :
				msg +="TV, ";	// msg = msg+"TV" -> 당신의 점수는 200점이며 상품은 : TV
			case 300:
				msg +="노트북, ";
			case 200 :
				msg +="스마트폰, ";
			case 100 :
				msg += "이어폰";
			break;
			default:
				msg += "꽝!"; 
		}
		System.out.println(msg+"입니다.");
	}
}
