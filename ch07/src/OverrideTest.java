class MyPoint3 {
	int x;
	int y;
	// Object클래스의  toString()을 오버라이딩
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
	
	// 조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z;
	}
	
	
	// 생성자
	MyPoint3D(int x, int y, int z) {
		super(x, y); // 조상클래스의 생성자 MyPoint3(int x, int y){}를 호출
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
		System.out.println(p); // Object클래스의  toString()을 오버라이딩하여 출력값을 바꿈
		System.out.println(p.toString()); // Object클래스의  toString()을 오버라이딩하여 출력값을 바꿈
		System.out.println(p.getLocation());
	}

}
