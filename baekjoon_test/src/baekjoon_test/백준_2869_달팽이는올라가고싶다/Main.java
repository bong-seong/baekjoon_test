package baekjoon_test.백준_2869_달팽이는올라가고싶다;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		StringTokenizer st = new StringTokenizer( br.readLine() , " " );
		
	
		int a = Integer.parseInt( st.nextToken() ); // 상수 5
		int b = Integer.parseInt( st.nextToken() ); // 상수 1
		int v = Integer.parseInt( st.nextToken() ); // 6
	
		int day = ( v - b ) / ( a - b ) ;
		
		if( (v-b) % (a-b) != 0 ) {
			day++;
		}
		
		System.out.println( day );
	}
}


