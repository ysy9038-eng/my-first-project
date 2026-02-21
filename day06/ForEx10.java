class ForEx10{
	public static void main(String[] args){
		// 반복문 속 조건문 <-> 조건문 속 반복문
		for( int i=1; i<=10; i++){
			// for문의 조건식의 결과가 true
			if(i%2 == 0){
				// if문의 조건식의 결과가 true
				System.out.println(i+":짝수");
			}else{
				// if문의 조건식의 결과가 false
				System.out.println(i+":홀수");
			}// if문 종료
		}// for문 종료
	}
}