import java.util.Arrays;
import java.util.Scanner;

import javax.tools.JavaFileObject.Kind;

public class finalTest {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String char[] �� �� ��ȯ
			
			for(int j = 0; j < question.length; j++) {
				int k = (int)(Math.random() * question.length);
				char tmp;
				
				tmp = question[j];
				question[j] = question[k];
				question[k] = tmp;
			}
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			}
		}


	} // end of main

}
