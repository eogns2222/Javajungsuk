class Ex7_12 { 
	class InstanceInner { // 내부 클래스
		int iv = 100; 
//		static int cv = 100;            // 에러! static변수를 선언할 수 없다. 
		final static int CONST = 100;   // final static은 상수이므로 허용
	} 

   static class StaticInner { // 내부 클래스
		int iv = 200; 
		static int cv = 200;    // static클래스만 static멤버를 정의할 수 있다. 
	} 

	void myMethod() {
		class LocalInner { // 지역 내부 클래스
			int iv = 300; 
//			static int cv = 300;             // 에러! static변수를 선언할 수 없다. 
			final static int CONST = 300;    // final static은 상수이므로 허용 
		} 
	} 

	public static void main(String args[]) { 
		System.out.println(InstanceInner.CONST); 
		System.out.println(StaticInner.cv); 
		System.out.println(LocalInner.CONST); // 에러. 지역 내부 클래스는 메서드 내에서만
	} 
}