package ch3;

/*
 * [3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다 . 
		  만일 변수 num의 값이 ‘456’ ‘400’ , ‘111’ ‘100’ 이라면 이 되고 이라면 이 된다 (1)에 알맞은 코드를 넣으시오.
 * */

class Exercise3_4 {
	public static void main(String[] args) {
		int num = 456;
		//System.out.println( /* (1) */ );
		System.out.println(num-(num%100));
	}
}
