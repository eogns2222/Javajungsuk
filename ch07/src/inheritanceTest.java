class MyPoint extends Object{ // Object클래스는 모든 클래스의 조상으로 안써줘도 자동으로 들어간다.
	int x;
	int y;
}

//class Circle extends MyPoint { // 상속
//	int r;
//}

class Circle{ // 포함
	MyPoint p = new MyPoint(); // 참조변수의 초기화
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
