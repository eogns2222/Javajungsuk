
class Time {
	private int hour;
	private int minute;
	private int second;
	
//	public void setHour(int hour) {
//		if(hour < 0 || hour > 23)) { // 조건문을 드래그 후 alt+shift+m 하고 메서드 이름을 정해주면 아래 두 메서드처럼 메서드를 뽑아줌
//			return;
//		}
//		this.hour = hour;
//	}
	
	public void setHour(int hour) {
		if(isValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}

	private boolean isValidHour(int hour) { // 위에 if문에서만 쓰기 때문에 private
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
//		t.hour = -100;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}

}
