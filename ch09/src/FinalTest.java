import java.util.Scanner;
import java.util.Vector;

public class FinalTest {

	public static void main(String[] args) {
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		Vector list = new Vector(); // Vector �˻������ ����
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String input = s.nextLine().trim(); // trim()���� �Է³��뿡�� ������ ����
			
			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			
			
			if(list.size() > 0) {
				System.out.println(list);
				list.clear();
			}else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}

		}
	}

}
