package pkg1;

public class MyParent { // 접근 제어자가 public (파일 이름과 일치해야함)
	private int prv; // 같은 클래스
/*(default)*/int dft; // 같은 패키지
	protected int prt; // 같은 패키지  + 자손(다른 패키지)
	public int pub; // 접근제한 없음.
	
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
		System.out.println(p.prv); // 에러 (같은 클래스를 벗어남)
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK
	}

}
