class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		
		Car car2 = (Car)fe;
		FireEngine fe2 = (FireEngine)car2;
//		car2 = (Car)fe2;
		car2.drive();
		
//		Car c = new Car(); // 멤버가 4개인 Car객체 생성  
//		FireEngine fe3 = (FireEngine)c; // 멤버가 4개인 Car객체를 FireEngine타입 fe에 주소전달
//		fe3.stop(); // 에러. 실제 FireEngine는 5개 멤버를 가진 타입인데 더 작은 4개멤버 객체 주소를 받아서 에러발생 (중요)
//		fe3.water(); // 에러. 위와같음
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}