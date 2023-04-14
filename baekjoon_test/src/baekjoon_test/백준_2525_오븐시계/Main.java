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
		
		System.out.println( m+plus > 60 && plus < 60 );
		
		if( plus/60 >= 1 ) {
			h += plus/60;
		}
		if( m+plus > 60 && plus < 60 ) {
			h++;
		}
		if( h == 24 ) {
			h = 0;
		}
		
		System.out.println( h + " " + m );
		
	}
}
