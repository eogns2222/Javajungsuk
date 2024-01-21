class Car2 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car2() {
		this("white", "auto", 4); // 생성자 this, 클래스 이름 대신 this를 사용(메서드 이름이 같을 경우 this를 안쓰고 Car2로 쓰면 에러)
	}

	Car2(String color) {
		this(color, "auto", 4); // 생성자 this
	}

	Car2(String color, String gearType, int door) {
		this.color = color; // 참조변수 this
		this.gearType = gearType;
		this.door = door;
	}
}
class Ex6_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}