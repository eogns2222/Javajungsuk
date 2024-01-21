import java.text.*;
import java.util.*;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		date1.clear();
		date2.clear();
		date1.set(2000, 01, 01);
		date2.set(2016, 01, 29);

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("birth day=" + df.format(new Date(date1.getTimeInMillis())));
		System.out.println("today =" + df.format(new Date(date2.getTimeInMillis())));

		int diffrent = (int) ((date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000) / (24 * 60 * 60);

		System.out.println(diffrent + " days");
	}

}
