package ch3;
/*
 * [3-3] �Ʒ��� ���� num�� ���� ����  �������, ��������, ��0���� ����ϴ� �ڵ��̴�.
     	  ���� ���� �ڸ� �̿��ؼ� (1)�� �˸��� �ڵ带 �����ÿ�.
   [Hint] ���� �����ڸ� �� �� ����϶�.

 * */
class Exercise3_3 {
	public static void main(String[] args) {
		int num = 10;
		//System.out.println( /* (1) */ );
		System.out.println((num > 0 ) ? "���" : (num < 0) ? "����" : "0");
	}
	/* 1. num�� 0���� ũ�� ���
	 * 2. num�� 0���� ������ ����
	 * 3. �� �� �ƴϸ� 0
	*/
}