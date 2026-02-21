class SwitchEx03{
	public static void main(String[] args){
		// 변수 초기화, default 유/무 차이 등등 확인
		char ch = 'A';
		int i=0;
		
		switch(ch){
			case 'A':
				i=90;
				break;
			case 'B' :
				i=80;
				break;
			case 'C':
				i=70;
				break;
			default : //if문에서의 else 와 같은 역할.
				i=50;
				
			System.out.println("당신의 점수는 "+i+" 입니다.");
		}
	}
}
