import javax.print.DocFlavor.INPUT_STREAM;

public class finalExp {

	public static void main(String[] args) {
		
		
		int answer = (int)(Math.random()*100) + 1;
		System.out.println(answer);
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ���.");
			input = s.nextInt();
			
			if(input > answer) {
				System.out.println("�Է��� ���� �亸�� Ů�ϴ�.");
			}else if(input < answer) {
				System.out.println("�Է��� ���� �亸�� �۽��ϴ�.");
			}else if(input == answer) {
				System.out.println("�õ� Ƚ���� " + count + "�Դϴ�.");
				break;
			}
		}while(true);
		
		System.out.println("�����Դϴ�.");
	}

}
