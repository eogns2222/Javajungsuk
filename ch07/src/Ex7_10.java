public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };

		// group의 타입은 Unit[], grop[0], grop[1], grop[2]의 타입은 Unit
		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y); // 이게 지워지면 에러가 난다. group은 Unit타입이기에 
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}