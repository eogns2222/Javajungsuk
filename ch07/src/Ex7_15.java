class Outer2 {
	class InstanceInner {
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		
		class LocalInner {
			int iv = 400;
			
			void print() {
				System.out.println(iv);
			}
			
		}
		LocalInner li = new LocalInner(); // 메서드 안에 클래스를 사용하기 위해서는 메서드 안에서 클래스 다음 객체를 생성해줘야 한다.
		li.print();
	}
}

class Ex7_15 {
	public static void main(String[] args) {
		// 인스턴스클래스의 인스턴스를 생성하려면
		// 외부 클래스의 인스턴스를 먼저 생성해야 한다.
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();
		oc.myMethod();
		
		System.out.println("ii.iv : "+ ii.iv);
		System.out.println("Outer2.StaticInner.cv : "+Outer2.StaticInner.cv);
                                     
	   // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : "+ si.iv);
	}
}