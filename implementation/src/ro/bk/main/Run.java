/**
 * 
 */
package ro.bk.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author nvesa
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hi!");
		System.out.println("Is time:" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime()));
		

	}

}
