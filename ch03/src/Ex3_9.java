class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1�鸸  = 10�� 6����
		int b = 2_000_000;    // 2,000,000   2�鸸  = 10�� 6����
		
		// a*b = 10�� 12����  �׷��� int * int�� int, int�� ������ 10�� 9�����̱⿡ �����÷ο찡 �Ͼ�� ���� ������
		long c = a * b;       // a * b = 2,000,000,000,000 ?

		System.out.println(c);
		
		// long Ÿ������ �� ��ȯ
		c = (long)a * b;
		
		System.out.println(c);
	}
}