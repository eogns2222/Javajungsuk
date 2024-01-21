public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };

		// group�� Ÿ���� Unit[], grop[0], grop[1], grop[2]�� Ÿ���� Unit
		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y); // �̰� �������� ������ ����. group�� UnitŸ���̱⿡ 
	void stop() { /* ���� ��ġ�� ���� */ }
}

class Marine extends Unit { // ����
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* �������� ����Ѵ�. */ }
}

class Tank extends Unit { // ��ũ
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */ }
}

class Dropship extends Unit { // ���ۼ�
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* ���õ� ����� �¿��. */ }
	void unload() { /* ���õ� ����� ������. */ }
}