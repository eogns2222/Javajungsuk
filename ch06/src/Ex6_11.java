class Data_1 {
	int value;
	// Data_1() {}; 처음에는 이게 자동 생성됨
}

class Data_2 {
	int value;

//	Data_2() {}; // 기본 생성자, 이게 있어야  compire arror가 발생하지 않음
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생 // 객체 두번째 생성부터는 생성자가 있어야 한다.
	}
}