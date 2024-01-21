class Ex8_7 {
	public static void main(String[] args) {
		throw new Exception();		// Exception을 고의로 발생시킨다. (컴파일에서 에러발생) - try-catch로 반드시 예외처리를 해줘야 한다.
//		throw new RuntimeException();		// Exception을 고의로 발생시킨다. (컴파일에서 에러발생하지 않음)
	}
}