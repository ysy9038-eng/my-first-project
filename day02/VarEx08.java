class VarEx08{
	public static void main(String[] args){
/*	char 타입
	(-)부호 없는 2byte 정수형
	: 0~ 65,353
	하나의 문자를 저장하는 타입.
	반드시 ''(작은 따옴표) 사용		 예) char c = 'a'; ->97
	문자를 숫자로 저장,출력할 때 문자로 변환.
	'A'-> 65, 'a'-> 97, '0'-> 48
*/
	char c1 = 'A'; //65
	char c2 = 'a'; //97
	System.out.println( "c1="+c1); //A
	System.out.println("c2="+c2);//a
	
	
	char c3 = 66;
	System.out.println( "c3="+3 );
	
	char c4 = 'b'; //98
	System.out.println( "int 타입으로 바꾼 변수 c4="+(int)c4 );
	}
}
