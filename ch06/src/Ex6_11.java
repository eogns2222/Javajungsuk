class Data_1 {
	int value;
	// Data_1() {}; ó������ �̰� �ڵ� ������
}

class Data_2 {
	int value;

//	Data_2() {}; // �⺻ ������, �̰� �־��  compire arror�� �߻����� ����
	Data_2(int x) {   // �Ű������� �ִ� ������.
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error�߻� // ��ü �ι�° �������ʹ� �����ڰ� �־�� �Ѵ�.
	}
}