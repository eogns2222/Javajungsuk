package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
	public void printMembers() {
//		System.out.println(prv); // ����
//		System.out.println(dft); // ����
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
		System.out.println(p.prv); // ���� (���� Ŭ������ ���)
		System.out.println(p.dft); // ���� (��Ű���� ���)
		System.out.println(p.prt); // ���� (��Ű���� ����� �ڼյ� �ƴ�)
		System.out.println(p.pub); // OK
	}

}
