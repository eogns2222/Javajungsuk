class Ex5_7 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
		
		// run 버튼 화살표클릭 > run configurations 클릭 > Arguments 클릭 > program arguments에 배열 직접 입력 ex) abc 123 "Hello world"
	}
}