package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method generates random number within the limit
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);			
	}
	/**
	 * This method gets system time in specified format
	 * @return
	 */
	public String getCurrentTime() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd__MM__yy__hh__mm_ss");
		return sdf.format(date);
			
	}

}
