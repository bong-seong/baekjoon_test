package baekjoon_test.백준_2525_오븐시계;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
		int h = Integer.parseInt( st.nextToken() );
		int m = Integer.parseInt( st.nextToken() );
		
		int plus = Integer.parseInt( br.readLine() );
		
		int time = (h*60)+m+plus ;
		
		int hh = time/60;
		int mm = time%60;
		
		if( time >= 1440 ) {
			hh = hh%24 ;
		}
		
		System.out.println( hh + " " + mm );
		
		
		
	}
}
