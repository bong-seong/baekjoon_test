package baekjoon_test.백준_10699_오늘날짜;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String result = sdf.format(today);
		
		System.out.println( result );
		
	}
}
