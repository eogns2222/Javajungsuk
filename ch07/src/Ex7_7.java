class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		
		Car car2 = (Car)fe;
		FireEngine fe2 = (FireEngine)car2;
//		car2 = (Car)fe2;
		car2.drive();
		
//		Car c = new Car(); // ����� 4���� Car��ü ����  
//		FireEngine fe3 = (FireEngine)c; // ����� 4���� Car��ü�� FireEngineŸ�� fe�� �ּ�����
//		fe3.stop(); // ����. ���� FireEngine�� 5�� ����� ���� Ÿ���ε� �� ���� 4����� ��ü �ּҸ� �޾Ƽ� �����߻� (�߿�)
//		fe3.water(); // ����. ���Ͱ���
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}