package ch3;
/*
 * [3-3] 아래는 변수 num의 값에 따라  ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다.
     	  삼항 연산 자를 이용해서 (1)에 알맞은 코드를 넣으시오.
   [Hint] 삼항 연산자를 두 번 사용하라.

 * */
class Exercise3_3 {
	public static void main(String[] args) {
		int num = 10;
		//System.out.println( /* (1) */ );
		System.out.println((num > 0 ) ? "양수" : (num < 0) ? "음수" : "0");
	}
	/* 1. num이 0보다 크면 양수
	 * 2. num이 0보다 작으면 음수
	 * 3. 둘 다 아니면 0
	*/
}