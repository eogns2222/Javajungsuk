
abstract class Unit2{
	int x, y;
	abstract void move (int x, int y);
	void stop() {System.out.println("����ϴ�.");}
	public String toString() { return "��"; }
}

interface Fightable{ // �������̽��� ��� �޼���� public abstract. (��������)
	void move(int x, int y); // public abstract�� ������
	void attack(Fightable f); // public abstract�� ������
}

class Fighter extends Unit2 implements Fightable{
	// �������̵� ��Ģ: ���� (public)���� ���������ڰ� ������ �ȵȴ�.
	public void move(int x, int y) {
		System.out.println("[" + x + "," + y + "]�� �̵�");
	}; 
	public void attack(Fightable f) {
		System.out.println(f + "�� ����");
	}; 
	
	// �ο� �� �ִ� ��븦 �ҷ��´�.
	Fightable getFightable(){
		Fighter f2 = new Fighter(); // Fighter�� �����ؼ� ��ȯ
		return (Fightable)f2;
	}
}

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f2 = new Fighter();
		Fightable f3 = f2.getFightable();

		Unit2 u = new Fighter(); 
		u.move(100, 200);
//		u.attack(new Fighter()); // Unit2���� attack()�� ��� ȣ��Ұ�
		u.stop();
		
		Fightable f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop(); // Fightable���� stop()�� ��� ȣ��Ұ�
	}

}



