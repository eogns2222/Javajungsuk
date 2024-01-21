class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만  = 10의 6제곱
		int b = 2_000_000;    // 2,000,000   2백만  = 10의 6제곱
		
		// a*b = 10의 12제곱  그러나 int * int는 int, int의 범위는 10의 9제곱이기에 오버플로우가 일어나서 값이 음수값
		long c = a * b;       // a * b = 2,000,000,000,000 ?

		System.out.println(c);
		
		// long 타입으로 형 변환
		c = (long)a * b;
		
		System.out.println(c);
	}
}