import java.util.*;

class Ex4_14 {
	public static void main(String[] args) { 
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // ȭ���� ���� �Է¹��� ������ tmp�� ����
		num = Integer.parseInt(tmp);      // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		// 10���� ������ ������ �ϸ� ������ �ڸ��� ��´�.
		while(num!=0) {    
			// num�� 10���� ���� �������� sum�� ����
			sum += num%10; 	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10;   // num = num / 10;  num�� 10���� ���� ���� �ٽ� num�� ����
		}
		
		System.out.println("�� �ڸ����� ��:"+sum);
		
		// ���� while���� for������ ���� ������ ��
//		int num2 = 123456, sum2 = 0; 
//		for(num2 = 123456; num2>0; num2 = num2/10) {
//			System.out.println(num2%10);
//			sum2 += num2%10;
//		}
//		
//		System.out.println(sum2);
	}
}