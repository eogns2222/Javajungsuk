class MyPoint extends Object{ // ObjectŬ������ ��� Ŭ������ �������� �Ƚ��൵ �ڵ����� ����.
	int x;
	int y;
}

//class Circle extends MyPoint { // ���
//	int r;
//}

class Circle{ // ����
	MyPoint p = new MyPoint(); // ���������� �ʱ�ȭ
	int r;
}


public class inheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 1;
		c.r = 1;
		System.out.println(c.toString());
		System.out.println(c);
		System.out.println("c.x="+c.p.x);
		System.out.println("c.y="+c.p.y);
		System.out.println("c.r="+c.r);
		
	}

}
