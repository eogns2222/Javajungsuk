import java.util.Scanner;
import java.util.Vector;

public class FinalTest {

	public static void main(String[] args) {
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		Vector list = new Vector(); // Vector 검색결과를 담을
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String input = s.nextLine().trim(); // trim()으로 입력내용에서 공백을 제거
			
			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			
			
			if(list.size() > 0) {
				System.out.println(list);
				list.clear();
			}else {
				System.out.println("일치하는 번호가 없습니다.");
			}

		}
	}

}
