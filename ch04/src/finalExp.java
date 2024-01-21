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
			System.out.println("1과 100사이의 값을 입력하세요.");
			input = s.nextInt();
			
			if(input > answer) {
				System.out.println("입력한 값이 답보다 큽니다.");
			}else if(input < answer) {
				System.out.println("입력한 값이 답보다 작습니다.");
			}else if(input == answer) {
				System.out.println("시도 횟수는 " + count + "입니다.");
				break;
			}
		}while(true);
		
		System.out.println("정답입니다.");
	}

}
