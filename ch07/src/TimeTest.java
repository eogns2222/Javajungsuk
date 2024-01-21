
class Time {
	private int hour;
	private int minute;
	private int second;
	
//	public void setHour(int hour) {
//		if(hour < 0 || hour > 23)) { // ���ǹ��� �巡�� �� alt+shift+m �ϰ� �޼��� �̸��� �����ָ� �Ʒ� �� �޼���ó�� �޼��带 �̾���
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

	private boolean isValidHour(int hour) { // ���� if�������� ���� ������ private
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
