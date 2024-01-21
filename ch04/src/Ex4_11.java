import java.util.*;

class Ex4_11 {
	public static void main(String[] args) { 

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 별 피라미드
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		int num = 5;
//		
//		for(i = 0; i < num; i++) {
//			for(j = 1; j < num-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(k = 0; k < i*2+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	} // main의 끝
}