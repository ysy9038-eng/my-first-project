class SwitchEx04{
	public static void main(String[] args){
		int rank = 1;
		char medalColor;
		
		switch(rank){
			case 1 :
				medalColor = '6';
			break;
			case 2 :
				medalColor = 'S';
			break;
			case 3 :
				medalColor = 'B';
			break;
			default:
				medalColor = 'R';
		}
		System.out.println(rank+"등 메달의 색상은"+medalColor+"입니다.");
	}
}