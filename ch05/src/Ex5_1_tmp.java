import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가 // ctrl+shift+o 자동으로 필요한 import를 추가해줌

class Ex5_1_tmp {
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3, 4};
		int[] arrS = {1, 0, 3, 4, 2};
		int[][] arr2D = {
				{11, 12},
				{21, 22}
		};
		
		// 일반 배열과 2차원 배열의 출력할때 차이
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {
				{"aaa", "bbb"},
				{"AAA", "BBB"}
		};
		String[][] str2D2 = {
				{"aaa", "bbb"},
				{"AAA", "BBB"}
		};
		
		// 2차원 배열은 == 사용하지 않고 deepEquals를 사용한다.
		System.out.println(str2D == str2D2);
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		// 배열 복사와 범위 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		// 배열 오름차순으로 정리
		Arrays.sort(arrS);
		System.out.println(Arrays.toString(arrS));
	}
}