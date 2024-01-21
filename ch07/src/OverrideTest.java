class MyPoint3 {
	int x;
	int y;
	// ObjectŬ������  toString()�� �������̵�
	public String toString() {
		return "x:" + x + ", y:" + y;
	}
	
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
	
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class MyPoint3D extends MyPoint3 {
	int z;
	
	// ������ getLocation()�� �������̵�
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z;
	}
	
	
	// ������
	MyPoint3D(int x, int y, int z) {
		super(x, y); // ����Ŭ������ ������ MyPoint3(int x, int y){}�� ȣ��
		this.z = z;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint3D p = new MyPoint3D(3, 5, 7);
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
		System.out.println(p); // ObjectŬ������  toString()�� �������̵��Ͽ� ��°��� �ٲ�
		System.out.println(p.toString()); // ObjectŬ������  toString()�� �������̵��Ͽ� ��°��� �ٲ�
		System.out.println(p.getLocation());
	}

}
