package myPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat fd = new SimpleDateFormat("d/M/YYYY  hh:mm:ss");
		System.out.println(fd.format(d));
		
		
		
		System.out.println(d.toString());
		
	}

}
