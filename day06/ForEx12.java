import java.util.Scanner;

class ForEx12{
	public static void main(String[] args){
		// 입력한 값이 양수라면 1부터 값까지 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("양수를 입력하세요 : ");
		int num = scanner.nextInt();	// 사용자 입력 받기
		
		if( num>0 ){
			for( int i=1; i<=num; i++){
				System.out.print(i+" ");	//1 2 3 4 .. num
			}
		}else{	//0보다 작다
			System.out.println("양수를 입력해야합니다.");
		}
	}
}
