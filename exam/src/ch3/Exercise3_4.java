package ch3;

/*
 * [3-4] �Ʒ��� ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴� . 
		  ���� ���� num�� ���� ��456�� ��400�� , ��111�� ��100�� �̶�� �� �ǰ� �̶�� �� �ȴ� (1)�� �˸��� �ڵ带 �����ÿ�.
 * */

class Exercise3_4 {
	public static void main(String[] args) {
		int num = 456;
		//System.out.println( /* (1) */ );
		System.out.println(num-(num%100));
	}
}
