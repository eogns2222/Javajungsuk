class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath(); // MyMath 객체를 생성
		long result1 = mm.add(5L, 3L); // add메서드 호출
		long result2 = mm.subtract(5L, 3L); // subtract메서드 호출
		long result3 = mm.multiply(5L, 3L); // multiply메서드 호출
		double result4 = mm.divide(5L, 3L); // divide메서드 호출
		long result5 = mm.max(5L, 3L);
		mm.printGugudan(3); // 구구단 3단을 출력

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5L, 3L) = " + result5);
	}
 }

 class MyMath {
	void printGugudan(int dan) {
		if(!(2 <= dan && dan <= 9)) {
			return; // 입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
	}
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
		if(a > b) { // 아래와 같이 3항 연산자로 쓰지 않고 이렇게 쓸 경우 참이나 거짓 모든 결과 값에 return이 있어야 에러가 안남 
			return a;
		}else {
			return b;
		}
//		return a > b ? a : b;
	}
 }
