import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰� // ctrl+shift+o �ڵ����� �ʿ��� import�� �߰�����

class Ex5_1_tmp {
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3, 4};
		int[] arrS = {1, 0, 3, 4, 2};
		int[][] arr2D = {
				{11, 12},
				{21, 22}
		};
		
		// �Ϲ� �迭�� 2���� �迭�� ����Ҷ� ����
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
		
		// 2���� �迭�� == ������� �ʰ� deepEquals�� ����Ѵ�.
		System.out.println(str2D == str2D2);
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		// �迭 ����� ���� ����
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		// �迭 ������������ ����
		Arrays.sort(arrS);
		System.out.println(Arrays.toString(arrS));
	}
}