package baekjoon_test.백준_10950_A더하기B마이너스3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int t = Integer.parseInt( br.readLine() );
		
		
		
		for( int i=0; i<t; i++ ) {
			
			StringTokenizer st = new StringTokenizer( br.readLine() , " " );
			
			int a = Integer.parseInt( st.nextToken() );
			int b = Integer.parseInt( st.nextToken() );
			
			System.out.println( a+b );
			
		}
		
	}
}

