package pkg1;

public class MyParent { // ���� �����ڰ� public (���� �̸��� ��ġ�ؾ���)
	private int prv; // ���� Ŭ����
/*(default)*/int dft; // ���� ��Ű��
	protected int prt; // ���� ��Ű��  + �ڼ�(�ٸ� ��Ű��)
	public int pub; // �������� ����.
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
	
}

class MyParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
		System.out.println(p.prv); // ���� (���� Ŭ������ ���)
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK
	}

}
